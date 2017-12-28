package com.sxs.business.biz.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.sxs.business.biz.CustomerProductService;
import com.sxs.business.mapper.CustomerProductMapper;
import com.sxs.business.mapper.TypeProductLogMapper;
import com.sxs.business.mapper.TypeProductMapper;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.bean.TypeProduct;
import com.sxs.common.bean.TypeProductLog;
import com.sxs.common.constats.GlobConts;
import com.sxs.common.enums.OrderStatusEnum;
import com.sxs.common.enums.PrintStatusEnum;
import com.sxs.common.enums.ProductTypeEnum;
import com.sxs.common.enums.StatusEnum;
import com.sxs.common.param.AddProductParam;
import com.sxs.common.param.GetCustomerProductParam;
import com.sxs.common.param.QueryCustomerProductParam;
import com.sxs.common.param.UpdateProductParam;
import com.sxs.common.response.CustomerProductView;
import com.sxs.common.response.PageList;
import com.sxs.common.response.ReturnT;
import com.sxs.common.utils.DateUtils;
import com.sxs.common.utils.ImageEnableUtil;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by hang on 2017/9/25 0025.
 */
@Service
public class CustomerProductServiceImpl implements CustomerProductService {

    @Autowired
    private CustomerProductMapper mapper;
    @Autowired
    private TypeProductMapper typeProductMapper;
    @Autowired
    private TypeProductLogMapper typeProductLogMapper;

    @Override
    public ReturnT add(AddProductParam param) {
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        Gson gson = new Gson();
        if (param.getFileStr() != null && param.getFileStr().size() > 6){
            return new ReturnT().failureData("图片最多只能上传6张！");
        }
        customerProduct.setImgUrl(gson.toJson(param.getFileStr()));
        Date now = new Date();
        if (customerProduct.getOrderTime() == null){
            customerProduct.setOrderTime(DateUtils.formatDate(DateUtils.formatNowDate(DateUtils.FORMAT_YYYYMMDD),DateUtils.FORMAT_YYYYMMDD));
        }
        customerProduct.setOrderStatus(OrderStatusEnum.ONE.getCode());
        if (customerProduct.getDepositAmount().compareTo(BigDecimal.ZERO)>0){
            customerProduct.setOrderStatus(OrderStatusEnum.TWO.getCode());
        }
        customerProduct.setCreateTime(now);
        customerProduct.setUpdateTime(now);
        customerProduct.setStatus(StatusEnum.ENABLE.getCode());
        customerProduct.setOrderNo(DateUtils.formatNowDate(DateUtils.FORMAT_YYYYMMDDHHMMSS));
        mapper.insert(customerProduct);
        List<String> types = new ArrayList<>(3);
        if (param.getTypeProductMap() != null && !"".equals(param.getTypeProductMap())){
            JSONArray array = JSONObject.parseObject(param.getTypeProductMap()).getJSONArray("typeProductMap");
            if(array.size() == 0){
                return new ReturnT().failureData("没有尺寸信息！");
            }
            array.forEach(v -> {
                TypeProduct typeProduct = JSONObject.parseObject(v.toString(),TypeProduct.class);
                typeProduct.setCreateTime(now);
                typeProduct.setUpdateTime(now);
                typeProduct.setCustomerProductId(customerProduct.getId());
                types.add(typeProduct.getType());
                typeProductMapper.insert(typeProduct);
            });
            for(ProductTypeEnum productTypeEnum : ProductTypeEnum.values()){
                if (types.stream().noneMatch(a -> a.equals(productTypeEnum.getCode()))){
                    TypeProduct typeProduct = new TypeProduct();
                    typeProduct.setCreateTime(now);
                    typeProduct.setUpdateTime(now);
                    typeProduct.setType(productTypeEnum.getCode());
                    typeProduct.setCustomerProductId(customerProduct.getId());
                    typeProductMapper.insert(typeProduct);
                }
            }
        } else {
           return new ReturnT().failureData("没有尺寸信息！");
        }
        return new ReturnT().sucessData(customerProduct.getId());
    }

    @Override
    public ReturnT update(UpdateProductParam param) {
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        Date now = new Date();
        customerProduct.setUpdateTime(now);
        if (OrderStatusEnum.ONE.getCode().equals(param.getOrderStatus()) && customerProduct.getDepositAmount() != null && customerProduct.getDepositAmount().compareTo(BigDecimal.ZERO)>0){
            customerProduct.setOrderStatus(OrderStatusEnum.TWO.getCode());
        }else if (param.getDepositAmount() == null || param.getDepositAmount().compareTo(BigDecimal.ZERO) <= 0){
            customerProduct.setOrderStatus(OrderStatusEnum.ONE.getCode());
        }
        final Long customerProductId = customerProduct.getId();
        if (param.getTypeProductMap() != null && !"".equals(param.getTypeProductMap())){
            //历史
            List<TypeProduct> typeProducts = typeProductMapper.selectByProductId(customerProduct.getId());
            JSONArray array = JSONObject.parseObject(param.getTypeProductMap()).getJSONArray("typeProductMap");
            array.forEach(v -> {
                TypeProduct typeProduct = JSONObject.parseObject(v.toString(),TypeProduct.class);
                typeProduct.setCreateTime(now);
                typeProduct.setUpdateTime(now);
                typeProduct.setCustomerProductId(customerProductId);
                //不同才更新历史
                typeProducts.stream().filter(a -> a.getType().equals(typeProduct.getType()) && !a.equals(typeProduct)).forEach(b -> {
                    typeProductMapper.updateByProductId(typeProduct);
                    TypeProductLog log = new TypeProductLog();
                    BeanUtils.copyProperties(b,log);
                    log.setId(null);
                    typeProductLogMapper.insert(log);
                });
                if (typeProducts.stream().noneMatch(a -> a.getType().equals(typeProduct.getType()))){
                    typeProductMapper.insert(typeProduct);
                }
            });
        }
        mapper.updateById(customerProduct);
        return new ReturnT().successDefault();
    }
    @Override
    public ReturnT updateById(UpdateProductParam param) {
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        Date now = new Date();
        customerProduct.setUpdateTime(now);
        mapper.updateById(customerProduct);
        return new ReturnT().successDefault();
    }

    @Override
    public PageHelper.Page<CustomerProduct> queryPcPage(QueryCustomerProductParam param) {
        PageHelper.startPage(param.getPage(),param.getPageSize());
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        //customerProduct.setOrderTime(DateUtils.formatDate(param.getOrderTime(),DateUtils.FORMAT_YYYYMMDD));
        customerProduct.setStatus(StatusEnum.ENABLE.getCode());
        mapper.query(customerProduct);
        return PageHelper.endPage();
    }

    @Override
    public ReturnT<PageList> queryByPage(QueryCustomerProductParam param) {
        ReturnT returnT = new ReturnT();
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        customerProduct.setStatus(StatusEnum.ENABLE.getCode());
        returnT.setData(new PageList<CustomerProduct>(mapper.queryByPage(customerProduct),mapper.count(customerProduct),param.getPage(),param.getPageSize()));
        return returnT.successDefault();
    }

    @Override
    public ReturnT<CustomerProductView> getProductInfo(GetCustomerProductParam param) {
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        CustomerProductView view = mapper.get(customerProduct);
        if (view == null){
            return new ReturnT<>().successDefault();
        }
        view.setTypeProducts(typeProductMapper.selectByProductId(view.getId()));
        List<String> imgList = new ArrayList<>();
        if (view.getImgUrl() != null && !"".equals(view.getImgUrl()) && !"null".equals(view.getImgUrl())){
            List<String> list = new Gson().fromJson(view.getImgUrl(), List.class);
            list.stream().filter(v -> v!= null && ImageEnableUtil.isConnect(GlobConts.IMAGE_ROOT_URL.concat(v))).forEach(v -> {
                imgList.add(GlobConts.IMAGE_ROOT_URL.concat(v));
            });
            view.setImgUrlList(imgList);
        }
        return new ReturnT<>(view).successDefault();
    }

    @Override
    public List<CustomerProduct> printList(Long[] ids) {
        mapper.updatePrintStatusByIds(ids, PrintStatusEnum.TWO.getCode());
        return mapper.queryByIds(ids);
    }

    @Override
    public ReturnT updateOrders(Long[] ids,Integer orderStatus) {
        mapper.updateOrderStatusByIds(ids,orderStatus);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT queryProductLogList(Long customerProductId) {
        ReturnT result = new ReturnT();
        Map map = new HashedMap();
        map.put("list",typeProductLogMapper.queryListByParentId(customerProductId));
        result.setData(map);
        return result.successDefault();
    }

    @Override
    public CustomerProduct print(Long id) {
        mapper.updatePrintStatusById(id, PrintStatusEnum.TWO.getCode());
        CustomerProduct customerProduct = mapper.getById(id);
        List<TypeProduct> list = typeProductMapper.selectByProductId(id);
        list.sort((a,b) -> a.getType().compareTo(b.getType()));
        customerProduct.setTypeProducts(list);
        return customerProduct;
    }
}



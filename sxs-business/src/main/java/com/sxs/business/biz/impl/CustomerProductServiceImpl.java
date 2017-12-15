package com.sxs.business.biz.impl;

import com.google.gson.Gson;
import com.sxs.business.biz.CustomerProductService;
import com.sxs.business.mapper.CustomerProductLogMapper;
import com.sxs.business.mapper.CustomerProductMapper;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.bean.CustomerProductLog;
import com.sxs.common.enums.OrderStatusEnum;
import com.sxs.common.enums.PrintStatusEnum;
import com.sxs.common.enums.StatusEnum;
import com.sxs.common.param.AddProductParam;
import com.sxs.common.param.GetCustomerProductParam;
import com.sxs.common.param.QueryCustomerProductParam;
import com.sxs.common.param.UpdateProductParam;
import com.sxs.common.response.CustomerProductView;
import com.sxs.common.response.PageList;
import com.sxs.common.response.ReturnT;
import com.sxs.common.utils.DateUtils;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
    private CustomerProductLogMapper logMapper;

    @Override
    public ReturnT add(AddProductParam param) {
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        Gson gson = new Gson();
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
        int id = mapper.insert(customerProduct);
        return new ReturnT().sucessData(id);
    }

    @Override
    public ReturnT update(UpdateProductParam param) {
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        Date now = new Date();
        customerProduct.setCreateTime(now);
        customerProduct.setUpdateTime(now);
        if (OrderStatusEnum.ONE.getCode().equals(param.getOrderStatus()) && customerProduct.getDepositAmount() != null && customerProduct.getDepositAmount().compareTo(BigDecimal.ZERO)>0){
            customerProduct.setOrderStatus(OrderStatusEnum.TWO.getCode());
        }else if (param.getDepositAmount() == null || param.getDepositAmount().compareTo(BigDecimal.ZERO) <= 0){
            customerProduct.setOrderStatus(OrderStatusEnum.ONE.getCode());
        }
        /**
         * 保存修改历史
         */
        CustomerProduct log = mapper.getById(customerProduct.getId());
        if (!log.equals(customerProduct)){
            CustomerProductLog logInsert = new CustomerProductLog();
            BeanUtils.copyProperties(log,logInsert);
            logInsert.setCustomerProductId(customerProduct.getId());
            logInsert.setId(null);
            logMapper.insert(logInsert);
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
        return new ReturnT<>(mapper.get(customerProduct)).successDefault();
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
        map.put("list",logMapper.queryListByParentId(customerProductId));
        result.setData(map);
        return result.successDefault();
    }
}



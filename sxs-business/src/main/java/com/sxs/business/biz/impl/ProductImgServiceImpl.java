package com.sxs.business.biz.impl;

import com.sxs.business.biz.ProductImgService;
import com.sxs.business.mapper.ProductImgMapper;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.ProductImg;
import com.sxs.common.enums.StatusEnum;
import com.sxs.common.param.AddProductImgParam;
import com.sxs.common.param.QueryProductImgParam;
import com.sxs.common.param.UpdProductImgParam;
import com.sxs.common.response.ReturnT;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by wangpeng on 2017/2/27.
 */
@Service
public class ProductImgServiceImpl implements ProductImgService {


    @Autowired
    private ProductImgMapper mapper;

    @Override
    public PageHelper.Page<ProductImg> queryProductImgPage(QueryProductImgParam param) {
        PageHelper.startPage(param.getPage(),param.getPageSize());
        ProductImg productImg = new ProductImg();
        BeanUtils.copyProperties(param, productImg);
        productImg.setStatus(StatusEnum.ENABLE.getCode());
        mapper.query(productImg);
        return PageHelper.endPage();
    }

    @Override
    public ReturnT<List<ProductImg>> queryProductImgList(QueryProductImgParam param) {
        ProductImg productImg = new ProductImg();
        BeanUtils.copyProperties(param, productImg);
        productImg.setStatus(StatusEnum.ENABLE.getCode());
        List<ProductImg> list = mapper.query(productImg);
        return new ReturnT<>().sucessData(list);
    }

    @Override
    public ReturnT addProductImg(AddProductImgParam param) {
        ProductImg productImg = new ProductImg();
        BeanUtils.copyProperties(param, productImg);
        productImg.setCreateTime(new Date());
        productImg.setStatus(StatusEnum.ENABLE.getCode());
        mapper.insert(productImg);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT updateProductImg(UpdProductImgParam param) {
        ProductImg productImg = new ProductImg();
        BeanUtils.copyProperties(param, productImg);
        productImg.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective(productImg);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT deleteProductImg(Long id) {
        ProductImg productImg = new ProductImg();
        productImg.setId(id);
        productImg.setStatus(StatusEnum.DISABLED.getCode());
        mapper.updateByPrimaryKeySelective(productImg);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT<ProductImg> getProductImgById(Long id) {
        ProductImg productImg = mapper.selectByPrimaryKey(id);
        if(productImg == null){
            return new ReturnT<>().failureData("数据不存在");
        }
        return new ReturnT<>().sucessData(productImg);
    }
}

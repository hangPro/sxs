package com.sxs.business.biz.impl;

import com.sxs.business.biz.CustomerProductService;
import com.sxs.business.mapper.CustomerProductMapper;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.enums.OrderStatusEnum;
import com.sxs.common.enums.StatusEnum;
import com.sxs.common.param.AddProductParam;
import com.sxs.common.param.QueryCustomerProductParam;
import com.sxs.common.response.ReturnT;
import com.sxs.common.utils.DateUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by hang on 2017/9/25 0025.
 */
@Service
public class CustomerProductServiceImpl implements CustomerProductService {

    @Autowired
    private CustomerProductMapper mapper;

    @Override
    public ReturnT add(AddProductParam param) {
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        Date now = new Date();
        customerProduct.setOrderStatus(OrderStatusEnum.ONE.getCode());
        customerProduct.setCreateTime(now);
        customerProduct.setUpdateTime(now);
        customerProduct.setStatus(StatusEnum.ENABLE.getCode());
        customerProduct.setOrderNo(DateUtils.formatNowDate(DateUtils.FORMAT_YYYYMMDDHHMMSS));
        mapper.insert(customerProduct);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT update(CustomerProduct customerProduct) {
        mapper.updateById(customerProduct);
        return new ReturnT().successDefault();
    }

    @Override
    public PageHelper.Page<CustomerProduct> queryPage(QueryCustomerProductParam param) {
        PageHelper.startPage(param.getPage(),param.getPageSize());
        CustomerProduct customerProduct = new CustomerProduct();
        BeanUtils.copyProperties(param,customerProduct);
        mapper.query(customerProduct);
        return PageHelper.endPage();
    }
}



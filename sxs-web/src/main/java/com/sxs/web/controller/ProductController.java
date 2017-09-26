package com.sxs.web.controller;

import com.sxs.business.biz.CustomerProductService;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.param.AddProductParam;
import com.sxs.common.param.QueryCustomerProductParam;
import com.sxs.common.response.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hang on 2017/9/25 0025.
 */
@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private CustomerProductService customerProductService;

    /**
     * 跳转到列表页面
     * @return
     */
    @RequestMapping("list")
    public ModelAndView listPage(){
        return new ModelAndView("product/product-list");
    }

    @RequestMapping("add")
    public ReturnT add(AddProductParam param){
        return customerProductService.add(param);
    }

    @RequestMapping("update")
    public ReturnT update(CustomerProduct customerProduct){
        return customerProductService.update(customerProduct);
    }

    @RequestMapping("updateOrders")
    public ReturnT updateOrders(CustomerProduct customerProduct){
        return customerProductService.update(customerProduct);
    }

    @RequestMapping("page")
    public PageHelper.Page<CustomerProduct> queryUserPage(QueryCustomerProductParam param){
        return customerProductService.queryPage(param);
    }
}

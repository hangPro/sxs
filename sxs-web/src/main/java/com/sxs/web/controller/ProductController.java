package com.sxs.web.controller;

import com.sxs.business.biz.CustomerProductService;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.param.AddProductParam;
import com.sxs.common.param.GetCustomerProductParam;
import com.sxs.common.param.QueryCustomerProductParam;
import com.sxs.common.param.UpdateProductParam;
import com.sxs.common.response.PageList;
import com.sxs.common.response.ReturnT;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

    /**
     * 跳转到新增页面
     * @return
     */
    @RequestMapping("addPage")
    public ModelAndView addPage(){
        return new ModelAndView("product/product-add");
    }

    @RequestMapping("add")
    public ReturnT add(AddProductParam param){
        return customerProductService.add(param);
    }

    @RequestMapping("update")
    public ReturnT update(UpdateProductParam param){
        return customerProductService.update(param);
    }

    @RequestMapping("updateOrders")
    public ReturnT updateOrders(CustomerProduct customerProduct){
        return null;
    }

    /**
     * 后台管理分页
     * @param param
     * @return
     */
    @RequestMapping("page")
    public PageHelper.Page<CustomerProduct> queryUserPage(QueryCustomerProductParam param){
        return customerProductService.queryPage(param);
    }

    /**
     * android分页
     * @param param
     * @return
     */
    @RequestMapping("queryByPage")
    @ResponseBody
    public ReturnT<PageList> queryByPage(QueryCustomerProductParam param){
        return customerProductService.queryByPage(param);
    }

    /**
     * android获取详情
     * @param param
     * @return
     */
    @RequestMapping("getProductInfo")
    public ReturnT<CustomerProduct> getProductInfo(GetCustomerProductParam param){
        return customerProductService.getProductInfo(param);
    }

    /**
     * android打印详情
     * @param ids
     * @return
     */
    @RequestMapping("print")
    public ModelAndView print(Model model,Long[] ids){
        List<CustomerProduct> list = customerProductService.printList(ids);
        // 报表数据源
        JRDataSource jrDataSource = new JRBeanCollectionDataSource(list);
        // 动态指定报表模板url
        model.addAttribute("url", "/WEB-INF/jasper/MvcIReportExample.jasper");
        model.addAttribute("format", "pdf"); // 报表格式
        model.addAttribute("jrMainDataSource", jrDataSource);

        return new ModelAndView("iReportView");
    }
}

package com.sxs.web.controller;

import com.sxs.business.biz.CustomerProductService;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.constats.GlobConts;
import com.sxs.common.param.AddProductParam;
import com.sxs.common.param.GetCustomerProductParam;
import com.sxs.common.param.QueryCustomerProductParam;
import com.sxs.common.param.UpdateProductParam;
import com.sxs.common.response.PageList;
import com.sxs.common.response.ReturnT;
import com.sxs.common.utils.DateUtils;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by hang on 2017/9/25 0025.
 */
@RestController
@RequestMapping("product")
public class ProductController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductController.class);

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
    public ModelAndView addPage(Long id){
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("id",id);
        return new ModelAndView("product/product-add",data);
    }
    /**
     * 跳转到详情页面
     * @return
     */
    @RequestMapping("infoPage")
    public ModelAndView infoPage(Long id){
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("id",id);
        return new ModelAndView("product/product-info",data);
    }

    @RequestMapping("add")
    public ReturnT add(AddProductParam param, HttpServletRequest request){
        if (param.getFileStr() != null){
            try {
                String path = request.getSession().getServletContext().getRealPath("/");
                BASE64Decoder decoder = new BASE64Decoder();
                byte[] bytes = decoder.decodeBuffer(param.getFileStr());
                if (bytes.length > Integer.MAX_VALUE){
                    return new ReturnT().failureData("图片过大，请重新上传！！！");
                }
                String rootPath =  GlobConts.UPLOAD_IMAGE_FATH.concat(DateUtils.formatNowDate("yyyyMMdd")).concat("/");
                String filePath = rootPath.concat(String.valueOf(System.currentTimeMillis()));
                String uploadPath = path.concat(File.separator).concat(filePath).concat(".jpg");
                FileUtils.writeByteArrayToFile(new File(uploadPath),bytes);
                param.setImgUrl(filePath);
            } catch (IOException e) {
                LOGGER.error("文件上传失败");
                return new ReturnT().failureData("图片上传失败");
            }
        }
        return customerProductService.add(param);
    }

    @RequestMapping("update")
    public ReturnT update(UpdateProductParam param){
        return customerProductService.update(param);
    }

    @RequestMapping("delete")
    public ReturnT delete(UpdateProductParam param){
        return customerProductService.update(param);
    }

    @RequestMapping("updateById")
    public ReturnT updateById(UpdateProductParam param){
        return customerProductService.update(param);
    }

    @RequestMapping("updateOrders")
    public ReturnT updateOrders(@RequestParam(value = "ids[]", required = false) Long[] ids, @RequestParam(value = "orderStatus", required = false) Integer orderStatus){
        return customerProductService.updateOrders(ids,orderStatus);
    }

    /**
     * 后台管理分页
     * @param param
     * @return
     */
    @RequestMapping("queryPcPage")
    public PageHelper.Page<CustomerProduct> queryPcPage(QueryCustomerProductParam param){
        return customerProductService.queryPcPage(param);
    }

    /**
     * android分页
     * @param param
     * @return
     */
    @RequestMapping("queryByPage")
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

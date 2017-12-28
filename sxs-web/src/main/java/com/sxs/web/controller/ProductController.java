package com.sxs.web.controller;

import com.sxs.business.biz.CustomerProductService;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.param.AddProductParam;
import com.sxs.common.param.GetCustomerProductParam;
import com.sxs.common.param.QueryCustomerProductParam;
import com.sxs.common.param.UpdateProductParam;
import com.sxs.common.response.CustomerProductView;
import com.sxs.common.response.PageList;
import com.sxs.common.response.ReturnT;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
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
//        if (param.getFileStr() != null){
//            try {
//                String path = request.getSession().getServletContext().getRealPath("/");
//                BASE64Decoder decoder = new BASE64Decoder();
//                byte[] bytes = decoder.decodeBuffer(param.getFileStr());
//                if (bytes.length > Integer.MAX_VALUE){
//                    return new ReturnT().failureData("图片过大，请重新上传！！！");
//                }
//                String rootPath =  GlobConts.UPLOAD_IMAGE_FATH.concat(DateUtils.formatNowDate("yyyyMMdd")).concat("/");
//                String filePath = rootPath.concat(String.valueOf(System.currentTimeMillis()));
//                String uploadPath = path.concat(File.separator).concat(filePath).concat(".jpg");
//                FileUtils.writeByteArrayToFile(new File(uploadPath),bytes);
//                param.setImgUrl(filePath.concat(".jpg"));
//            } catch (IOException e) {
//                LOGGER.error("文件上传失败");
//                return new ReturnT().failureData("图片上传失败");
//            }
//        }
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
        return customerProductService.updateById(param);
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
    public ReturnT<CustomerProductView> getProductInfo(GetCustomerProductParam param){
        return customerProductService.getProductInfo(param);
    }

    /**
     * android打印详情
     * @param ids
     * @return
     */
    @RequestMapping("printList")
    public ModelAndView printList(Model model,Long[] ids){
        List<CustomerProduct> list = customerProductService.printList(ids);
        // 报表数据源
        JRDataSource jrDataSource = new JRBeanCollectionDataSource(list);
        // 动态指定报表模板url
        model.addAttribute("url", "/WEB-INF/jasper/MvcIReportExample.jasper");
        model.addAttribute("format", "pdf"); // 报表格式
        model.addAttribute("jrMainDataSource", jrDataSource);

        return new ModelAndView("iReportView");
    }

    /**
     * android打印详情
     * @param ids
     * @return
     */
    @RequestMapping("print")
    public ModelAndView print(Model model,Long[] ids){
        CustomerProduct customerProduct = customerProductService.print(ids[0]);
        List<CustomerProduct> list = new ArrayList<>(1);
        list.add(customerProduct);
        // 报表数据源
        JRDataSource jrDataSource = new JRBeanCollectionDataSource(list);
        // 动态指定报表模板url
        model.addAttribute("url", "/WEB-INF/jasper/MvcIReportExample.jasper");
        model.addAttribute("format", "pdf"); // 报表格式
        model.addAttribute("jrMainDataSource", jrDataSource);

        return new ModelAndView("iReportView");
    }

    /**
     * android获取详情
     * @return
     */
    @RequestMapping("getAddress")
    public ReturnT getAddress(){
        List<String> addressList = new ArrayList<>(10);
        addressList.add("罗湖区");
        addressList.add("福田区");
        addressList.add("南山区");
        addressList.add("盐田区");
        addressList.add("宝安区");
        addressList.add("龙岗区");
        ReturnT result = new ReturnT();
        Map map = new HashedMap();
        map.put("list",addressList);
        result.setData(map);
        return result.successDefault();
    }

    /**
     * 获取历史
     * @return
     */
    @RequestMapping("queryProductLogList")
    public ReturnT queryProductLogList(@RequestParam(value = "customerProductId",required = false)Long customerProductId){
        return customerProductService.queryProductLogList(customerProductId);
    }
}

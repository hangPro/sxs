package com.sxs.web.controller;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by hang on 2017/9/19 0019.
 */
@RestController
@RequestMapping("test")
public class TestController {



    @RequestMapping(value = "/report", method = RequestMethod.GET)
    public ModelAndView report(Model model) {
        // 报表数据源
        JRDataSource jrDataSource = new JRBeanCollectionDataSource(JavaBeanPerson.getList());
        // 动态指定报表模板url
        model.addAttribute("url", "/WEB-INF/jasper/MvcIReportExample.jasper");
        model.addAttribute("format", "pdf"); // 报表格式
        model.addAttribute("jrMainDataSource", jrDataSource);

        return new ModelAndView("iReportView"); // 对应jasper-defs.xml中的bean id
    }

}

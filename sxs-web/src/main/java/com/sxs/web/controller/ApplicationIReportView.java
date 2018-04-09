package com.sxs.web.controller;

import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;

import java.util.Map;

/**
 * SpringMVC + IReport整合 视图处理扩展
 * @Author Hang
 * @Create 2017-11-7 21:38:18
 */
public class ApplicationIReportView extends JasperReportsMultiFormatView {
    private JasperReport jasperReport;

    public ApplicationIReportView() {
        super();
    }

    protected JasperPrint fillReport(Map<String, Object> model) throws Exception {
        if (model.containsKey("url")) {
            setUrl(String.valueOf(model.get("url")));
            this.jasperReport = loadReport();
        }

        return super.fillReport(model);
    }

    protected JasperReport getReport() {
        return this.jasperReport;
    }
}
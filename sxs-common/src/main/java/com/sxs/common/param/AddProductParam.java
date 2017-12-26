package com.sxs.common.param;

import com.sxs.common.session.SessionParameter;
import org.hibernate.validator.constraints.NotBlank;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * Created by hang on 2017/2/27.
 */
public class AddProductParam extends SessionParameter {

    /**
     * 姓名
     */
    @NotBlank(message = "客户姓名不能为空！")
    private String customerName;
    /**
     * 手机号
     */
    @NotBlank(message = "客户手机号不能为空！")
    private String customerPhone;
    /**
     * 订单日期
     */
    //@NotNull(message = "订单日期不能为空！")
    private Date orderTime;
    /**
     * 交货日期
     */
    private Date sendTime;
    /**
     * 公司名
     */
    @NotBlank(message = "公司名不能为空！")
    private String companyName;
    /**
     * 淘宝账号
     */
    private String tbAccNo;
    /**
     * 淘宝订单号
     */
    private String tbOrderNo;
    /**
     * 订单编号
     */
    private String orderNo;
    /**
     * 地址
     */
    private String address;
    /**
     * 微信号
     */
    private String wechart;
    /**
     * 性别：1：男，2：女
     */
    private Integer customerSex;
    /**
     * 物料编号
     */
    private String clothNo;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 订单金额
     */
    private BigDecimal orderAmount;
    /**
     * 定金金额
     */
    private BigDecimal depositAmount;
    /**
     * 物料用料
     */
    private String clothDesc;
    /**
     * 是否试身：1：否 2：是
     */
    private Integer bodyStatus;
    /**
     * 是否交货：1：否 2：是
     */
    private Integer sendStatus;

    /**
     * 备注
     */
    private String remark;
    /**
     * 备注
     */
    private String remark1;

    @NotBlank(message = "尺寸信息不能为空！")
    private String typeProductMap;
    /**
     * 图片地址
     */
    private List<String> fileStr;

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getTbAccNo() {
        return tbAccNo;
    }

    public void setTbAccNo(String tbAccNo) {
        this.tbAccNo = tbAccNo;
    }

    public String getTbOrderNo() {
        return tbOrderNo;
    }

    public void setTbOrderNo(String tbOrderNo) {
        this.tbOrderNo = tbOrderNo;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getWechart() {
        return wechart;
    }

    public void setWechart(String wechart) {
        this.wechart = wechart;
    }

    public Integer getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(Integer customerSex) {
        this.customerSex = customerSex;
    }

    public String getClothNo() {
        return clothNo;
    }

    public void setClothNo(String clothNo) {
        this.clothNo = clothNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public BigDecimal getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(BigDecimal depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getClothDesc() {
        return clothDesc;
    }

    public void setClothDesc(String clothDesc) {
        this.clothDesc = clothDesc;
    }

    public Integer getBodyStatus() {
        return bodyStatus;
    }

    public void setBodyStatus(Integer bodyStatus) {
        this.bodyStatus = bodyStatus;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public List<String> getFileStr() {
        return fileStr;
    }

    public void setFileStr(List<String> fileStr) {
        this.fileStr = fileStr;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getTypeProductMap() {
        return typeProductMap;
    }

    public void setTypeProductMap(String typeProductMap) {
        this.typeProductMap = typeProductMap;
    }
}

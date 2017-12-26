package com.sxs.common.response;

import com.sxs.common.bean.PageObjectBase;
import com.sxs.common.bean.TypeProduct;
import com.sxs.common.enums.BodyStatusEnum;
import com.sxs.common.enums.ProductTypeEnum;
import com.sxs.common.enums.SexEnum;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CustomerProductView extends PageObjectBase{
    private Long id;

    /**
     * 类型：衬衫:1、西装:2、马甲:3
     */
    private String type;
    private String typeText = getTypeText();
    /**
     * 姓名
     */
    private String customerName;
    /**
     * 手机号
     */
    private String customerPhone;
    /**
     * 订单日期
     */
    private Date orderTime;
    /**
     * 交货日期
     */
    private Date sendTime;

    private Date createTime;

    private Date updateTime;
    /**
     * 公司名
     */
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
     * 性别：1：男，2：女
     */
    private String customerSexText = getCustomerSexText();
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
     * 备注
     */
    private String clothDesc;
    /**
     * 是否试身：1：否 2：是
     */
    private Integer bodyStatus;
    private String bodyStatusText = getBodyStatusText();
    /**
     * 是否交货：1：否 2：是
     */
    private Integer sendStatus;
    private String sendStatusText = getSendStatusText();

    private Integer status;

    private Integer orderStatus;

    private Integer printStatus;

    private Integer printCount;

    private String remark;

    private String remark1;

    private String imgUrl;

    private List<String> imgUrlList;

    private List<TypeProduct> typeProducts;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypeText() {
        return ProductTypeEnum.getEnumMessageByCode(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getTbAccNo() {
        return tbAccNo;
    }

    public void setTbAccNo(String tbAccNo) {
        this.tbAccNo = tbAccNo == null ? null : tbAccNo.trim();
    }

    public String getTbOrderNo() {
        return tbOrderNo;
    }

    public void setTbOrderNo(String tbOrderNo) {
        this.tbOrderNo = tbOrderNo == null ? null : tbOrderNo.trim();
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getWechart() {
        return wechart;
    }

    public void setWechart(String wechart) {
        this.wechart = wechart == null ? null : wechart.trim();
    }

    public Integer getCustomerSex() {
        return customerSex;
    }

    public String getCustomerSexText() {
        return SexEnum.getEnumMessageByCode(customerSex);
    }

    public void setCustomerSex(Integer customerSex) {
        this.customerSex = customerSex;
    }

    public String getClothNo() {
        return clothNo;
    }

    public void setClothNo(String clothNo) {
        this.clothNo = clothNo == null ? null : clothNo.trim();
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
        this.clothDesc = clothDesc == null ? null : clothDesc.trim();
    }

    public Integer getBodyStatus() {
        return bodyStatus;
    }


    public String getBodyStatusText() {
        return BodyStatusEnum.getEnumMessageByCode(bodyStatus);
    }

    public void setBodyStatus(Integer bodyStatus) {
        this.bodyStatus = bodyStatus;
    }

    public Integer getSendStatus() {
        return sendStatus;
    }

    public String getSendStatusText() {
        return BodyStatusEnum.getEnumMessageByCode(sendStatus);
    }

    public void setSendStatus(Integer sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<String> getImgUrlList() {
        return imgUrlList;
    }

    public void setImgUrlList(List<String> imgUrlList) {
        this.imgUrlList = imgUrlList;
    }

    public Integer getPrintStatus() {
        return printStatus;
    }

    public void setPrintStatus(Integer printStatus) {
        this.printStatus = printStatus;
    }

    public Integer getPrintCount() {
        return printCount;
    }

    public void setPrintCount(Integer printCount) {
        this.printCount = printCount;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public List<TypeProduct> getTypeProducts() {
        return typeProducts;
    }

    public void setTypeProducts(List<TypeProduct> typeProducts) {
        this.typeProducts = typeProducts;
    }
}
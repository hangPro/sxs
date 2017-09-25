package com.sxs.common.bean;

import com.sxs.common.base.BaseParameter;
import com.sxs.common.enums.ProductTypeEnum;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerProduct  extends BaseParameter{
    private Long id;

    private String type;

    private String customerName;

    private String customerPhone;

    private Date orderTime;

    private Date sendTime;

    private Date createTime;

    private Date updateTime;

    private String companyName;

    private String tbAccNo;

    private String tbOrderNo;

    private String orderNo;

    private String address;

    private String wechart;

    private Short customerSex;

    private String clothNo;

    private BigDecimal price;

    private BigDecimal orderAmount;

    private BigDecimal depositAmount;

    private String clothDesc;

    private Short bodyStatus;

    private Short sendStatus;

    private Short status;

    private Integer qycNum;

    private Integer hycNum;

    private Integer kcNum;

    private Integer qcNum;

    private Integer xwNum;

    private Integer ywNum;

    private Integer xbNum;

    private Integer twNum;

    private Integer jkNum;

    private Integer hdNum;

    private Integer xcNum;

    private Integer zdNum;

    private Integer xkNum;

    private Integer kjkNum;

    private Integer sxfNum;

    private Integer zhidNum;

    private Integer xxfNum;

    private Integer qxkNum;

    private Integer hbkNum;

    private Integer xjNum;

    private Integer xgNum;

    private Integer lwNum;

    private Short tbActive;

    private Short ljActive;

    private Short pjActive;

    private Short txActive;

    private Short lk1Active;

    private Short lk2Active;

    private Short lk3Active;

    private Short hzkcActive;

    private Short lbkcActive;

    private Short orderStatus;

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

    public Short getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(Short customerSex) {
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

    public Short getBodyStatus() {
        return bodyStatus;
    }

    public void setBodyStatus(Short bodyStatus) {
        this.bodyStatus = bodyStatus;
    }

    public Short getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(Short sendStatus) {
        this.sendStatus = sendStatus;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }

    public Integer getQycNum() {
        return qycNum;
    }

    public void setQycNum(Integer qycNum) {
        this.qycNum = qycNum;
    }

    public Integer getHycNum() {
        return hycNum;
    }

    public void setHycNum(Integer hycNum) {
        this.hycNum = hycNum;
    }

    public Integer getKcNum() {
        return kcNum;
    }

    public void setKcNum(Integer kcNum) {
        this.kcNum = kcNum;
    }

    public Integer getQcNum() {
        return qcNum;
    }

    public void setQcNum(Integer qcNum) {
        this.qcNum = qcNum;
    }

    public Integer getXwNum() {
        return xwNum;
    }

    public void setXwNum(Integer xwNum) {
        this.xwNum = xwNum;
    }

    public Integer getYwNum() {
        return ywNum;
    }

    public void setYwNum(Integer ywNum) {
        this.ywNum = ywNum;
    }

    public Integer getXbNum() {
        return xbNum;
    }

    public void setXbNum(Integer xbNum) {
        this.xbNum = xbNum;
    }

    public Integer getTwNum() {
        return twNum;
    }

    public void setTwNum(Integer twNum) {
        this.twNum = twNum;
    }

    public Integer getJkNum() {
        return jkNum;
    }

    public void setJkNum(Integer jkNum) {
        this.jkNum = jkNum;
    }

    public Integer getHdNum() {
        return hdNum;
    }

    public void setHdNum(Integer hdNum) {
        this.hdNum = hdNum;
    }

    public Integer getXcNum() {
        return xcNum;
    }

    public void setXcNum(Integer xcNum) {
        this.xcNum = xcNum;
    }

    public Integer getZdNum() {
        return zdNum;
    }

    public void setZdNum(Integer zdNum) {
        this.zdNum = zdNum;
    }

    public Integer getXkNum() {
        return xkNum;
    }

    public void setXkNum(Integer xkNum) {
        this.xkNum = xkNum;
    }

    public Integer getKjkNum() {
        return kjkNum;
    }

    public void setKjkNum(Integer kjkNum) {
        this.kjkNum = kjkNum;
    }

    public Integer getSxfNum() {
        return sxfNum;
    }

    public void setSxfNum(Integer sxfNum) {
        this.sxfNum = sxfNum;
    }

    public Integer getZhidNum() {
        return zhidNum;
    }

    public void setZhidNum(Integer zhidNum) {
        this.zhidNum = zhidNum;
    }

    public Integer getXxfNum() {
        return xxfNum;
    }

    public void setXxfNum(Integer xxfNum) {
        this.xxfNum = xxfNum;
    }

    public Integer getQxkNum() {
        return qxkNum;
    }

    public void setQxkNum(Integer qxkNum) {
        this.qxkNum = qxkNum;
    }

    public Integer getHbkNum() {
        return hbkNum;
    }

    public void setHbkNum(Integer hbkNum) {
        this.hbkNum = hbkNum;
    }

    public Integer getXjNum() {
        return xjNum;
    }

    public void setXjNum(Integer xjNum) {
        this.xjNum = xjNum;
    }

    public Integer getXgNum() {
        return xgNum;
    }

    public void setXgNum(Integer xgNum) {
        this.xgNum = xgNum;
    }

    public Integer getLwNum() {
        return lwNum;
    }

    public void setLwNum(Integer lwNum) {
        this.lwNum = lwNum;
    }

    public Short getTbActive() {
        return tbActive;
    }

    public void setTbActive(Short tbActive) {
        this.tbActive = tbActive;
    }

    public Short getLjActive() {
        return ljActive;
    }

    public void setLjActive(Short ljActive) {
        this.ljActive = ljActive;
    }

    public Short getPjActive() {
        return pjActive;
    }

    public void setPjActive(Short pjActive) {
        this.pjActive = pjActive;
    }

    public Short getTxActive() {
        return txActive;
    }

    public void setTxActive(Short txActive) {
        this.txActive = txActive;
    }

    public Short getLk1Active() {
        return lk1Active;
    }

    public void setLk1Active(Short lk1Active) {
        this.lk1Active = lk1Active;
    }

    public Short getLk2Active() {
        return lk2Active;
    }

    public void setLk2Active(Short lk2Active) {
        this.lk2Active = lk2Active;
    }

    public Short getLk3Active() {
        return lk3Active;
    }

    public void setLk3Active(Short lk3Active) {
        this.lk3Active = lk3Active;
    }

    public Short getHzkcActive() {
        return hzkcActive;
    }

    public void setHzkcActive(Short hzkcActive) {
        this.hzkcActive = hzkcActive;
    }

    public Short getLbkcActive() {
        return lbkcActive;
    }

    public void setLbkcActive(Short lbkcActive) {
        this.lbkcActive = lbkcActive;
    }

    public Short getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Short orderStatus) {
        this.orderStatus = orderStatus;
    }
}
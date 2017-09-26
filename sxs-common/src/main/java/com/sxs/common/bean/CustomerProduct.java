package com.sxs.common.bean;

import com.sxs.common.session.BaseParameter;
import com.sxs.common.enums.ProductTypeEnum;

import java.math.BigDecimal;
import java.util.Date;

public class CustomerProduct  extends BaseParameter{
    private Long id;

    /**
     * 类型：衬衫:1、西装:2、马甲:3
     */
    private String type;
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
    /**
     * 是否交货：1：否 2：是
     */
    private Integer sendStatus;

    private Integer status;
    /**
     * 前衣长
     */
    private Integer qycNum;
    /**
     * 后衣长
     */
    private Integer hycNum;
    /**
     * 裤长
     */
    private Integer kcNum;
    /**
     * 裙长
     */
    private Integer qcNum;
    /**
     * 胸围
     */
    private Integer xwNum;
    /**
     * 腰围
     */
    private Integer ywNum;
    /**
     * 下摆
     */
    private Integer xbNum;
    /**
     * 臀围
     */
    private Integer twNum;
    /**
     * 肩宽
     */
    private Integer jkNum;
    /**
     * 横档
     */
    private Integer hdNum;
    /**
     * 袖长
     */
    private Integer xcNum;
    /**
     * 中档
     */
    private Integer zdNum;
    /**
     * 袖口
     */
    private Integer xkNum;
    /**
     * 裤脚口
     */
    private Integer kjkNum;
    /**
     * 上袖肥
     */
    private Integer sxfNum;
    /**
     * 直档
     */
    private Integer zhidNum;
    /**
     * 下袖肥
     */
    private Integer xxfNum;
    /**
     * 前胸宽
     */
    private Integer qxkNum;
    /**
     * 后背宽
     */
    private Integer hbkNum;
    /**
     * 胸距
     */
    private Integer xjNum;
    /**
     * 胸高
     */
    private Integer xgNum;
    /**
     * 领围
     */
    private Integer lwNum;
    /**
     * 驼背：1：未选择 2：已选择
     */
    private Integer tbActive;
    /**
     * 有肚：1：未选择 2：已选择
     */
    private Integer ydActive;
    /**
     * 溜肩：1：未选择 2：已选择
     */
    private Integer ljActive;
    /**
     * 平肩：1：未选择 2：已选择
     */
    private Integer pjActive;
    /**
     * 挺胸：1：未选择 2：已选择
     */
    private Integer txActive;
    /**
     * 1颗扣：1：未选择 2：已选择
     */
    private Integer lk1Active;
    /**
     * 2颗扣：1：未选择 2：已选择
     */
    private Integer lk2Active;
    /**
     * 3颗扣：1：未选择 2：已选择
     */
    private Integer lk3Active;
    /**
     * 后中开叉：1：未选择 2：已选择
     */
    private Integer hzkcActive;
    /**
     * 俩边开叉：1：未选择 2：已选择
     */
    private Integer lbkcActive;

    private Integer orderStatus;

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

    public void setBodyStatus(Integer bodyStatus) {
        this.bodyStatus = bodyStatus;
    }

    public Integer getSendStatus() {
        return sendStatus;
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

    public Integer getTbActive() {
        return tbActive;
    }

    public void setTbActive(Integer tbActive) {
        this.tbActive = tbActive;
    }

    public Integer getYdActive() {
        return ydActive;
    }

    public void setYdActive(Integer ydActive) {
        this.ydActive = ydActive;
    }

    public Integer getLjActive() {
        return ljActive;
    }

    public void setLjActive(Integer ljActive) {
        this.ljActive = ljActive;
    }

    public Integer getPjActive() {
        return pjActive;
    }

    public void setPjActive(Integer pjActive) {
        this.pjActive = pjActive;
    }

    public Integer getTxActive() {
        return txActive;
    }

    public void setTxActive(Integer txActive) {
        this.txActive = txActive;
    }

    public Integer getLk1Active() {
        return lk1Active;
    }

    public void setLk1Active(Integer lk1Active) {
        this.lk1Active = lk1Active;
    }

    public Integer getLk2Active() {
        return lk2Active;
    }

    public void setLk2Active(Integer lk2Active) {
        this.lk2Active = lk2Active;
    }

    public Integer getLk3Active() {
        return lk3Active;
    }

    public void setLk3Active(Integer lk3Active) {
        this.lk3Active = lk3Active;
    }

    public Integer getHzkcActive() {
        return hzkcActive;
    }

    public void setHzkcActive(Integer hzkcActive) {
        this.hzkcActive = hzkcActive;
    }

    public Integer getLbkcActive() {
        return lbkcActive;
    }

    public void setLbkcActive(Integer lbkcActive) {
        this.lbkcActive = lbkcActive;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }
}
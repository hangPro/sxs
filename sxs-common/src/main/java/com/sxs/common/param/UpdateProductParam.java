package com.sxs.common.param;

import com.sxs.common.session.SessionParameter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;


/**
 * Created by hang on 2017/2/27.
 */
public class UpdateProductParam extends SessionParameter {

    @NotNull(message = "ID不能为空！")
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
    /**
     * 删除状态： 0：正常 1：删除
     */
    private Integer status;
    /**
     * 前衣长
     */
    private Double qycNum;
    /**
     * 后衣长
     */
    private Double hycNum;
    /**
     * 裤长
     */
    private Double kcNum;
    /**
     * 裙长
     */
    private Double qcNum;
    /**
     * 胸围
     */
    private Double xwNum;
    /**
     * 腰围
     */
    private Double ywNum;
    /**
     * 下摆
     */
    private Double xbNum;
    /**
     * 臀围
     */
    private Double twNum;
    /**
     * 肩宽
     */
    private Double jkNum;
    /**
     * 横档
     */
    private Double hdNum;
    /**
     * 袖长
     */
    private Double xcNum;
    /**
     * 中档
     */
    private Double zdNum;
    /**
     * 袖口
     */
    private Double xkNum;
    /**
     * 裤脚口
     */
    private Double kjkNum;
    /**
     * 上袖肥
     */
    private Double sxfNum;
    /**
     * 直档
     */
    private Double zhidNum;
    /**
     * 下袖肥
     */
    private Double xxfNum;
    /**
     * 前胸宽
     */
    private Double qxkNum;
    /**
     * 后背宽
     */
    private Double hbkNum;
    /**
     * 胸距
     */
    private Double xjNum;
    /**
     * 胸高
     */
    private Double xgNum;
    /**
     * 领围
     */
    private Double lwNum;
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
    /**
     * 订单状态
     ONE(1,"未定金"),
     TWO(2,"已定金"),
     THREE(3,"已完结"),
     */
    private Integer orderStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Double getQycNum() {
        return qycNum;
    }

    public void setQycNum(Double qycNum) {
        this.qycNum = qycNum;
    }

    public Double getHycNum() {
        return hycNum;
    }

    public void setHycNum(Double hycNum) {
        this.hycNum = hycNum;
    }

    public Double getKcNum() {
        return kcNum;
    }

    public void setKcNum(Double kcNum) {
        this.kcNum = kcNum;
    }

    public Double getQcNum() {
        return qcNum;
    }

    public void setQcNum(Double qcNum) {
        this.qcNum = qcNum;
    }

    public Double getXwNum() {
        return xwNum;
    }

    public void setXwNum(Double xwNum) {
        this.xwNum = xwNum;
    }

    public Double getYwNum() {
        return ywNum;
    }

    public void setYwNum(Double ywNum) {
        this.ywNum = ywNum;
    }

    public Double getXbNum() {
        return xbNum;
    }

    public void setXbNum(Double xbNum) {
        this.xbNum = xbNum;
    }

    public Double getTwNum() {
        return twNum;
    }

    public void setTwNum(Double twNum) {
        this.twNum = twNum;
    }

    public Double getJkNum() {
        return jkNum;
    }

    public void setJkNum(Double jkNum) {
        this.jkNum = jkNum;
    }

    public Double getHdNum() {
        return hdNum;
    }

    public void setHdNum(Double hdNum) {
        this.hdNum = hdNum;
    }

    public Double getXcNum() {
        return xcNum;
    }

    public void setXcNum(Double xcNum) {
        this.xcNum = xcNum;
    }

    public Double getZdNum() {
        return zdNum;
    }

    public void setZdNum(Double zdNum) {
        this.zdNum = zdNum;
    }

    public Double getXkNum() {
        return xkNum;
    }

    public void setXkNum(Double xkNum) {
        this.xkNum = xkNum;
    }

    public Double getKjkNum() {
        return kjkNum;
    }

    public void setKjkNum(Double kjkNum) {
        this.kjkNum = kjkNum;
    }

    public Double getSxfNum() {
        return sxfNum;
    }

    public void setSxfNum(Double sxfNum) {
        this.sxfNum = sxfNum;
    }

    public Double getZhidNum() {
        return zhidNum;
    }

    public void setZhidNum(Double zhidNum) {
        this.zhidNum = zhidNum;
    }

    public Double getXxfNum() {
        return xxfNum;
    }

    public void setXxfNum(Double xxfNum) {
        this.xxfNum = xxfNum;
    }

    public Double getQxkNum() {
        return qxkNum;
    }

    public void setQxkNum(Double qxkNum) {
        this.qxkNum = qxkNum;
    }

    public Double getHbkNum() {
        return hbkNum;
    }

    public void setHbkNum(Double hbkNum) {
        this.hbkNum = hbkNum;
    }

    public Double getXjNum() {
        return xjNum;
    }

    public void setXjNum(Double xjNum) {
        this.xjNum = xjNum;
    }

    public Double getXgNum() {
        return xgNum;
    }

    public void setXgNum(Double xgNum) {
        this.xgNum = xgNum;
    }

    public Double getLwNum() {
        return lwNum;
    }

    public void setLwNum(Double lwNum) {
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

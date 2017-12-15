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
    private String qycNum;
    /**
     * 后衣长
     */
    private String hycNum;
    /**
     * 裤长
     */
    private String kcNum;
    /**
     * 裙长
     */
    private String qcNum;
    /**
     * 胸围
     */
    private String xwNum;
    /**
     * 肚围
     */
    private String dwNum;
    /**
     * 腰围
     */
    private String ywNum;
    /**
     * 下摆
     */
    private String xbNum;
    /**
     * 臀围
     */
    private String twNum;
    /**
     * 肩宽
     */
    private String jkNum;
    /**
     * 横档
     */
    private String hdNum;
    /**
     * 袖长
     */
    private String xcNum;
    /**
     * 中档
     */
    private String zdNum;
    /**
     * 袖口
     */
    private String xkNum;
    /**
     * 裤脚口
     */
    private String kjkNum;
    /**
     * 上袖肥
     */
    private String sxfNum;
    /**
     * 直档
     */
    private String zhidNum;
    /**
     * 下袖肥
     */
    private String xxfNum;
    /**
     * 前胸宽
     */
    private String qxkNum;
    /**
     * 后背宽
     */
    private String hbkNum;
    /**
     * 胸距
     */
    private String xjNum;
    /**
     * 胸高
     */
    private String xgNum;
    /**
     * 领围
     */
    private String lwNum;
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
     * 平驳领：1：未选择 2：已选择
     */
    private Integer pblActive;
    /**
     * 枪驳领：1：未选择 2：已选择
     */
    private Integer qblActive;
    /**
     * 订单状态
     ONE(1,"未定金"),
     TWO(2,"已定金"),
     THREE(3,"已完结"),
     */
    private Integer orderStatus;
    /**
     * 图片地址
     */
    private String imgUrl;

    private String remark;

    private String remark1;

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

    public String getQycNum() {
        return qycNum;
    }

    public void setQycNum(String qycNum) {
        this.qycNum = qycNum;
    }

    public String getHycNum() {
        return hycNum;
    }

    public void setHycNum(String hycNum) {
        this.hycNum = hycNum;
    }

    public String getKcNum() {
        return kcNum;
    }

    public void setKcNum(String kcNum) {
        this.kcNum = kcNum;
    }

    public String getQcNum() {
        return qcNum;
    }

    public void setQcNum(String qcNum) {
        this.qcNum = qcNum;
    }

    public String getXwNum() {
        return xwNum;
    }

    public void setXwNum(String xwNum) {
        this.xwNum = xwNum;
    }

    public String getYwNum() {
        return ywNum;
    }

    public void setYwNum(String ywNum) {
        this.ywNum = ywNum;
    }

    public String getXbNum() {
        return xbNum;
    }

    public void setXbNum(String xbNum) {
        this.xbNum = xbNum;
    }

    public String getTwNum() {
        return twNum;
    }

    public void setTwNum(String twNum) {
        this.twNum = twNum;
    }

    public String getJkNum() {
        return jkNum;
    }

    public void setJkNum(String jkNum) {
        this.jkNum = jkNum;
    }

    public String getHdNum() {
        return hdNum;
    }

    public void setHdNum(String hdNum) {
        this.hdNum = hdNum;
    }

    public String getXcNum() {
        return xcNum;
    }

    public void setXcNum(String xcNum) {
        this.xcNum = xcNum;
    }

    public String getZdNum() {
        return zdNum;
    }

    public void setZdNum(String zdNum) {
        this.zdNum = zdNum;
    }

    public String getXkNum() {
        return xkNum;
    }

    public void setXkNum(String xkNum) {
        this.xkNum = xkNum;
    }

    public String getKjkNum() {
        return kjkNum;
    }

    public void setKjkNum(String kjkNum) {
        this.kjkNum = kjkNum;
    }

    public String getSxfNum() {
        return sxfNum;
    }

    public void setSxfNum(String sxfNum) {
        this.sxfNum = sxfNum;
    }

    public String getZhidNum() {
        return zhidNum;
    }

    public void setZhidNum(String zhidNum) {
        this.zhidNum = zhidNum;
    }

    public String getXxfNum() {
        return xxfNum;
    }

    public void setXxfNum(String xxfNum) {
        this.xxfNum = xxfNum;
    }

    public String getQxkNum() {
        return qxkNum;
    }

    public void setQxkNum(String qxkNum) {
        this.qxkNum = qxkNum;
    }

    public String getHbkNum() {
        return hbkNum;
    }

    public void setHbkNum(String hbkNum) {
        this.hbkNum = hbkNum;
    }

    public String getXjNum() {
        return xjNum;
    }

    public void setXjNum(String xjNum) {
        this.xjNum = xjNum;
    }

    public String getXgNum() {
        return xgNum;
    }

    public void setXgNum(String xgNum) {
        this.xgNum = xgNum;
    }

    public String getLwNum() {
        return lwNum;
    }

    public void setLwNum(String lwNum) {
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

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getPblActive() {
        return pblActive;
    }

    public void setPblActive(Integer pblActive) {
        this.pblActive = pblActive;
    }

    public Integer getQblActive() {
        return qblActive;
    }

    public void setQblActive(Integer qblActive) {
        this.qblActive = qblActive;
    }

    public String getDwNum() {
        return dwNum;
    }

    public void setDwNum(String dwNum) {
        this.dwNum = dwNum;
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
}

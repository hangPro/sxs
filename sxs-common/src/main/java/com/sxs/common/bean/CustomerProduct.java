package com.sxs.common.bean;

import com.google.gson.Gson;
import com.sxs.common.constats.GlobConts;
import com.sxs.common.enums.BodyStatusEnum;
import com.sxs.common.enums.ProductTypeEnum;
import com.sxs.common.enums.SexEnum;
import com.sxs.common.utils.ImageEnableUtil;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CustomerProduct extends PageObjectBase{
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
    /**
     * 后衣长
     */
    private String hycNum;
    /**
     * 前衣长
     */
    private String qycNum;
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
     * 腰围
     */
    private String ywNum;
    /**
     * 下摆
     */
    private String xbNum;
    /**
     * 肚围
     */
    private String dwNum;
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

    private Integer orderStatus;

    private Integer printStatus;

    private Integer printCount;

    private String remark;

    private String remark1;

    private List<String> imgUrlList;

    private String imgUrl;

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

    public void setImgUrlList(List<String>  imgUrlList) {
        if (imgUrl != null && !"".equals(imgUrl) && !"null".equals(imgUrl)) {
            List<String> list = new Gson().fromJson(imgUrl, List.class);
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) != null && ImageEnableUtil.isConnect(GlobConts.IMAGE_ROOT_URL.concat(list.get(i)))) {
                    list.set(i, GlobConts.IMAGE_ROOT_URL.concat(list.get(i)));
                }
            }
            this.imgUrlList = list;
        }
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
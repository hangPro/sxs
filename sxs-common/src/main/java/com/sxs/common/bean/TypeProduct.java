package com.sxs.common.bean;

import com.sxs.common.enums.ProductTypeEnum;

import java.util.Date;

public class TypeProduct {
    private Long id;

    private String type;

    private String typeText = getTypeText();

    private Date createTime;

    private Date updateTime;

    private String qycNum;

    private String hycNum;

    private String kcNum;

    private String qcNum;

    private String xwNum;

    private String ywNum;

    private String xbNum;

    private String twNum;

    private String jkNum;

    private String hdNum;

    private String xcNum;

    private String zdNum;

    private String xkNum;

    private String kjkNum;

    private String sxfNum;

    private String zhidNum;

    private String xxfNum;

    private String qxkNum;

    private String hbkNum;

    private String xjNum;

    private String xgNum;

    private String lwNum;

    private Short tbActive;

    private Short ljActive;

    private Short pjActive;

    private Short txActive;

    private Short lk1Active;

    private Short lk2Active;

    private Short lk3Active;

    private Short hzkcActive;

    private Short lbkcActive;

    private Short pblActive;

    private Short qblActive;

    private Short ydActive;

    private Long customerProductId;

    private String dwNum;

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
        this.type = type == null ? null : type.trim();
    }

    public String getTypeText() {
        return ProductTypeEnum.getEnumMessageByCode(type);
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

    public String getQycNum() {
        return qycNum;
    }

    public void setQycNum(String qycNum) {
        this.qycNum = qycNum == null ? null : qycNum.trim();
    }

    public String getHycNum() {
        return hycNum;
    }

    public void setHycNum(String hycNum) {
        this.hycNum = hycNum == null ? null : hycNum.trim();
    }

    public String getKcNum() {
        return kcNum;
    }

    public void setKcNum(String kcNum) {
        this.kcNum = kcNum == null ? null : kcNum.trim();
    }

    public String getQcNum() {
        return qcNum;
    }

    public void setQcNum(String qcNum) {
        this.qcNum = qcNum == null ? null : qcNum.trim();
    }

    public String getXwNum() {
        return xwNum;
    }

    public void setXwNum(String xwNum) {
        this.xwNum = xwNum == null ? null : xwNum.trim();
    }

    public String getYwNum() {
        return ywNum;
    }

    public void setYwNum(String ywNum) {
        this.ywNum = ywNum == null ? null : ywNum.trim();
    }

    public String getXbNum() {
        return xbNum;
    }

    public void setXbNum(String xbNum) {
        this.xbNum = xbNum == null ? null : xbNum.trim();
    }

    public String getTwNum() {
        return twNum;
    }

    public void setTwNum(String twNum) {
        this.twNum = twNum == null ? null : twNum.trim();
    }

    public String getJkNum() {
        return jkNum;
    }

    public void setJkNum(String jkNum) {
        this.jkNum = jkNum == null ? null : jkNum.trim();
    }

    public String getHdNum() {
        return hdNum;
    }

    public void setHdNum(String hdNum) {
        this.hdNum = hdNum == null ? null : hdNum.trim();
    }

    public String getXcNum() {
        return xcNum;
    }

    public void setXcNum(String xcNum) {
        this.xcNum = xcNum == null ? null : xcNum.trim();
    }

    public String getZdNum() {
        return zdNum;
    }

    public void setZdNum(String zdNum) {
        this.zdNum = zdNum == null ? null : zdNum.trim();
    }

    public String getXkNum() {
        return xkNum;
    }

    public void setXkNum(String xkNum) {
        this.xkNum = xkNum == null ? null : xkNum.trim();
    }

    public String getKjkNum() {
        return kjkNum;
    }

    public void setKjkNum(String kjkNum) {
        this.kjkNum = kjkNum == null ? null : kjkNum.trim();
    }

    public String getSxfNum() {
        return sxfNum;
    }

    public void setSxfNum(String sxfNum) {
        this.sxfNum = sxfNum == null ? null : sxfNum.trim();
    }

    public String getZhidNum() {
        return zhidNum;
    }

    public void setZhidNum(String zhidNum) {
        this.zhidNum = zhidNum == null ? null : zhidNum.trim();
    }

    public String getXxfNum() {
        return xxfNum;
    }

    public void setXxfNum(String xxfNum) {
        this.xxfNum = xxfNum == null ? null : xxfNum.trim();
    }

    public String getQxkNum() {
        return qxkNum;
    }

    public void setQxkNum(String qxkNum) {
        this.qxkNum = qxkNum == null ? null : qxkNum.trim();
    }

    public String getHbkNum() {
        return hbkNum;
    }

    public void setHbkNum(String hbkNum) {
        this.hbkNum = hbkNum == null ? null : hbkNum.trim();
    }

    public String getXjNum() {
        return xjNum;
    }

    public void setXjNum(String xjNum) {
        this.xjNum = xjNum == null ? null : xjNum.trim();
    }

    public String getXgNum() {
        return xgNum;
    }

    public void setXgNum(String xgNum) {
        this.xgNum = xgNum == null ? null : xgNum.trim();
    }

    public String getLwNum() {
        return lwNum;
    }

    public void setLwNum(String lwNum) {
        this.lwNum = lwNum == null ? null : lwNum.trim();
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

    public Short getPblActive() {
        return pblActive;
    }

    public void setPblActive(Short pblActive) {
        this.pblActive = pblActive;
    }

    public Short getQblActive() {
        return qblActive;
    }

    public void setQblActive(Short qblActive) {
        this.qblActive = qblActive;
    }

    public Short getYdActive() {
        return ydActive;
    }

    public void setYdActive(Short ydActive) {
        this.ydActive = ydActive;
    }

    public Long getCustomerProductId() {
        return customerProductId;
    }

    public void setCustomerProductId(Long customerProductId) {
        this.customerProductId = customerProductId;
    }

    public String getDwNum() {
        return dwNum;
    }

    public void setDwNum(String dwNum) {
        this.dwNum = dwNum == null ? null : dwNum.trim();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TypeProduct that = (TypeProduct) o;

        if (getType() != null ? !getType().equals(that.getType()) : that.getType() != null) return false;
        if (getQycNum() != null ? !getQycNum().equals(that.getQycNum()) : that.getQycNum() != null) return false;
        if (getHycNum() != null ? !getHycNum().equals(that.getHycNum()) : that.getHycNum() != null) return false;
        if (getKcNum() != null ? !getKcNum().equals(that.getKcNum()) : that.getKcNum() != null) return false;
        if (getQcNum() != null ? !getQcNum().equals(that.getQcNum()) : that.getQcNum() != null) return false;
        if (getXwNum() != null ? !getXwNum().equals(that.getXwNum()) : that.getXwNum() != null) return false;
        if (getYwNum() != null ? !getYwNum().equals(that.getYwNum()) : that.getYwNum() != null) return false;
        if (getXbNum() != null ? !getXbNum().equals(that.getXbNum()) : that.getXbNum() != null) return false;
        if (getTwNum() != null ? !getTwNum().equals(that.getTwNum()) : that.getTwNum() != null) return false;
        if (getJkNum() != null ? !getJkNum().equals(that.getJkNum()) : that.getJkNum() != null) return false;
        if (getHdNum() != null ? !getHdNum().equals(that.getHdNum()) : that.getHdNum() != null) return false;
        if (getXcNum() != null ? !getXcNum().equals(that.getXcNum()) : that.getXcNum() != null) return false;
        if (getZdNum() != null ? !getZdNum().equals(that.getZdNum()) : that.getZdNum() != null) return false;
        if (getXkNum() != null ? !getXkNum().equals(that.getXkNum()) : that.getXkNum() != null) return false;
        if (getKjkNum() != null ? !getKjkNum().equals(that.getKjkNum()) : that.getKjkNum() != null) return false;
        if (getSxfNum() != null ? !getSxfNum().equals(that.getSxfNum()) : that.getSxfNum() != null) return false;
        if (getZhidNum() != null ? !getZhidNum().equals(that.getZhidNum()) : that.getZhidNum() != null) return false;
        if (getXxfNum() != null ? !getXxfNum().equals(that.getXxfNum()) : that.getXxfNum() != null) return false;
        if (getQxkNum() != null ? !getQxkNum().equals(that.getQxkNum()) : that.getQxkNum() != null) return false;
        if (getHbkNum() != null ? !getHbkNum().equals(that.getHbkNum()) : that.getHbkNum() != null) return false;
        if (getXjNum() != null ? !getXjNum().equals(that.getXjNum()) : that.getXjNum() != null) return false;
        if (getXgNum() != null ? !getXgNum().equals(that.getXgNum()) : that.getXgNum() != null) return false;
        if (getLwNum() != null ? !getLwNum().equals(that.getLwNum()) : that.getLwNum() != null) return false;
        if (getTbActive() != null ? !getTbActive().equals(that.getTbActive()) : that.getTbActive() != null)
            return false;
        if (getLjActive() != null ? !getLjActive().equals(that.getLjActive()) : that.getLjActive() != null)
            return false;
        if (getPjActive() != null ? !getPjActive().equals(that.getPjActive()) : that.getPjActive() != null)
            return false;
        if (getTxActive() != null ? !getTxActive().equals(that.getTxActive()) : that.getTxActive() != null)
            return false;
        if (getLk1Active() != null ? !getLk1Active().equals(that.getLk1Active()) : that.getLk1Active() != null)
            return false;
        if (getLk2Active() != null ? !getLk2Active().equals(that.getLk2Active()) : that.getLk2Active() != null)
            return false;
        if (getLk3Active() != null ? !getLk3Active().equals(that.getLk3Active()) : that.getLk3Active() != null)
            return false;
        if (getHzkcActive() != null ? !getHzkcActive().equals(that.getHzkcActive()) : that.getHzkcActive() != null)
            return false;
        if (getLbkcActive() != null ? !getLbkcActive().equals(that.getLbkcActive()) : that.getLbkcActive() != null)
            return false;
        if (getPblActive() != null ? !getPblActive().equals(that.getPblActive()) : that.getPblActive() != null)
            return false;
        if (getQblActive() != null ? !getQblActive().equals(that.getQblActive()) : that.getQblActive() != null)
            return false;
        if (getYdActive() != null ? !getYdActive().equals(that.getYdActive()) : that.getYdActive() != null)
            return false;
        if (getCustomerProductId() != null ? !getCustomerProductId().equals(that.getCustomerProductId()) : that.getCustomerProductId() != null)
            return false;
        return getDwNum() != null ? getDwNum().equals(that.getDwNum()) : that.getDwNum() == null;

    }

    @Override
    public int hashCode() {
        int result = getType() != null ? getType().hashCode() : 0;
        result = 31 * result + (getQycNum() != null ? getQycNum().hashCode() : 0);
        result = 31 * result + (getHycNum() != null ? getHycNum().hashCode() : 0);
        result = 31 * result + (getKcNum() != null ? getKcNum().hashCode() : 0);
        result = 31 * result + (getQcNum() != null ? getQcNum().hashCode() : 0);
        result = 31 * result + (getXwNum() != null ? getXwNum().hashCode() : 0);
        result = 31 * result + (getYwNum() != null ? getYwNum().hashCode() : 0);
        result = 31 * result + (getXbNum() != null ? getXbNum().hashCode() : 0);
        result = 31 * result + (getTwNum() != null ? getTwNum().hashCode() : 0);
        result = 31 * result + (getJkNum() != null ? getJkNum().hashCode() : 0);
        result = 31 * result + (getHdNum() != null ? getHdNum().hashCode() : 0);
        result = 31 * result + (getXcNum() != null ? getXcNum().hashCode() : 0);
        result = 31 * result + (getZdNum() != null ? getZdNum().hashCode() : 0);
        result = 31 * result + (getXkNum() != null ? getXkNum().hashCode() : 0);
        result = 31 * result + (getKjkNum() != null ? getKjkNum().hashCode() : 0);
        result = 31 * result + (getSxfNum() != null ? getSxfNum().hashCode() : 0);
        result = 31 * result + (getZhidNum() != null ? getZhidNum().hashCode() : 0);
        result = 31 * result + (getXxfNum() != null ? getXxfNum().hashCode() : 0);
        result = 31 * result + (getQxkNum() != null ? getQxkNum().hashCode() : 0);
        result = 31 * result + (getHbkNum() != null ? getHbkNum().hashCode() : 0);
        result = 31 * result + (getXjNum() != null ? getXjNum().hashCode() : 0);
        result = 31 * result + (getXgNum() != null ? getXgNum().hashCode() : 0);
        result = 31 * result + (getLwNum() != null ? getLwNum().hashCode() : 0);
        result = 31 * result + (getTbActive() != null ? getTbActive().hashCode() : 0);
        result = 31 * result + (getLjActive() != null ? getLjActive().hashCode() : 0);
        result = 31 * result + (getPjActive() != null ? getPjActive().hashCode() : 0);
        result = 31 * result + (getTxActive() != null ? getTxActive().hashCode() : 0);
        result = 31 * result + (getLk1Active() != null ? getLk1Active().hashCode() : 0);
        result = 31 * result + (getLk2Active() != null ? getLk2Active().hashCode() : 0);
        result = 31 * result + (getLk3Active() != null ? getLk3Active().hashCode() : 0);
        result = 31 * result + (getHzkcActive() != null ? getHzkcActive().hashCode() : 0);
        result = 31 * result + (getLbkcActive() != null ? getLbkcActive().hashCode() : 0);
        result = 31 * result + (getPblActive() != null ? getPblActive().hashCode() : 0);
        result = 31 * result + (getQblActive() != null ? getQblActive().hashCode() : 0);
        result = 31 * result + (getYdActive() != null ? getYdActive().hashCode() : 0);
        result = 31 * result + (getCustomerProductId() != null ? getCustomerProductId().hashCode() : 0);
        result = 31 * result + (getDwNum() != null ? getDwNum().hashCode() : 0);
        return result;
    }
}
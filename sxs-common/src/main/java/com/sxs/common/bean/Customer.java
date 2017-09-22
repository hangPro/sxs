package com.sxs.common.bean;

import java.math.BigDecimal;
import java.util.Date;

public class Customer {
    private Long id;

    private String type;

    private String customername;

    private String customerphone;

    private Date ordertime;

    private Date sendtime;

    private Date createtime;

    private Date updatetime;

    private String companyname;

    private String address;

    private String wechart;

    private Short customersex;

    private String clothno;

    private BigDecimal price;

    private BigDecimal orderamount;

    private BigDecimal depositamount;

    private String clothdesc;

    private Short bodystatus;

    private Short sendstatus;

    private Short status;

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

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername == null ? null : customername.trim();
    }

    public String getCustomerphone() {
        return customerphone;
    }

    public void setCustomerphone(String customerphone) {
        this.customerphone = customerphone == null ? null : customerphone.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
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

    public Short getCustomersex() {
        return customersex;
    }

    public void setCustomersex(Short customersex) {
        this.customersex = customersex;
    }

    public String getClothno() {
        return clothno;
    }

    public void setClothno(String clothno) {
        this.clothno = clothno == null ? null : clothno.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOrderamount() {
        return orderamount;
    }

    public void setOrderamount(BigDecimal orderamount) {
        this.orderamount = orderamount;
    }

    public BigDecimal getDepositamount() {
        return depositamount;
    }

    public void setDepositamount(BigDecimal depositamount) {
        this.depositamount = depositamount;
    }

    public String getClothdesc() {
        return clothdesc;
    }

    public void setClothdesc(String clothdesc) {
        this.clothdesc = clothdesc == null ? null : clothdesc.trim();
    }

    public Short getBodystatus() {
        return bodystatus;
    }

    public void setBodystatus(Short bodystatus) {
        this.bodystatus = bodystatus;
    }

    public Short getSendstatus() {
        return sendstatus;
    }

    public void setSendstatus(Short sendstatus) {
        this.sendstatus = sendstatus;
    }

    public Short getStatus() {
        return status;
    }

    public void setStatus(Short status) {
        this.status = status;
    }
}
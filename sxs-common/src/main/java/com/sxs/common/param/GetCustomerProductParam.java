package com.sxs.common.param;

import com.sxs.common.session.WebPageParameter;

import javax.validation.constraints.NotNull;


/**
 * Created by hang on 2017/2/18.
 */
public class GetCustomerProductParam extends WebPageParameter {

    private String customerName;

    @NotNull(message = "ID不能为空！")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}

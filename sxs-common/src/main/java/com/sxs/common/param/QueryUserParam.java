package com.sxs.common.param;

import com.sxs.common.session.WebPageParameter;


/**
 * Created by hang on 2017/2/18.
 */
public class QueryUserParam extends WebPageParameter {

    private String username;
    private String phone;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

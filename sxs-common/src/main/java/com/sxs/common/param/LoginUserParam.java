package com.sxs.common.param;

import com.sxs.common.session.BaseParameter;
import org.hibernate.validator.constraints.NotEmpty;


/**
 * Created by hang on 2017/1/4 0004.
 */
public class LoginUserParam extends BaseParameter {

    private static final long serialVersionUID = 1L;
    /**
     * 登录邮箱
     */
    @NotEmpty(message = "登录账号不能为空")
    private String username;
    /**
     * 登录密码
     */
    @NotEmpty(message = "密码不能为空")
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

package com.sxs.common.session;

import com.sxs.common.bean.SessionUser;

/**
 * Created by wangpeng on 2016/11/7.
 */
public class SessionParameter extends BaseParameter {

    private static final long serialVersionUID = 1L;

    private String accessToken;

    private SessionUser sessionUser;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public SessionUser getSessionUser() {
        return sessionUser;
    }

    public void setSessionUser(SessionUser sessionUser) {
        this.sessionUser = sessionUser;
    }
}

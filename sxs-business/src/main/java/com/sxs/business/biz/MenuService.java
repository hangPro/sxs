package com.sxs.business.biz;

import com.sxs.common.param.QueryMenuParameter;
import com.sxs.common.response.ReturnT;

/**
 * Created by hang on 2017/2/18.
 */
public interface MenuService {

    ReturnT queryUserMenu(QueryMenuParameter queryMenuParameter);

}

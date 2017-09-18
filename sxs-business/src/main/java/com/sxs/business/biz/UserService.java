package com.sxs.business.biz;

import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.User;
import com.sxs.common.param.AddUserParam;
import com.sxs.common.param.QueryUserParam;
import com.sxs.common.param.UpdUserParam;
import com.sxs.common.response.ReturnT;

/**
 * Created by wonpera on 2017/2/18.
 */
public interface UserService {

    PageHelper.Page<User> queryUserPage(QueryUserParam param);

    ReturnT login(String username,String password);

    ReturnT saveUser(AddUserParam param);

    ReturnT updateUser(UpdUserParam param);

    ReturnT deleteUser(Long id);


    ReturnT getUserById(Long id);
}

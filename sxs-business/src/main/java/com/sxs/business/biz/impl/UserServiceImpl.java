package com.sxs.business.biz.impl;

import com.sxs.business.biz.UserService;
import com.sxs.business.mapper.UserMapper;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.User;
import com.sxs.common.constats.GlobConts;
import com.sxs.common.enums.StatusEnum;
import com.sxs.common.param.AddUserParam;
import com.sxs.common.param.QueryUserParam;
import com.sxs.common.param.UpdUserParam;
import com.sxs.common.response.ReturnT;
import com.sxs.common.utils.Base64Util;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by wonpera on 2017/2/18.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public PageHelper.Page<User> queryUserPage(QueryUserParam param) {
        PageHelper.startPage(param.getPage(),param.getPageSize());
        User user = new User();
        BeanUtils.copyProperties(param,user);
        userMapper.query(user);
        return PageHelper.endPage();
    }

    @Override
    public ReturnT login(String username, String password) {
        User user = new User();
        user.setUsername(username);
        List<User> userList = userMapper.query(user);
        if(userList.isEmpty()){
            return new ReturnT().failureData("用户不存在");
        }
        User u = userList.get(0);
        String encodePwd = Base64Util.encodePassWord(password);
        if(!encodePwd.equals(u.getPassword())){
            return new ReturnT().failureData("用户密码错误");
        }
        //登录成功
        return new ReturnT().sucessData(u);
    }



    @Override
    public ReturnT saveUser(AddUserParam param) {
        User user = new User();
        BeanUtils.copyProperties(param,user);
        user.setCreatetime(new Date());
        user.setStatus(StatusEnum.ENABLE.getCode());
        user.setPassword(Base64Util.encodePassWord(GlobConts.DEFUALT_PASSWORD));
        userMapper.insertSelective(user);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT updateUser(UpdUserParam param) {
        User user = new User();
        BeanUtils.copyProperties(param,user);
        userMapper.updateByPrimaryKeySelective(user);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT deleteUser(Long id) {
        userMapper.deleteByPrimaryKey(id);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT getUserById(Long id) {
        return new ReturnT().sucessData(userMapper.selectByPrimaryKey(id));
    }
}

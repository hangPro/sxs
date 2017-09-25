package com.sxs.web.controller;

import com.sxs.business.biz.UserService;
import com.sxs.business.plugin.PageHelper;
import com.sxs.business.session.SessionProcess;
import com.sxs.common.bean.SessionUser;
import com.sxs.common.bean.User;
import com.sxs.common.param.AddUserParam;
import com.sxs.common.param.QueryUserParam;
import com.sxs.common.param.UpdUserParam;
import com.sxs.common.response.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by hang on 2017/2/18.
 */
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private SessionProcess sessionProcess;


    /**
     * 跳转到列表页面
     * @return
     */
    @RequestMapping("list")
    public ModelAndView listPage(){
        return new ModelAndView("user/user-list");
    }


    /**
     * 查询分页列表
     * @param param
     * @return
     */
    @RequestMapping("page")
    public PageHelper.Page<User> queryUserPage(QueryUserParam param){
        return userService.queryUserPage(param);
    }


    /**
     * 用户新增
     * @param param
     * @return
     */
    @RequestMapping(value = "save",method = RequestMethod.POST)
    public ReturnT saveUser(AddUserParam param){
        return userService.saveUser(param);
    }


    /**
     * 用户修改
     * @param param
     * @return
     */
    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ReturnT updateUser(UpdUserParam param){
        return userService.updateUser(param);
    }


    /**
     * 用户删除
     * @param id
     * @return
     */
    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public ReturnT deleteUser(@RequestParam(value = "id")Long id){
        return userService.deleteUser(id);
    }


    /**
     * 登陆
     * @param username
     * @param password
     * @param response
     * @return
     */
    @RequestMapping("login")
    public ReturnT login(@RequestParam(value = "username")String username,
                         @RequestParam(value = "password")String password, HttpServletResponse response){
        ReturnT returnT = userService.login(username,password);
        if (!returnT.isSuccess()) {
            return returnT;
        }
        Object data = returnT.getData();
        SessionUser sessionUser = new SessionUser();
        User user = (User) data;
        sessionUser.setUserId(user.getId());
        sessionUser.setUserName(user.getUsername());
        sessionUser.setPhone(user.getPhone());
        String token = sessionProcess.login(sessionUser, response, 60 * 60 * 24 * 7 * 1000L);
        return new ReturnT().sucessData(token);
    }


    @RequestMapping("getUserById")
    public ReturnT getUserById(@RequestParam(value = "id")Long id){
        return userService.getUserById(id);
    }
}

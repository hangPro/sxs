package com.sxs.web.controller;

import com.sxs.business.biz.MenuService;
import com.sxs.common.bean.SessionUser;
import com.sxs.common.param.QueryMenuParameter;
import com.sxs.common.response.ReturnT;
import com.sxs.common.utils.DkyUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by hang on 2017/2/18.
 */
@RestController
public class IndexController {


    @Autowired
    private MenuService menuService;


    @RequestMapping("/index")
    public ModelAndView index(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @RequestMapping("/center")
    public ModelAndView center(){
        ModelAndView modelAndView = new ModelAndView("center");
        return modelAndView;
    }


    @RequestMapping("login")
    public ModelAndView loginPage(){
        ModelAndView modelAndView = new ModelAndView("login");
        return modelAndView;
    }

    @RequestMapping("/index/getSessionUser")
    public ReturnT getSessionUser(HttpServletRequest request){
        SessionUser user = DkyUtils.getCurrentUser();
        if(user == null){
            return new ReturnT().failureData("用户未登录");
        }
        return new ReturnT().sucessData(user);
    }


    @RequestMapping("index/menu")
    public ReturnT menu(QueryMenuParameter parameter){
        return menuService.queryUserMenu(parameter);
    }

    @RequestMapping(value = "index/logout")
    public ReturnT logout(HttpServletRequest request){
        request.getSession().invalidate();
        return new ReturnT().successDefault();
    }


}

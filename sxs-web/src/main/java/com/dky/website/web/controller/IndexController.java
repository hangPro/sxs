package com.dky.website.web.controller;

import com.dky.website.business.biz.MenuService;
import com.dky.website.common.bean.User;
import com.dky.website.common.constats.GlobConts;
import com.dky.website.common.param.QueryMenuParameter;
import com.dky.website.common.response.ReturnT;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by wonpera on 2017/2/18.
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
        User user = (User)
                request.getSession().getAttribute(GlobConts.CURRENT_SESSION_KEY);
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

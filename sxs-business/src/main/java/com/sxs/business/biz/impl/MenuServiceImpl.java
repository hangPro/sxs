package com.sxs.business.biz.impl;

import com.google.common.collect.Lists;
import com.sxs.business.biz.MenuService;
import com.sxs.business.mapper.MenuMapper;
import com.sxs.common.bean.Menu;
import com.sxs.common.bean.SessionUser;
import com.sxs.common.param.QueryMenuParameter;
import com.sxs.common.response.MenuView;
import com.sxs.common.response.ReturnT;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hang on 2017/2/18.
 */
@Service
public class MenuServiceImpl implements MenuService {


    @Autowired
    private MenuMapper menuMapper;

    @Override
    public ReturnT queryUserMenu(QueryMenuParameter queryMenuParameter) {
        SessionUser sessionUser = queryMenuParameter.getSessionUser();
        if(sessionUser  == null){
            //return new ReturnT().failureData("未登录");
            sessionUser = new SessionUser();
            sessionUser.setUserName("admin");
            sessionUser.setUserId(1l);
        }
        List<MenuView> list = queryMenuViewByUser(sessionUser.getUserId(),0l);
        return new ReturnT().sucessData(list);
    }


    /**
     * 递归查询菜单以及下属菜单
     * @param userId
     * @param parentId
     * @return
     */
    private List<MenuView> queryMenuViewByUser(Long userId,Long parentId){
        List<MenuView> list = Lists.newArrayList();
        List<Menu> menuList = menuMapper.queryUserMenuWithParent(userId,parentId);
        if(menuList != null && menuList.size() > 0){
            for (Menu menu  : menuList){
                MenuView menuView = new MenuView();
                BeanUtils.copyProperties(menu, menuView);
                List<MenuView> children = queryMenuViewByUser(userId,menuView.getMenuid());
                if(children != null && children.size() > 0){
                    menuView.setChildren(children);
                }
                list.add(menuView);
            }
        }
        return list;
    }
}

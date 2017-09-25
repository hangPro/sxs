package com.sxs.business.biz.impl;

import com.sxs.business.biz.FrontMenuService;
import com.sxs.business.mapper.FrontMenuMapper;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.FrontMenu;
import com.sxs.common.enums.StatusEnum;
import com.sxs.common.param.AddFrountMenuParam;
import com.sxs.common.param.QueryFrontMenuParam;
import com.sxs.common.param.UpdFrontMenuParam;
import com.sxs.common.response.ReturnT;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by hang on 2017/2/25.
 */
@Service
public class FrontMenuServiceImpl implements FrontMenuService {

    @Autowired
    private FrontMenuMapper frontMenuMapper;

    @Override
    public PageHelper.Page<FrontMenu> queryFMenuPage(QueryFrontMenuParam param) {
        PageHelper.startPage(param.getPage(),param.getPageSize());
        FrontMenu frontMenu = new FrontMenu();
        BeanUtils.copyProperties(param,frontMenu);
        frontMenu.setStatus(StatusEnum.ENABLE.getCode());
        frontMenu.putExtendedParameterValue("sidx","type,ordered");
        frontMenu.putExtendedParameterValue("sord","asc");
        frontMenuMapper.query(frontMenu);
        return PageHelper.endPage();
    }

    @Override
    public ReturnT<List<FrontMenu>> queryFMenuList(QueryFrontMenuParam param) {
        FrontMenu frontMenu = new FrontMenu();
        BeanUtils.copyProperties(param,frontMenu);
        frontMenu.setStatus(StatusEnum.ENABLE.getCode());
        List<FrontMenu> list = frontMenuMapper.query(frontMenu);
        return new ReturnT<>().sucessData(list);
    }

    @Override
    public ReturnT addFMenu(AddFrountMenuParam param) {
        FrontMenu frontMenu = new FrontMenu();
        BeanUtils.copyProperties(param,frontMenu);
        frontMenu.setStatus(StatusEnum.ENABLE.getCode());
        frontMenu.setCreateTime(new Date());
        frontMenuMapper.insertSelective(frontMenu);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT updateFMenu(UpdFrontMenuParam param) {
        FrontMenu frontMenu = new FrontMenu();
        BeanUtils.copyProperties(param,frontMenu);
        frontMenu.setUpdateTime(new Date());
        frontMenuMapper.updateByPrimaryKeySelective(frontMenu);
        return new ReturnT().successDefault();
    }

    @Override
    public ReturnT deleteFMenu(Long id) {
        FrontMenu frontMenu = new FrontMenu();
        frontMenu.setId(id);
        frontMenu.setStatus(StatusEnum.DISABLED.getCode());
        frontMenuMapper.updateByPrimaryKeySelective(frontMenu);
        return  new ReturnT().successDefault();
    }

    @Override
    public ReturnT<FrontMenu> getFMenuById(Long id) {
        return new ReturnT<>().sucessData(frontMenuMapper.selectByPrimaryKey(id));
    }

}

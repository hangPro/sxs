package com.sxs.web.controller;

import com.sxs.business.biz.ShowService;
import com.sxs.business.plugin.PageHelper;
import com.sxs.common.param.AddShowParam;
import com.sxs.common.param.QueryFrontShowParam;
import com.sxs.common.param.UpdShowParam;
import com.sxs.common.response.ReturnT;
import com.sxs.common.response.ShowVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by wonpera on 2017/3/6.
 */
@RestController
@RequestMapping("show")
public class ShowController {

    @Autowired
    private ShowService showService;


    @RequestMapping("list")
    public ModelAndView getShowPage(){
        return new ModelAndView("show/show-list");
    }


    @RequestMapping("page")
    public PageHelper.Page<ShowVo> queryShowPage(QueryFrontShowParam param){
        return showService.queryShowPage(param);
    }

    @RequestMapping(value = "add",method = RequestMethod.POST)
    public ReturnT addShow(AddShowParam param){
        return showService.addShow(param);
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public ReturnT updateShow(UpdShowParam param){
        return showService.updateShow(param);
    }

    @RequestMapping(value = "delete",method = RequestMethod.POST)
    public ReturnT deleteShow(@RequestParam(value = "id")Long id){
        return showService.deleteShow(id);
    }

    @RequestMapping(value = "getShowById")
    public ReturnT getShowById(@RequestParam(value = "id")Long id){
        return showService.getShowById(id);
    }

    @RequestMapping(value = "getShowBySeasonid")
    public ReturnT getShowVoBySeansonId(@RequestParam(value = "showseason")String showseason){
        return showService.getShowVoBySeansonId(showseason);
    }
}

package com.sxs.business.biz;

import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.FrontMenu;
import com.sxs.common.param.AddFrountMenuParam;
import com.sxs.common.param.QueryFrontMenuParam;
import com.sxs.common.param.UpdFrontMenuParam;
import com.sxs.common.response.ReturnT;

import java.util.List;

/**
 * Created by hang on 2017/2/25.
 */
public interface FrontMenuService {

    PageHelper.Page<FrontMenu> queryFMenuPage(QueryFrontMenuParam param);

    ReturnT<List<FrontMenu>> queryFMenuList(QueryFrontMenuParam param);

    ReturnT addFMenu(AddFrountMenuParam param);

    ReturnT updateFMenu(UpdFrontMenuParam param);

    ReturnT deleteFMenu(Long id);

    ReturnT<FrontMenu> getFMenuById(Long id);
}

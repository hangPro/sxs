package com.sxs.business.biz;

import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.Show;
import com.sxs.common.param.AddShowParam;
import com.sxs.common.param.QueryFrontShowParam;
import com.sxs.common.param.UpdShowParam;
import com.sxs.common.response.ReturnT;
import com.sxs.common.response.ShowPageView;
import com.sxs.common.response.ShowVo;


/**
 * Created by hang on 2017/2/24.
 */
public interface ShowService {

    ReturnT<ShowPageView> getShowImg(QueryFrontShowParam param);

    PageHelper.Page<ShowVo> queryShowPage(QueryFrontShowParam param);

    ReturnT addShow(AddShowParam param);

    ReturnT updateShow(UpdShowParam param);

    ReturnT deleteShow(Long id);

    ReturnT<Show> getShowById(Long id);

    ReturnT<ShowVo> getShowVoBySeansonId(String showseason);
}

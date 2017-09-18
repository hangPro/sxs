package com.sxs.business.mapper;

import com.sxs.common.bean.Show;
import com.sxs.common.bean.ShowGroupSeason;
import com.sxs.common.response.ShowView;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisRepository
public interface ShowMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Show record);

    int insertSelective(Show record);

    Show selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Show record);

    int updateByPrimaryKey(Show record);

    List<ShowView> getShowViewList(@Param("seasonId")Long seasonId);

    List<ShowView> getShowViewListByMenuId(@Param("seasonId")Long seasonId);

    List<ShowView> queryOldShowList(@Param("seasonId")Long seasonId);

    List<Show> query(Show show);

    List<ShowGroupSeason> queryGroupBySeason(Show show);
}
package com.sxs.business.mapper;

import com.sxs.common.bean.Dictionary;

import java.util.List;

@MyBatisRepository
public interface DictionaryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Dictionary record);

    int insertSelective(Dictionary record);

    Dictionary selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);

    List<Dictionary> query(Dictionary dictionary);
}
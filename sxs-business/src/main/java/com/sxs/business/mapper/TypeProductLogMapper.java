package com.sxs.business.mapper;

import com.sxs.common.bean.TypeProductLog;

import java.util.List;

@MyBatisRepository
public interface TypeProductLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TypeProductLog record);

    int insertSelective(TypeProductLog record);

    TypeProductLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TypeProductLog record);

    int updateByPrimaryKey(TypeProductLog record);

    List<TypeProductLog> queryListByParentId(Long customerProductId);
}
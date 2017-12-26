package com.sxs.business.mapper;

import com.sxs.common.bean.TypeProduct;

import java.util.List;
@MyBatisRepository
public interface TypeProductMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TypeProduct record);

    int insertSelective(TypeProduct record);

    List<TypeProduct> selectByProductId(Long customerProductId);

    TypeProduct selectByPrimaryKey(Long id);

    int updateByProductId(TypeProduct record);
}
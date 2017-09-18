package com.sxs.business.mapper;

import com.sxs.common.bean.User;

import java.util.List;


@MyBatisRepository
public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> query(User user);
}
package com.sxs.business.mapper;

import com.sxs.common.bean.CustomerProductLog;
import com.sxs.common.bean.CustomerProductLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisRepository
public interface CustomerProductLogMapper {
    int deleteByExample(CustomerProductLogExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CustomerProductLog record);

    int insertSelective(CustomerProductLog record);

    List<CustomerProductLog> selectByExample(CustomerProductLogExample example);

    CustomerProductLog selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CustomerProductLog record, @Param("example") CustomerProductLogExample example);

    int updateByExample(@Param("record") CustomerProductLog record, @Param("example") CustomerProductLogExample example);

    int updateByPrimaryKeySelective(CustomerProductLog record);

    int updateByPrimaryKey(CustomerProductLog record);

    List<CustomerProductLog> queryListByParentId(Long customerProductId);
}
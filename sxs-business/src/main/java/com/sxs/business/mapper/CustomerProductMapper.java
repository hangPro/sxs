package com.sxs.business.mapper;

import com.sxs.common.bean.CustomerProduct;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisRepository
public interface CustomerProductMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CustomerProduct record);

    CustomerProduct selectByPrimaryKey(Long id);

    CustomerProduct get(CustomerProduct record);

    int updateById(CustomerProduct record);

    List<CustomerProduct> query(CustomerProduct record);

    List<CustomerProduct> queryByPage(CustomerProduct record);

    int count(CustomerProduct record);

    List<CustomerProduct> queryByIds(@Param("ids")Long[] ids);
}
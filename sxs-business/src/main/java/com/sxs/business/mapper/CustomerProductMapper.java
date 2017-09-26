package com.sxs.business.mapper;

import com.sxs.common.bean.CustomerProduct;
import java.util.List;

@MyBatisRepository
public interface CustomerProductMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CustomerProduct record);

    CustomerProduct selectByPrimaryKey(Long id);

    //CustomerProduct get(CustomerProduct record);

    int updateById(CustomerProduct record);

    List<CustomerProduct> query(CustomerProduct record);
}
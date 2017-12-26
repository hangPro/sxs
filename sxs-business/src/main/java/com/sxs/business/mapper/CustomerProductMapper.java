package com.sxs.business.mapper;

import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.response.CustomerProductView;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@MyBatisRepository
public interface CustomerProductMapper {

    int deleteByPrimaryKey(Long id);

    int insert(CustomerProduct record);

    CustomerProduct selectByPrimaryKey(Long id);

    CustomerProductView get(CustomerProduct record);

    CustomerProduct getById(Long id);

    int updateById(CustomerProduct record);

    List<CustomerProduct> query(CustomerProduct record);

    List<CustomerProduct> queryByPage(CustomerProduct record);

    int count(CustomerProduct record);

    List<CustomerProduct> queryByIds(@Param("ids")Long[] ids);

    int updateOrderStatusByIds(@Param("ids")Long[] ids,@Param("orderStatus")Integer orderStatus);

    int updatePrintStatusByIds(@Param("ids")Long[] ids,@Param("printStatus")Integer printStatus);

    int updatePrintStatusById(@Param("id")Long id,@Param("printStatus")Integer printStatus);
}
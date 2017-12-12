package com.sxs.business.biz;

import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.param.AddProductParam;
import com.sxs.common.param.GetCustomerProductParam;
import com.sxs.common.param.QueryCustomerProductParam;
import com.sxs.common.param.UpdateProductParam;
import com.sxs.common.response.CustomerProductView;
import com.sxs.common.response.PageList;
import com.sxs.common.response.ReturnT;

import java.util.List;

/**
 * Created by hang on 2017/9/25 0025.
 */
public interface CustomerProductService {

    ReturnT add(AddProductParam param);

    ReturnT update(UpdateProductParam param);

    ReturnT updateById(UpdateProductParam param);

    ReturnT updateOrders(Long[] ids,Integer orderStatus);

    PageHelper.Page<CustomerProduct> queryPcPage(QueryCustomerProductParam param);

    ReturnT<PageList> queryByPage(QueryCustomerProductParam param);

    ReturnT<CustomerProductView> getProductInfo(GetCustomerProductParam param);

    List<CustomerProduct> printList(Long[] ids);
}

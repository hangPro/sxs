package com.sxs.business.biz;

import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.CustomerProduct;
import com.sxs.common.param.AddProductParam;
import com.sxs.common.param.QueryCustomerProductParam;
import com.sxs.common.param.UpdateProductParam;
import com.sxs.common.response.ReturnT;

/**
 * Created by hang on 2017/9/25 0025.
 */
public interface CustomerProductService {

    ReturnT add(AddProductParam param);

    ReturnT update(UpdateProductParam param);

    PageHelper.Page<CustomerProduct> queryPage(QueryCustomerProductParam param);
}

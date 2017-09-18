package com.sxs.business.biz;

import com.sxs.business.plugin.PageHelper;
import com.sxs.common.bean.ProductImg;
import com.sxs.common.param.AddProductImgParam;
import com.sxs.common.param.QueryProductImgParam;
import com.sxs.common.param.UpdProductImgParam;
import com.sxs.common.response.ReturnT;

import java.util.List;

/**
 * Created by wangpeng on 2017/2/27.
 */
public interface ProductImgService {

    PageHelper.Page<ProductImg> queryProductImgPage(QueryProductImgParam param);

    ReturnT<List<ProductImg>> queryProductImgList(QueryProductImgParam param);

    ReturnT addProductImg(AddProductImgParam param);

    ReturnT updateProductImg(UpdProductImgParam param);

    ReturnT deleteProductImg(Long id);

    ReturnT<ProductImg> getProductImgById(Long id);
}

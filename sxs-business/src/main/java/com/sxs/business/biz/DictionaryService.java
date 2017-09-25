package com.sxs.business.biz;

import com.sxs.common.bean.Dictionary;

import java.util.List;

/**
 * Created by hang on 2017/2/25.
 */
public interface DictionaryService {

    List<Dictionary> queryDicList(String dicType);
}

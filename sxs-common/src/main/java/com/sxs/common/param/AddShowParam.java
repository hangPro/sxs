package com.sxs.common.param;

import com.sxs.common.session.BaseParameter;


/**
 * Created by hang on 2017/3/6.
 */
public class AddShowParam extends BaseParameter {

    private String showseason;

    private String images;

    public String getShowseason() {
        return showseason;
    }

    public void setShowseason(String showseason) {
        this.showseason = showseason;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}

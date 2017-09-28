package com.sxs.web.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sxs.common.constats.GlobConts;
import com.sxs.web.formatter.DateSerializer;
import com.sxs.web.formatter.DoubleNullAdapter;
import com.sxs.web.formatter.StringNullAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Date;

/**
 * Created by hang on 2017/1/3.
 */
@Configuration
public class WebConfig {

    @Bean(name = "gsonFormatter")
    public Gson getFormatterGson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class,new DateSerializer()).setDateFormat(GlobConts.DEFAULT_FORMATTER_YYYYMMDDHHMMSS);
        gsonBuilder.registerTypeAdapter(String.class,new StringNullAdapter());
        gsonBuilder.registerTypeAdapter(Double.class,new DoubleNullAdapter());
        return gsonBuilder.create();
    }
}

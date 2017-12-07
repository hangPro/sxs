package com.sxs.web.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sxs.web.formatter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by hang on 2017/1/3.
 */
@Configuration
public class WebConfig {

    @Bean(name = "gsonFormatter")
    public Gson getFormatterGson(){
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(Date.class,new DateAdapter());
        gsonBuilder.registerTypeAdapter(String.class,new StringNullAdapter());
        gsonBuilder.registerTypeAdapter(Double.class,new DoubleNullAdapter());
        gsonBuilder.registerTypeAdapter(BigDecimal.class,new BigDecimalNullAdapter());
        gsonBuilder.registerTypeAdapter(Integer.class,new IntegerNullAdapter());
        //gsonBuilder.registerTypeHierarchyAdapter(Number.class,new NumberNullAdapter());
        return gsonBuilder.create();
    }
}

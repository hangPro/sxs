package com.sxs.web.formatter;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by hang on 2017/1/7.
 */
public class DkyDateFormatter implements Formatter<Date> {

    @Override
    public Date parse(String s, Locale locale) throws ParseException {
        //SimpleDateFormat sdf = new SimpleDateFormat(GlobConts.DEFAULT_FORMATTER_YYYY_MM_DD,Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy",Locale.US);
        return sdf.parse(s);
    }

    @Override
    public String print(Date date, Locale locale) {
        return null;
    }

    public static void main(String[] args) throws Exception{
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss Z yyyy",Locale.US);
        Date date = sdf.parse("Mon Sep 25 00:00:00 GMT+08:00 2017");
        System.out.println(date);
        sdf=new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.parse(sdf.format(date)));
    }
}

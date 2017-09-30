package com.sxs.common.utils;

import org.apache.commons.lang3.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/2/15.
 */
public class DateUtils {

    public static String FORMAT_YYYYMMDD = "YYYY-MM-DD";
    public static String FORMAT_YYYYMMDDHHMMSS = "yyyyMMddHHmmss";

    public static String formatNowDate(String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date now = new Date();
        return sdf.format(now);
    }

    public static Date formatDate(String dateStr, String format){
        if (StringUtils.isBlank(dateStr)) {
            return null;
        }
        SimpleDateFormat dateformat = new SimpleDateFormat(format);
        try {
            return dateformat.parse(dateStr);
        } catch (ParseException e) {
            return null;
        }
    }

    public static Date parseDate(String timeText, String pattern) {
        if(StringUtils.isNotEmpty(timeText)) {
            if(!StringUtils.isNotEmpty(pattern)) {
                return parseDate(timeText);
            }

            try {
                return (new SimpleDateFormat(pattern)).parse(timeText);
            } catch (Exception var3) {
                var3.printStackTrace();
            }
        }

        return null;
    }

    public static Date parseDate(String timeText) {
        if(StringUtils.isEmpty(timeText)) {
            return null;
        } else {
            timeText = StringUtils.trim(timeText);
            if(timeText.contains("-")) {
                if(timeText.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}$")) {
                    return parseDate(timeText, "yyyy-MM-dd HH:mm:ss");
                }

                if(timeText.matches("^\\d{4}-\\d{1,2}-\\d{1,2}$")) {
                    return parseDate(timeText, "yyyy-MM-dd");
                }

                if(timeText.matches("^\\d{2}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}$")) {
                    return parseDate(timeText, "yy-MM-dd HH:mm:ss");
                }

                if(timeText.matches("^\\d{4}-\\d{1,2}$")) {
                    return parseDate(timeText, "yyyy-MM");
                }

                if(timeText.matches("^\\d{4}-\\d{1,2}-\\d{1,2} {1}\\d{1,2}:\\d{1,2}$")) {
                    return parseDate(timeText, "yyyy-MM-dd HH:mm");
                }
            }

            if(timeText.contains("/")) {
                if(timeText.matches("^\\d{4}/\\d{1,2}/\\d{1,2} {1}\\d{1,2}:\\d{1,2}:\\d{1,2}$")) {
                    return parseDate(timeText, "yyyy/MM/dd HH:mm:ss");
                }

                if(timeText.matches("^\\d{4}/\\d{1,2}/\\d{1,2}$")) {
                    return parseDate(timeText, "yyyy/MM/dd");
                }

                if(timeText.matches("^\\d{4}/\\d{1,2}$")) {
                    return parseDate(timeText, "yyyy/MM");
                }

                if(timeText.matches("^\\d{4}/\\d{1,2}/\\d{1,2} {1}\\d{1,2}:\\d{1,2}$")) {
                    return parseDate(timeText, "yyyy/MM/dd HH:mm");
                }
            }

            if(timeText.contains("年")) {
                if(timeText.matches("^\\d{4}年\\d{1,2}月\\d{1,2}日$")) {
                    return parseDate(timeText, "yyyy年MM月dd日");
                }

                if(timeText.matches("^\\d{4}年\\d{1,2}月$")) {
                    return parseDate(timeText, "yyyy年MM月");
                }
            }

            if(timeText.matches("\\d{6}")) {
                return parseDate(timeText, "yyyyMM");
            } else if(timeText.matches("\\d{8}")) {
                return parseDate(timeText, "yyyyMMdd");
            } else if(timeText.matches("\\d{14}")) {
                return parseDate(timeText, "yyyyMMddHHmmss");
            } else {
                throw new IllegalArgumentException("Invalid date format :" + timeText + "");
            }
        }
    }
}

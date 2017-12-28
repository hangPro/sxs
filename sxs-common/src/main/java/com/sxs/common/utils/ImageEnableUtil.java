package com.sxs.common.utils;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by Administrator on 2017/5/21.
 */
public class ImageEnableUtil {

    private static URL urlStr;
    private static HttpURLConnection connection;
    private static int state = -1;
    private static String succ;
    private static boolean isSucc;

    public static String isConnectStr(String url) {
        int counts = 0;
        succ = null; if (url == null || url.length() <= 0) { return succ; }
        while (counts < 5) {
            try {
                urlStr = new URL(url);
                connection = (HttpURLConnection) urlStr.openConnection();
                state = connection.getResponseCode();
                if (state == 200) {
                    succ = connection.getURL().toString();
                }
                break;
            } catch (Exception ex) {
                counts++;
                ex.printStackTrace();
                continue;
            }
        }
        return succ;
    }

    public static boolean isConnect(String url) {
        int counts = 0;
        isSucc = false; if (url == null || url.length() <= 0) { return isSucc; }
        while (counts < 5) {
            try {
                urlStr = new URL(url);
                connection = (HttpURLConnection) urlStr.openConnection();
                state = connection.getResponseCode();
                if (state == 200) {
                    isSucc = true;
                }
                break;
            } catch (Exception ex) {
                counts++;
                ex.printStackTrace();
                continue;
            }
        }
        return isSucc;
    }

    public static void main(String[] args) {
        System.out.println(ImageEnableUtil.isConnect("http://39.108.140.135/sxs-web/assets/img/upload/20171227/1514355910012.jpg"));
    }
}


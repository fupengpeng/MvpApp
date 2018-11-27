package com.st.c10.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author fpp
 * @Description:  时间处理工具类
 * @date 2018/11/23 17:51
 */

public class TimeUtil {

    /**
     *一些时间格式
     */
    public static final String FORMAT_TIME = "HH:mm";
    public static final String FORMAT_DATE_TIME = "yyyy-MM-dd HH:mm";
    public static final String FORMAT_DATE_TIME_SECOND = "yyyy-MM-dd HH:mm:ss";
    public static final String FORMAT_MONTH_DAY_TIME = "MM-dd HH:mm";
    public static final String FORMAT_DATE = "yyyy-MM-dd";


    public static String getCurrentTime(){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(FORMAT_DATE_TIME_SECOND);
        return formatter.format(currentTime);
    }

    public static String getCurrentTime(String format){
        Date currentTime = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        return formatter.format(currentTime);
    }







}

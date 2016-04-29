package com.b2c;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 时间日期工具类
 * Created by Oakley on 2016-04-22.
 */
public class DateUtil
{
    public static String DATE_FORMAT  ="yyyy-MM-dd";
    public static String DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static final String MINUTESTR = "mmssSSS";
    public static final String TIME_FORMAT = "HH:mm:ss";
    public static final String DATE_STAMP = "yyyyMMdd";
    public static final String DATETIME_STAMP = "yyyyMMddHHmmss";

    /**
     * 将时间转换为时间字符串
     * @param date
     * @param pattern
     * @return
     */
    public static String formartDate(Date date , String pattern){
        if(date == null || pattern == null && "".equals(pattern.trim())){
            throw new RuntimeException("参数有误");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }

    /**
     * 将毫秒转换为时间
     * @param time
     * @return
     */
    public static Date millisecondsToDate(long time)throws  Exception{
        if(time<=0){
            throw new RuntimeException("时间小于等于0");
        }
           return  new Date(time);
    }

    /**
     * 毫秒转换为时间字符串
     * @param time
     * @return
     */
    public static String millisecondsToDateStr(long time, String pattern) throws  Exception{
        if(time<=0 || (pattern!=null || "".equals(pattern.trim()))){
            throw new RuntimeException("时间小于等于0，或表达式为null 或者空字符串");
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(new Date(time));
    }

    /**
     * 获取相加后的时间
     * @param date
     * @param day
     * @return
     * @throws ParseException
     */
    public static Date getNextDate(Date date,int day) throws ParseException{
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(Calendar.DATE,day);
        return instance.getTime();
    }



}

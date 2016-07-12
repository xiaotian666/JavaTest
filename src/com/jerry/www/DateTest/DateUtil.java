package com.jerry.www.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jerry on 2016/7/12.
 */
public class DateUtil {
    private DateUtil(){
    }

    /**
     *
     * @param d 传进来的日期
     * @param s 传进来的字符串
     * @return 格式化后的字符串
     */
    public static String dateToString(Date d, String s){
        return new SimpleDateFormat(s).format(d);
    }

    /**
     *
     * @param d 被解析的字符串
     * @param s 传递过来的要被转换的格式
     * @return 解析后的日期对象
     * @throws ParseException
     */
    public static Date stringToDate(String d, String s) throws ParseException {
        return new SimpleDateFormat(d).parse(s);
    }
}

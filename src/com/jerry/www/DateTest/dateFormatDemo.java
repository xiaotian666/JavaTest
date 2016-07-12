package com.jerry.www.DateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Jerry on 2016/7/12.
 */
public class dateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        //日期转字符串
        //没有给定模式
//        SimpleDateFormat sdf = new SimpleDateFormat();
        //给定模式
        //SimpleDateFormat sdf = new SimpleDateFormat("y年M月d日  k:m:s");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日  kk:mm:ss");
        String s = sdf.format(d);
        //String s1 = sdf.format();
        System.out.println(s);

        //字符串转日期

        String s1 = "2016-7-12 11:13:14";
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss");

        Date dd = sdf1.parse(s1);
        System.out.println(dd);
    }
}

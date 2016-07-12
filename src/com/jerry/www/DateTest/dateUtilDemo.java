package com.jerry.www.DateTest;

import java.text.ParseException;
import java.util.Date;

/**
 * Created by Jerry on 2016/7/12.
 */
public class dateUtilDemo {
    public static void main(String[] args) throws ParseException {
        Date d = new Date();

        String s = DateUtil.dateToString(d,"yyyy年mm月dd HH:mm:ss");
        System.out.println(s);

        String d1 = "yyyy-mm-dd HH:mm:ss";
        String s1 = "2016-7-12 11:13:14";
        Date dd = DateUtil.stringToDate(d1,s1);
        System.out.println(dd);
    }
}

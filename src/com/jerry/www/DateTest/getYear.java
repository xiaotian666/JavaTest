package com.jerry.www.DateTest;

import java.util.Date;

/**
 * Created by Jerry on 2016/7/12.
 */
public class getYear {
    public static void main(String[] args) {
        Date d = new Date();
        String s = "yyyy-MM-dd-kk-mm-ss";

        String s1 = DateUtil.dateToString(d,s);

        String[] s2 = s1.split("-");
        System.out.println("今年是：" + s2[0] + "年");
    }
}

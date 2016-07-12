package com.jerry.www.DateTest;

import java.util.Date;

/**
 * Created by Jerry on 2016/7/12.
 */
public class demo1 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);

//        long time =System.currentTimeMillis();
        long time = 1000*60*60*24;
        Date d1 = new Date(time);
//        Date d1 = new Date(1468317644688);
        System.out.println(d1);
    }
}

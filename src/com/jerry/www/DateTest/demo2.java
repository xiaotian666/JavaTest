package com.jerry.www.DateTest;

import java.util.Date;

/**
 * Created by Jerry on 2016/7/12.
 */
public class demo2 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d.getTime());
        System.out.println(System.currentTimeMillis());
    }
}

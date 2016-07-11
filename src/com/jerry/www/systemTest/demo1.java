package com.jerry.www.systemTest;

/**
 * Created by Jerry on 2016/7/11.
 */
public class demo1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println("hello" + i);
        }
        long end = System.currentTimeMillis();
        System.out.println(start);
        System.out.println(end);
//        System.exit(1);
        System.out.println(end-start);
    }
}

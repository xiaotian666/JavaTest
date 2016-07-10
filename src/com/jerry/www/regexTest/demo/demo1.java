package com.jerry.www.regexTest.demo;

/**
 * Created by Jerry on 2016/7/10.
 */
public class demo1 {
    public static void main(String[] args) {
        System.out.println("分割字符串");
        String s1 = "aa    bb         cc";
        String[] strArray = s1.split(" +");
        for (int i=0;i<strArray.length;i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("----------------------");
        String s2 = "aa.bb.cc";
        String[] str2Array = s2.split("\\.");
        for (int i=0;i<str2Array.length;i++) {
            System.out.println(str2Array[i]);
        }
        System.out.println("----------------------");

    }
}

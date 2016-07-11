package com.jerry.www.regexTest.demo;

/**
 * Created by Jerry on 2016/7/10.
 * 字符串的分割
 */
public class demo1 {
    public static void main(String[] args) {
        System.out.println("分割字符串");
        //split函数中参数是正则表达式，不是字符串
        String s1 = "aa    bb         cc";
        String[] strArray = s1.split(" +");
        for (int i=0;i<strArray.length;i++) {
            System.out.println(strArray[i]);
        }
        System.out.println("----------------------");

        String s2 = "aa.bb.cc";
        String[] str2Array = s2.split("\\.");
        for (int i = 0; i < str2Array.length; i++) {
            System.out.println(str2Array[i]);
        }
        System.out.println("----------------------");

        String s3 = "aa,.bb,.cc";
        String[] str3Array = s3.split("[,]\\.");
        for (int i = 0; i < str3Array.length; i++) {
            System.out.println(str3Array[i]);
        }
        System.out.println("----------------------");

        String s4 = "F:\\IDEAWorkspace\\JavaTest\\src\\com\\jerry\\www\\regexTest\\demo\\demo1.java";
        String[] str4Array = s4.split("[:]*\\\\");
        for (int i = 0; i < str4Array.length; i++) {
            System.out.println(str4Array[i]);
        }
        System.out.println("----------------------");
    }
}

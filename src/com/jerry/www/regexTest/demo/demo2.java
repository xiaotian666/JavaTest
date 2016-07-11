package com.jerry.www.regexTest.demo;

/**
 * Created by Jerry on 2016/7/11.
 * replaceAll()的简单使用
 * public String replaceAll(String regex,String replacement)
 * 使用给定的 replacement 替换此字符串所有匹配给定的正则表达式的子字符串。
 */
public class demo2 {
    public static void main(String[] args) {
        String s = "ndasifbo2324nosdai234noadsf3243asdofn9082";

        String reg = "\\d";

        String replacement = "*";

        String s1 = s.replaceAll(reg,replacement);

        System.out.println("替换前是"+s);
        System.out.println("------------------");
        System.out.println("替换后是"+s1);


    }
}

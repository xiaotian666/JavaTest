package com.jerry.www.regexTest.demo;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jerry on 2016/7/11.
 * 获取功能：
 * 获取下面这个字符串中由三个字符组成的单词
 * "wo ai wo jia ni zai gan shen me ni hao bai bai zai jian"
 */
public class demo3 {
    public static void main(String[] args) {
        String s = "wo ai wo jia ni zai gan shen me ni hao bai bai zai jian";
        String reg = "\\b\\w{3}\\b";

        //把正则表达式编译成模式对象
        Pattern p = Pattern.compile(reg);

        // 通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
        Matcher m = p.matcher(s);
        int flag = 0;
        System.out.println("匹配的字符串是：");
        while (m.find()){
            flag++;
            System.out.println(m.group());
        }
        System.out.println(flag);
    }
}

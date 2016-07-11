package com.jerry.www.regexTest.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Jerry on 2016/7/11.
 */
public class Test2 {
    public static void main(String[] args) {

        //把正则表达式编译成模式对象
        Pattern p = Pattern.compile("a*b");

        // 通过模式对象得到匹配器对象，这个时候需要的是被匹配的字符串
        Matcher m = p.matcher("aaaaab");

        // 调用匹配器对象的功能
        boolean b = m.matches();
        System.out.println("budas\n"+b);
    }
}

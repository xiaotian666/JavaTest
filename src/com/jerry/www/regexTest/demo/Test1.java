package com.jerry.www.regexTest.demo;

import java.util.Arrays;

/**
 * Created by Jerry on 2016/7/11.
 */
public class Test1 {
    public static void main(String[] args) {

        //定义一个字符串
        String s = "45 85 22 88 35";

        //进行字符串分割
        String[] strArray = s.split(" ");

        //把字符串数组转化成int数组
        int[] arr = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);
        }

        //将数组排序
        Arrays.sort(arr);

        //将数组拼接位字符串
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        //去掉最后一给空格
        String s1 = sb.toString().trim();//trim()返回字符串的副本，忽略前导空白和尾部空白。

        System.out.println("原始数据为：" + s);
        System.out.println("----------------");
        System.out.println("转换后的数据是：" + s1);

    }
}














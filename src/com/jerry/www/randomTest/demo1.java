package com.jerry.www.randomTest;

import java.util.Random;

/**
 * Created by Jerry on 2016/7/11.
 */
public class demo1 {
    public static void main(String[] args) {
//        Random R = new Random();
        Random R = new Random(1000000);
        for (int i = 0; i < 10; i++) {
            int a = R.nextInt(100);
            System.out.println("随机数是：" + a);
        }
    }
}

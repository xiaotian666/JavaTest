package com.jerry.www.mathTest;

import java.util.Scanner;

/**
 * Created by Jerry on 2016/7/11.
 * 实现从一个数到另一个数之间的随机数
 */
public class demo2 {
    public static void main(String[] args) {
        int a,b;
        System.out.println("请输入两个数：");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        for (int i = 0; i < 100; i++) {
            System.out.println("得到的随机数是："+getRandom(a,b));
        }


    }
    public static int getRandom(int a, int b){
        return (int) (Math.random()*(b-a+1)) + a ;
    }
}

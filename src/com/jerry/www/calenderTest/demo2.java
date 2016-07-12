package com.jerry.www.calenderTest;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by Jerry on 2016/7/12.
 */
public class demo2 {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = sc.nextInt();
        c.set(year,2,1);

        c.add(Calendar.DATE,-1);

        int a = c.get(Calendar.DATE);
        if (a == 29) {
            System.out.println("闰年");
        }else System.out.println("平年");

    }
}

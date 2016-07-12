package com.jerry.www.DateTest;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by Jerry on 2016/7/12.
 */
public class getMyYearDays {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入你的出身年月日\n格式是yyyy-mm-dd");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Date dd = DateUtil.stringToDate("yyyy-mm-dd",s);
        long myTime = dd.getTime();
        Date d = new Date();
        long nowTime = d.getTime();

        int days = (int)((nowTime - myTime)/1000/60/60/24);

        System.out.println("你出生到现在经过了" + days + "天");
    }
}

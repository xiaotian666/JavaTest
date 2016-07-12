package com.jerry.www.BigDecimalTest;

import java.math.BigDecimal;

/**
 * Created by Jerry on 2016/7/12.
 */
public class demo1 {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("1000");
        BigDecimal bd2 = new BigDecimal("50");
        long x1 = System.currentTimeMillis();
//        BigDecimal result = bd1.multiply(bd2);
//        BigDecimal result = bd1.divide(bd2);
//        BigDecimal result = bd1.add(bd2);
        BigDecimal result = bd1.subtract(bd2);
        long x2 = System.currentTimeMillis();
        System.out.println(result);
        System.out.println(x2-x1);
    }
}

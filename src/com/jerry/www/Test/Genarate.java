package com.jerry.www.Test;

/**
 * Created by Jerry on 2016/7/11.
 *
 * genarate的简单实用
 * 主要是用idea实现简单的代码生成
 * 自动生成setXXX()和getXXX()等
 */
public class Genarate {
    private static String name;
    private static int age;

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Genarate.age = age;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Genarate.name = name;
    }

    public Genarate() {
    }
    public Genarate(String name,int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
    public static void main(String[] args) {
        Genarate g = new Genarate("柏刚刚",20);
        System.out.println("名字:"+g.getName());
        System.out.println("年龄:"+g.getAge());
        System.out.println("-----------------------");

        Genarate g1 = new Genarate();
        g1.setName("贺杰");
        g1.setAge(21);
        System.out.println("名字:"+g1.getName());
        System.out.println("年龄:"+g1.getAge());
    }
}

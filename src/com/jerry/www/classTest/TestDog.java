package com.jerry.www.classTest;

/**
 * Created by Jerry on 2016/6/3.
 */
class Animal{

    public void move(){
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {

    public void move(){
//        super.move();//调用父类被重写的方法
        System.out.println("狗可以跑和走");
    }
    public void bark(){
        System.out.println("狗可以吠叫");
    }
}

public class TestDog{

    public static void main(String args[]){
        com.jerry.www.classTest.Animal a = new com.jerry.www.classTest.Animal(); // Animal 对象
        Dog b = new Dog(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
        b.bark();
    }
}
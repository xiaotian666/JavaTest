package com.jerry.www.Test;

/**
 * Created by Jerry on 2016/6/3.
 */
class Animal{

    public void move(){
        System.out.println("动物可以移动1");
    }
}

class Dog extends Animal{

    public void move(){
        System.out.println("狗可以跑和走1");
    }
    public void bark(){
        System.out.println("狗可以吠叫1");
    }
}

public class DogTest{

    public static void main(String args[]){
        com.jerry.www.Test.Animal a = new com.jerry.www.Test.Animal(); // Animal 对象
        com.jerry.www.Test.Dog b = new com.jerry.www.Test.Dog(); // Dog 对象

        a.move();// 执行 Animal 类的方法
        b.move();//执行 Dog 类的方法
        b.bark();
    }
}
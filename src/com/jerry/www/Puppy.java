package com.jerry.www;

/**
 * Created by Jerry on 2016/6/3.
 */
public class Puppy{
    int puppyAge;
    public  Puppy(){

    }
    public Puppy(String name){
        // 这个构造器仅有一个参数：name
        System.out.println("Passed Name is :" + name );
    }

    public void setAge( int age ){
        puppyAge = age;
    }

    public int getAge( ){
        System.out.println("Puppy's age is :" + puppyAge );
        return puppyAge;
    }

    public static void main(String []args){
      /* 创建对象 */
//        Puppy myPuppy = new Puppy( "tommy" );
        Puppy myPuppy1 = new Puppy();
      /* 通过方法来设定age */
        myPuppy1.setAge( 2 );
      /* 调用另一个方法获取age */
        myPuppy1.getAge( );
      /*你也可以像下面这样访问成员变量 */
        System.out.println("Variable Value :" + myPuppy1.puppyAge );
    }
}
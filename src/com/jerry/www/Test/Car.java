package com.jerry.www.Test;

/**
 * Created by Jerry on 2016/6/3.
 */
class Vehicle {}

public class Car extends Vehicle {
    public static void main(String args[]){
        Vehicle a = new Car();
        boolean result =  a instanceof Car;
        System.out.println( result);
    }
}
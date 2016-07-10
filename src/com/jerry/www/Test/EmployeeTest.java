package com.jerry.www.Test;

/**
 * Created by Jerry on 2016/6/3.
 */


public class EmployeeTest{

    public static void main(String args[]){
      /* 使用构造器创建两个对象 */
        Employee empOne = new Employee("James Smith");
        Employee empTwo = new Employee("Mary Anne");

        // 调用这两个对象的成员方法
        empOne.empAge(26);
        empOne.empDesignation("哈度搜发货");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(21);
        empTwo.empDesignation("哈多岁覆盖");
        empTwo.empSalary(500);
        empTwo.printEmployee();
    }
}
package com.jerry.www.ObjectArray;

/**
 * Created by Jerry on 2016/7/13.
 */
public class studentTest {
    public static void main(String[] args) {
        Student[] stu = new Student[5];

        Student s1 = new Student("柏刚刚",20);
        Student s2 = new Student("贺杰",21);
        Student s3 = new Student("刘健",20);
        Student s4 = new Student("国庆",21);
        Student s5 = new Student("赵鑫",20);

        stu[0] = s1;
        stu[1] = s2;
        stu[2] = s3;
        stu[3] = s4;
        stu[4] = s5;
        for (int i = 0; i < stu.length; i++) {
            System.out.println("名字："+ stu[i].getName() + "\n年龄：" + stu[i].getAge());
            System.out.println("++++++++++++++++++++++++++");
        }
    }

}

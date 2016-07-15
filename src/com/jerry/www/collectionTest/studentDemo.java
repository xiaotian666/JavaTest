package com.jerry.www.collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Jerry on 2016/7/15.
 *
 * 练习：用集合存储5个学生对象，并把学生对象进行遍历。用迭代器遍历。
 *
 * 注意：
 * 		A:自己的类名不要和我们学习的要使用的API中的类名相同。
 * 		B:复制代码的时候，很容易把那个类所在的包也导入过来，容易出现不能理解的问题。
 */
public class studentDemo {
    public static void main(String[] args) {

        Collection c = new ArrayList();

        Student s1 = new Student("柏刚刚",20);
        Student s2 = new Student("贺杰",21);
        Student s3 = new Student("刘健",20);
        Student s4 = new Student("国庆",21);
        Student s5 = new Student("赵鑫",20);

        c.add(s1);
        c.add(s2);
        c.add(s3);
        c.add(s4);
        c.add(s5);

//        Object[] obj = c.toArray();
//
//        for (int i = 0; i < obj.length; i++) {
//            Student stu = (Student)obj[i];
//            System.out.println("名字：" + stu.getName());
//            System.out.println("年龄：" + stu.getAge());
//        }
        // 遍历
        Iterator it = c.iterator();//开始做的时候iterator是变红的，原因是没有导入Iterator，使用Alt+enter解决
//        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
//            Student s = (Student) it.next();
//            System.out.println(s.getName() + "---" + s.getAge());
        }
    }
}

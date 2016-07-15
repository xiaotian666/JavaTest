package com.jerry.www.collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Jerry on 2016/7/15.
 *
 * 使用不同方法遍历
 */
public class studentDemo1 {
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

        Iterator it1 = c.iterator();
        Iterator it2 = c.iterator();

        while (it1.hasNext()){
            System.out.println(it1.next());
        }
        System.out.println("--------------------------");
        for (int i = 0; i < c.size(); i++) {
            System.out.println(it2.next());
        }
        System.out.println("--------------------------");
        for (Iterator it3 = c.iterator();it3.hasNext();){
            System.out.println(it3.next());
        }


    }
}

package com.jerry.www.collectionTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * Created by Jerry on 2016/7/15.
 */
public class demo3 {
    public static void main(String[] args) {
        Collection c = new ArrayList();

        c.add("hello");
        c.add("java");
        c.add("lalala");

//        Object[] obj = c.toArray();
//
//        for (int i = 0; i < obj.length; i++) {
//            System.out.println(obj[i]);
//            String s = (String) obj[i];
//            System.out.println(s.length());
//        }

        Iterator it =c.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}

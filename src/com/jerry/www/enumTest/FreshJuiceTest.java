package com.jerry.www.enumTest;

/**
 * Created by Jerry on 2016/6/3.
 */
class FreshJuice {
    enum FreshJuiceSize{ SMALL, MEDUIM, LARGE }
    FreshJuiceSize size;
}

public class FreshJuiceTest {
    public static void main(String []args){
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice. FreshJuiceSize.MEDUIM ;
    }
}
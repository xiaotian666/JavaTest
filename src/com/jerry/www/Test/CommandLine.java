package com.jerry.www.Test;

/**
 * Created by Jerry on 2016/6/3.
 */
public class CommandLine {

    public static void main(String args[]){
        for(int i=0; i<args.length; i++){
            System.out.println("args[" + i + "]: " + args[i]);
        }
    }
}
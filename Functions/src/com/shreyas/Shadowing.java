package com.shreyas;

public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {//Shadowing at line number 8
        System.out.println(x);//This will print 90 as x
        int x = 60;//This class variable at line 4 is shadowed by this
        System.out.println(x);//This will print 60  as x
        fun();
    }


    static void fun(){

        System.out.println(x);
    }
}

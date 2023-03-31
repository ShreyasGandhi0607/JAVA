package com.shreyas;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,6,7,8,9);
//        multiple(23,43,"Shreyas");
        demo(2,3,4,5,6);
        demo("Shree","Shreyas");
        //demo() //gives ambiguity while compiling
    }

    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }static void demo(String ...v){
        System.out.println(Arrays.toString(v));
    }

    static void multiple(int a ,int b, String ...v){
    }
    static void fun(int ...v){
        System.out.println(Arrays.toString(v));

    }
}

package com.shreyas;

public class Overloading {
    public static void main(String[] args) {
        fun(22);
        fun("Shreyas");
        sum(2,3);
        sum(3,5,7);
    }

    static void sum(int a, int b){
        int sum = a+b;
    }static void sum(int a, int b , int c){
        int sum = a+b+c;
    }
    static  void fun(int a){
        System.out.println(a);

    }

    static void fun(String name){
        System.out.println(name);
    }
}

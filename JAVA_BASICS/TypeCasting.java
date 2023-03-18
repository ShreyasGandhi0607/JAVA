package com.shreyas;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();

        //ty[e casting
        int num = (int)(344.434f);
        System.out.println(num);

        //automatic promotions in expressions
        int a = 257;
        byte b = (byte) (a);//257%256

        System.out.println(b);

        byte x = 40;
        byte y = 50;
        byte z = 100;
        int d = x*y/z;
        System.out.println(d);

        int chr = 'a';
        System.out.println(chr);

        System.out.println(3*8.2);
        System.out.println(3*8);
        System.out.println("The result is ");
        byte p = 42;
        char c = 'a';
        short s = 1024;
        int i = 122321;
        float f = 12.233f;
        double m = 0.233;
        double result = (p*c) + (i/s) -(f-m);
        System.out.println(result);


    }

}

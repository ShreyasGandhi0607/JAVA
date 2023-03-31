package com.shreyas;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        {
            a = 30;
            int c = 40;
        }
//         a = 100;
        System.out.println(a);
        
        //Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        random(78);

    }

    static  void random(int marks){
        int num = 10;
        System.out.println(num);
        System.out.println(marks);
    }
}

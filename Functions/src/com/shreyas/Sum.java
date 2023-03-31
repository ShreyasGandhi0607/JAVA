package com.shreyas;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        sum();
//        int ans = sum2();
        int ans = sum3(12,23);
        System.out.println(ans);


    }

    //pass value of numbers while passing it
    static int sum3(int a,int b){
        int sum = a+b;
        return sum;
    }
    static int sum2(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = in.nextInt();
        System.out.println("Enter num 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter num 1");
        int num1 = in.nextInt();
        System.out.println("Enter num 2");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        System.out.println("The sum is "+sum);
    }
    /*
        return_type name (){
        //body
        }
     */
}

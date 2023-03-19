package com.loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        /*
        Syntax for for loop

        for(initialization,condition,incre/decre-ment){
        //body
        }
         */
        //Q:mPrint numbers 1 to 5

        for(int i = 1;i<6;i++){
            System.out.println(i);
        }
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Using for loop");
        for (int i = 0; i < n; i++) {
            System.out.print(i + " ");

        }
        /*
        while loops
        Syntax:
        while(condition){
        //body
        }
         */
        System.out.println("\nUsing While loop");
        int num = 1;
        while(num<6){
            System.out.print(num+" ");
            num+=1;
        }

        System.out.println("\nUsing Do while loop");
        int num1 = 1;
        do{
            System.out.print(num1+" ");
            num1+=1;
        }while(num1!=5);


    }
}

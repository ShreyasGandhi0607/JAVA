package com.shreyas;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
//    greeting();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your Name");
        String name = in.nextLine();
        String personalized = myGreet("Shreyas");
        System.out.println(personalized);
        greeting();
    }

    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static void  greeting(){
        System.out.println("How are you ?");

    }
}

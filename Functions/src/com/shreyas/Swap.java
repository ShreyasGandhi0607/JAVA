package com.shreyas;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a,b);
//          Swap number codes
//        int temp = a;
//        a = b;
//        b = temp;
        System.out.println(a + " " + b);

        String name = "Shreyas Gandhi";
        changeName(name);
        System.out.println(name);

    }

    private static void changeName(String name) {

        name = "Sanchit Gandhi";//creating new object
    }

    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

        //This change will be only valid in this function only
    }
}

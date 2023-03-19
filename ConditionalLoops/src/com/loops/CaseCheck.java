package com.loops;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        char ch = inp.next().trim().charAt(0);
//        System.out.println(ch);//returns char at 0th index
//        System.out.println(inp.next().trim());
        if(ch >='a' && ch<='z'){
            System.out.println("LowerCase");

        }else{
            System.out.println("upperCAse");
        }
    }
}

package com.Count;

public class CountNumber {
    public static void main(String[] args) {
        int n = 13343563;
        int count = 0;
        while(n>0){
            int rem = n%10;
            if(rem == 3){
                count+=1;
            }
            n= n/10;
        }

        System.out.println(count);
    }
}

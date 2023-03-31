package com.shreyas;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create array
        int arr[] = {1,3,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void change(int[] nums) {
        nums[0] = 99;
    }

}

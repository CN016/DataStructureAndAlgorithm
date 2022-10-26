package com.my016.test;

import com.my016.sort.Sell;

import java.util.Arrays;

public class SellTest {
    public static void main(String[] args) {
        Integer[] arr = {9,1,2,5,7,4,8,6,3,5};
        Sell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

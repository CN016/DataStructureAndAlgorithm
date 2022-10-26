package com.my016.test;

import com.my016.sort.BubbleSort;

import java.util.Arrays;

public class BubbleTest {
    public static void main(String[] args) {
        Integer[] arr = {1,1,4,5,1,4,1,9,1,9,8,1,0};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

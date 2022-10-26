package com.my016.test;

import com.my016.sort.BubbleSort;
import com.my016.sort.Insertion;

import java.util.Arrays;

public class InsertionTest {
    public static void main(String[] args) {
        Integer[] arr = {4,3,2,10,12,1,5,6};
        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

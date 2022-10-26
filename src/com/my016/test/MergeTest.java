package com.my016.test;

import com.my016.sort.Merge;

import java.util.Arrays;

public class MergeTest {
    public static void main(String[] args) {
        Integer[] test = {8,4,5,7,1,3,6,2};
        Merge.sort(test);

        System.out.println(Arrays.toString(test));
       // Arrays.sort();
    }
}

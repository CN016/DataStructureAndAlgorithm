package com.my016.test;

import com.my016.sort.Insertion;
import com.my016.sort.Sell;

import java.io.*;
import java.util.ArrayList;

public class TestAllSort {
    public static void main(String[] args) throws Exception{
//        PrintStream ps = new PrintStream(new FileOutputStream("E:\\360MoveData\\Users\\mi\\Desktop\\1.txt"));
//        for (int i = 100000; i >=0 ; i--) {
//            ps.println(i);
//        }
        ArrayList<Integer> list = new ArrayList<>();

        new BufferedReader(new InputStreamReader(TestAllSort.class.getClassLoader().getResourceAsStream("E:\\360MoveData\\Users\\mi\\Desktop\\1.txt")));
    }
    public static void testShell(Integer[] arrs){
       long    start =    System.currentTimeMillis();

        Sell.sort(arrs);

       long    end =    System.currentTimeMillis();

        System.out.println("希尔排序用时："+(end-start));
    }
    public static void testInsertion(Integer[] arrs){
        long    start =    System.currentTimeMillis();

        Insertion.sort(arrs);

        long    end =    System.currentTimeMillis();

        System.out.println("希尔排序用时："+(end-start));
    }
}

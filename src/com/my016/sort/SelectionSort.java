package com.my016.sort;

public class SelectionSort {
    public static void sort (Comparable[] a){
        for (int i = 0; i < a.length-1; i++) {
            //定义变量存最小元素索引
            int minIndex = i ;
            for (int j = i+1; j < a.length; j++) {
                //与最小值比较
                if (greater(a[minIndex],a[j])){
                    minIndex=j;
                }
            }
            exchange(a,i,minIndex);
        }
    }
    private static boolean greater (Comparable v, Comparable w){
        return v.compareTo(w)>0;
    }
    private static void exchange (Comparable[] a , int i  , int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}

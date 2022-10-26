package com.my016.sort;

public class BubbleSort {
    public static void sort(Comparable[] a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = 0; j < a.length-i-1; j++) {
                if (greater(a[j],a[j+1])){
                    exchange(a,i,j);
                }
            }
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

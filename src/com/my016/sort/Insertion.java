package com.my016.sort;

public class Insertion {
    public static void sort(Comparable[] a){
        for (int i = 1; i < a.length; i++) {
            for (int j = i; j >0; j--) {
                if (greater(a[j-1],a[j])){
                    exchange(a,j-1,j);
                }else {
                    break;
                }
            }//傻逼不写注释，艹
        }
    }
//哪个弱智写的？是我啊，那没事了

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








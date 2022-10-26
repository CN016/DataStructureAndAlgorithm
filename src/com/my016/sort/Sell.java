package com.my016.sort;

public class Sell {
    public static void sort (Comparable[] a){
        //增长量h
        int h = 1 ;
        while (h<a.length/2){
            h=2*h+1;
        }
        //希尔排序
        while (h>=1){
            //排序

            //找到待插入的元素
            for (int i = h; i < a.length; i++) {
                //把待插入的元素插入到有序数列中
                for (int j = i; j >=h ; j-=h) {
                    //待插入的元素a[j],比较a[j],a[j-h]
                    if (greater(a[j-h],a[j])){
                        exchange(a,j-h,j);
                    }else {
                        break;
                    }

                }
            }


            //减小h的值
            h=h/2;
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

package com.my016.sort;

import java.util.Arrays;

public class Merge {
    public static void sort(Comparable[] a){
        //初始化辅助数组
        assist=new Comparable[a.length];
        //定义lo变量和hi变量，代表最小最大变量的索引
        int lo = 0;
        int hi = a.length-1;
        sort(a,lo,hi);



    }
    private static void sort(Comparable[] a , int lo , int hi){
        //对数组a中从索引lo到索引hi之间的元素进行排序

        //安全性校验
        if (hi <= lo){
            return;
        }
        int mid = lo + (hi -lo)/2 ;//等于(lo+hi)/2 这样写可以防止lo+hi时数据溢出,妙蛙
        //sort  //对数据2分组  //分别排序
        sort(a,lo,mid);
        sort(a,mid+1,hi);
        //归并
        merge(a,lo,mid,hi);
    }
    private static void merge(Comparable[] a, int lo, int mid, int hi){
       //从索引lo到所以mid为一个子
        //组，从索引mid+1到索引hi为另一个子组，把数组a中的这两个子组的数据合并成一个有序的大组（从
        //索引lo到索引hi）


        //三个指针
        int i = lo ;
        int p1 = lo;
        int p2 = mid+1;

        while (p1 <= mid && p2 <= hi){
            //比较对应索引处的值
            if (less(a[p1],a[p2] )){
                assist[i++] = a[p1++];
            }else {
                assist[i++] = a[p2++];
            }
        }

        while (p1 <= mid){
            assist[i++] = a[p1++];
        }

        while (p2 <= hi){
            assist[i++] = a[p2++];
        }

        //copy
        for (int index = lo ; index <=hi ; index++){
            a[index]=assist[index];
        }

    }
    private static Comparable[] assist;
    private static boolean less(Comparable v,Comparable w){
        //判断v是否小于w
        return v.compareTo(w)<0;
    }
    private static void exchange (Comparable[] a , int i  , int j){
        Comparable temp;
        temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}


package com.my016.sort;

public class Quick {
    public static void sort(Comparable[] a){
        int lo = 0 ;
        int hi = a.length-1 ;
        sort(a,lo,hi);

    }
    private static void sort(Comparable[] a, int lo , int hi){
        //对数组a中从索引lo到索引hi之间的元素
        //进行排序
        //安全性校验
        if (hi<= lo){
            return;
        }

        int partition = partition(a, lo, hi);

        //左子组有序
        sort(a,lo,partition-1);

        //右子组有序
        sort(a,partition+1,hi);

    }
    public static int partition(Comparable[] a ,int lo ,int hi){
        //对数组a中，从索引 lo到索引 hi之间的元
        //素进行分组，并返回分组界限对应的索引
        //确定分界值
        Comparable key = a[lo];
        //双指针
        int left = lo ;
        int right = hi+1 ;

        //切分
        while (true){
            //先从右往左
            while (less(key,a[--right])){
                if (right == lo){
                    break;
                }
            }
            //从左往右
            while (less(a[++left],key)){
                if (left == hi){
                    break;
                }
            }

            if (left >= right){
                break;
            }else {
                exchange(a,left,right);
            }

        }

        exchange(a,lo,right);

        return right;

    }

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

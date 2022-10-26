package com.my016.heap;

import java.util.Arrays;

public class Heap<T extends Comparable<T>> {
    private T[] items;

    private int N;

    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public T[] getItems() {
        return items;
    }

    public void setItems(T[] items) {
        this.items = items;
    }

    //堆空间初始化
    public Heap(int capacity) {
        items = (T[]) new Comparable[capacity+1];
        N = 0;
    }

    public int size(){
        return N;
    }

    public Heap(){
    }

    private boolean less(int i , int  j){
        return items[i].compareTo(items[j]) < 0 ;
    }

    private void exchange(int i , int j){
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public void insert(T t){
        items[++N] = t;
        swim(N);
    }

    //上浮算法
    private void swim(int k){
        //是否到根结点
        while (k>1){
            //比较当前结点和其父节点
            if (less(k/2,k)){
                //父结点小于子结点，交换
                exchange(k/2,k);
            }
            k = k / 2 ;
        }
    }

    public T delMax(){
        T max = items[1];

        exchange(1,N);

        items[N] = null;

        N--;

        sink(1);

        return max;
    }


    //下沉算法
    private void sink(int k){
        while (2*k<=N){
            //找子结点的较大者
            int max;
            if (2*k+1 <=N) {//存在右结点
                if (less(2*k,2*k+1)){
                    max = 2*k+1;
                }else {
                    max = 2*k;
                }
            }else {
                max = 2*k;
            }
            if (!less(k,max)){
                break;
            }

            exchange(k,max);
            k=max;

        }

    }

    @Override
    public String toString() {
        return "Heap{" + Arrays.toString(items) +
                '}';
    }
}

package com.my016.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class SequenceList<T> implements Iterable<T>{

    private T[] eles;

    private int N;

    public SequenceList(int capacity) {
    eles = (T[]) new Object[capacity];
    N=0;
    }

    public void clear(){
        N=0;
    }

    public boolean isEmpty(){
        return N == 0 ;
    }

    public T get(int i){
        if (N == eles.length){
            throw new RuntimeException("当前元素不存在！");
        }
        return eles[i];
    }

    public void insert(T t){
        if (N == eles.length){
            throw new RuntimeException("当前表已满");
        }
        eles[N++] = t;
    }

    /**
     * @param i 插入元素的索引
     * @param t 插入的元素
     */
    public void insert(int i , T t){
        if (i<0 || i>=N){
            throw new RuntimeException("插入的位置不合法");
        }

        if (N == eles.length){
            throw new RuntimeException("当前表已满");
        }

        //把i位置空出来，i的位置及其后面的元素依次向后移动一位
        for (int index = N ; index >i ; index--){
            eles[index]=eles[index-1];
        }

        //把t放到i位置处
        eles[i] = t;

        N++;
    }

    public T remove(int i){
        if (i<0 || i>=N){
            throw new RuntimeException("当前要删除的元素不存在");
        }
        //记录i位置处的元素
        T result = eles[i];

        //把i位置后面的元素都向前移动一位
        for (int index = i ; index < N-1 ; index++){
            eles[index] = eles[index+1];
        }

        //当前元素数量-1
        N--;
        return result;
    }

    /**
     *
     * @param t 元素索引
     * @return 找到该元素返回索引否则返回-1
     */
    //查找t元素第一次出现的位置
    public int indexOf(T t){
        if (t == null){
            throw new RuntimeException("查找的元素不合法");
        }

        for (int i =0 ; i <N ; i++){
            if (eles[i].equals(t)){
                return i;
            }
        }

        return -1;
    }

    @Override
    public String toString() {
        return Arrays.toString(eles);
    }

    @Override
    public Iterator<T> iterator() {
        return new SIterator();
    }

    private class SIterator implements Iterator{

        private int cur ;

        public SIterator(){
            this.cur = 0;
        }

        @Override
        public boolean hasNext() {
            return cur<N;
        }

        @Override
        public T next() {
            return eles[cur++];
        }
    }
}

package com.my016.heap;

public class MaxPriorityQueue<T extends Comparable<T>> extends Heap<T>{

    public MaxPriorityQueue(int capacity){
        super(capacity);
    }

//    public int size(){
//        return heap.size();
//    }

    public boolean isEmpty(){
        return super.size() == 0;
    }

//    public void insert(T t){
//        heap.insert(t);
//    }

//    public T delMax(){
//       return heap.delMax();
//    }
}

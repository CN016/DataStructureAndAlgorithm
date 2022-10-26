package com.my016.test;

import com.my016.heap.IndexMinPriorityQueue;

public class IndexMinPriorityQueueTest {
    public static void main(String[] args) {
        String[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        IndexMinPriorityQueue<String> indexMinPriorityQueue = new IndexMinPriorityQueue<>(20);

        for (int i = 0; i < arr.length; i++) {
            indexMinPriorityQueue.insert(i,arr[i]);

        }

        System.out.println(indexMinPriorityQueue.size());

        System.out.println(indexMinPriorityQueue.minIndex());

        indexMinPriorityQueue.changeItem(0,"Z");

        int minIndex = -1;

        while (!indexMinPriorityQueue.isEmpty()){
            minIndex  =indexMinPriorityQueue.delMin();
            System.out.println(minIndex + ",");
        }

    }
}

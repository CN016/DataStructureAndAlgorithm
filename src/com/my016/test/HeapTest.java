package com.my016.test;

import com.my016.API.HeapSortAPI;
import com.my016.heap.Heap;
import com.my016.heap.MaxPriorityQueue;
import com.my016.heap.MinPriorityQueue;

import java.util.Arrays;

public class HeapTest {
    public static void main(String[] args) {
        Heap<Integer> heap = new Heap<>(114);
        MinPriorityQueue<Integer> integerMinPriorityQueue = new MinPriorityQueue<>(114);
        MaxPriorityQueue<Integer> integerMaxPriorityQueue = new MaxPriorityQueue<>(114);

//        heap.insert("1");
//        heap.insert("1");
//        heap.insert("4");
//        heap.insert("5");
//        heap.insert("1");
//        heap.insert("4");
        //heap.insert("1");
        int[] arrays =  new int[]{1, 1, 4, 5, 1, 4, 1, 9, 1, 9, 8, 1, 0, 5, 6, 7, 8, 3, 4, 55, 68, 76, 435, 587, 8678, 34, 58, 787, 98, 6, 43623, 76, 8};
        for (int array : arrays) {
            heap.insert(array);
            integerMinPriorityQueue.insert(array);
            integerMaxPriorityQueue.insert(array);
        }
       // System.out.println(heap);
        String[] arr = {"S", "O", "R", "T", "E", "X", "A", "M", "P", "L", "E"};
        HeapSortAPI.sort(arr);
        System.out.println(heap);
        System.out.println(integerMaxPriorityQueue);
        System.out.println(integerMinPriorityQueue);
        System.out.println(Arrays.toString(arr));
    }
}

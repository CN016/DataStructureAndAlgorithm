package com.my016.test;

import com.my016.list.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> queue =new Queue<>();
        queue.enqueue("1");
        queue.enqueue("1");
        queue.enqueue("4");
        queue.enqueue("5");
        queue.enqueue("1");
        queue.enqueue("4");
        System.out.println(queue);
    }
}

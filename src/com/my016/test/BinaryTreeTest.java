package com.my016.test;

import com.my016.list.Queue;
import com.my016.tree.BinaryTree;

public class BinaryTreeTest {
    public static void main(String[] args) {
        BinaryTree<String, String> bt = new BinaryTree<>();
        bt.put("E", "5");
        bt.put("B", "2");
        bt.put("G", "7");
        bt.put("A", "1");
        bt.put("D", "4");
        bt.put("F", "6");
        bt.put("H", "8");
        bt.put("C", "3");

        Queue<String> preQueue = bt.preErgodic();
        Queue<String> midQueue = bt.midErgodic();
        Queue<String> afterQueue = bt.afterErgodic();
        Queue<String> layerQueue = bt.layerErgodic();
        System.out.println(preQueue);
        System.out.println(midQueue);
        System.out.println(afterQueue);
        System.out.println(layerQueue);
        Exception exception = new ArithmeticException("KFC Crazy Thursday V me ￥50");
        try {
            int a =  1/0;
        } catch (Exception e) {
            exception.printStackTrace();
        }
    }
}

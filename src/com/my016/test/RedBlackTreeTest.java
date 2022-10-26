package com.my016.test;

import com.my016.tree.RedBlackTree;

public class RedBlackTreeTest {
    public static void main(String[] args) {
        RedBlackTree<Integer , String> stringRedBlackTree = new RedBlackTree<>();
        stringRedBlackTree.put(4, "二哈");
        stringRedBlackTree.put(1, "张三");
        stringRedBlackTree.put(3, "李四");
        stringRedBlackTree.put(5, "王五");
        System.out.println(stringRedBlackTree.size());
        stringRedBlackTree.put(1,"老三");
        System.out.println(stringRedBlackTree.get(1));
        System.out.println(stringRedBlackTree.size());

    }
}

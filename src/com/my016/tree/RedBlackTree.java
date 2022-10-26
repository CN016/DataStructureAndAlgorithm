package com.my016.tree;

public class RedBlackTree<Key extends Comparable<Key> , Value> {
    //根结点
    private Node root;
    //结点个数
    private int N;
    private static final Boolean RED = true;
    private static final Boolean BLACK = false;

    /**
     * 内部结点类
     * @param <Key> 键
     * @param <Value> 值
     */
    private class Node<Key , Value>{
        public Key key;
        private Value value;
        public Node left;
        public Node right;
        public Boolean color;

        public Node(Key key, Value value, Node left, Node right, Boolean color) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
        }
    }

    /**
     * 判断当前结点的父指向链接是否为红色
     * @param x 结点
     * @return boolean
     */
    private boolean isRed(Node x){
        if (x == null){
            return false;
        }
        return x.color == RED;
    }

    /**
     * 左旋转
     * @param h 结点
     * @return 结点
     */
    private Node rotateLeft(Node h){
        Node right = h.right;
        Node x = right.left;
        h.right = x;
        right.left = h;
        right.color = h.color;
        h.color = RED;
        return right;
    }

    /**
     * 右旋转
     * @param h 结点
     * @return 结点
     */
    private Node rotateRight(Node h){
        Node left = h.left;
        Node x = left.right;
        h.left = x;
        left.right = h;
        left.color = h.color;
        h.color = RED;
        return left;
    }

    /**
     * 颜色反转
     * @param h 子节点需要反转颜色的父结点
     */
    private void flipColors(Node h){
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    /**
     * 插入操作
     * @param key 键
     * @param value 值
     */
    public void put(Key key,Value value){
        root = put(root,key,value);
        root.color = BLACK;
    }

    /**
     * 内部插入操作
     * @param h 结点
     * @param key 键
     * @param value 值
     * @return 插入后的根结点
     */
    private Node put(Node h , Key key , Value value){
        if (h == null){
            N++;
            return new Node(key,value,null,null,RED);
        }
        int cmp = key.compareTo((Key) h.key);
        if (cmp < 0){
            h.left = put(h.left,key,value);
        }else if (cmp > 0){
            h.right = put(h.right,key,value);
        }else {
            h.value = value;
        }

        //右红左黑，左旋转
        if (isRed(h.right) && !isRed(h.left)){
            h = rotateLeft(h);
        }

        //连续左红，右旋转
        if (isRed(h.left) && isRed(h.left.left)){
            h = rotateRight(h);
        }

        //左右红，反转
        if (isRed(h.left) && isRed(h.right)){
            flipColors(h);
        }

        return h;
    }

    /**
     * 键找值
     * @param key 键
     * @return 值
     */
    public Value get(Key key){
        return get(root,key);
    }

    /**
     * 内部键找值实现
     * @param x 结点
     * @param key 键
     * @return 值
     */
    private Value get(Node x , Key key){
        if (x == null){
            return null;
        }
        int cmp = key.compareTo((Key) x.key);
        if (cmp < 0){
            return (Value) get(x.left,key);
        }else if (cmp > 0){
            return (Value) get(x.right,key);
        }else {
            return (Value) x.value;
        }
    }

    /**
     * 获取结点个数
     * @return 结点个数
     */
    public int size(){
        return N;
    }

}

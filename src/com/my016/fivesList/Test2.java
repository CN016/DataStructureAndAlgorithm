package com.my016.fivesList;

public class Test2 {
    public static void main(String[] args) {
        MyLinkedList m1=new MyLinkedList();
        m1.addLast(10);
        m1.addLast(11);
        m1.addLast(12);
        m1.addLast(13);
        m1.addLast(14);
        m1.disPlay();
        m1.addIndex(5,16);
        m1.disPlay();
//        System.out.println(m1.contains(10));
//        System.out.println(m1.size());
    }

}

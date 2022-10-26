package com.my016.list;

import com.my016.API.ListAPI;

import static com.my016.API.ListAPI.printEvery3SecondForNode;

public class ListCycle {
    public static void main(String[] args) {
        Node head = ListAPI.getStudentNodeList();

        Node last = returnLastNode(head);

        last.next = head.next.next;
        //手动变环
        //printEvery3SecondForNode(head);
        System.out.println(ListAPI.isCircle(head));
        //System.out.println(ListAPI.getCircleStartAddress(head).item);
        printEvery3SecondForNode(ListAPI.getCircleStartAddress(head));
    }
    public static Node returnLastNode(Node head){
        Node p =head;
        while (p.next != null){
            p = p.next;
        }
        return p;
    }

}

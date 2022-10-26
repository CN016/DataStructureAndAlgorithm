package com.my016.list;

import com.my016.API.ListAPI;

public class ListCircle {
    public static void main(String[] args) {
      // ListAPI.printEvery3SecondForNode(ListAPI.circleFor41Node());
        Node first = ListAPI.circleFor41Node();
//        int count = 0;
//        int num   =  0;
//        Node p = first;
//        while (true){
//            if (3 > leftNum(first)){
//                break;
//            }
//
//            if (!p.item.equals(0)){
//                if (count == 2){
//                    num = (int) p.item;
//                    System.out.println(num);
//                    count = 0;
//                    p.item = 0;
//                    p = p.next;
//                    continue;
//                }
//                count++;
//                p = p.next;
//            }else {
//                p = p.next;
//            }
//
//        }
        //2.使用count，记录当前的报数值
        int count=0;
//3.遍历链表，每循环一次，count++
        Node<Integer> n = first;
        Node<Integer> before = null;
        while(n!=n.next){
//4.判断count的值，如果是3，则从链表中删除这个结点并打印结点的值，把count重置为0；
            count++;
            if (count==3){
//删除当前结点
                before.next = n.next;
                System.out.print(n.item+",");
                count=0;
                n = n.next;
            }else{
                before=n;
                n = n.next;
            }
        }
        /*打印剩余的最后那个人*/


        System.out.println(n.item);
    }
    public static int leftNum(Node first){
        Node head = first;
        int count = 0;
        while (true){
            if (!head.item.equals(0)){
                count++;
            }
            head = head.next;
            if (head.equals(first)){
                break;
            }
        }
        return count;
    }
}

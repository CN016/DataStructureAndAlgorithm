package com.my016.API;

import com.my016.list.Node;
import com.my016.pojo.Student;

import javax.imageio.plugins.tiff.FaxTIFFTagSet;
import java.util.ArrayList;
import java.util.List;

public class ListAPI {
    public static Node reverse(Node head){
        if (head == null || head.next== null){
            return head;
        }

        Node pre = null;
        Node curr = head;

        while (curr != null){
            Node next = curr.next;
            curr.next = pre;
            pre       =  curr;
            curr      = next;
        }

        return pre;
    }
    public static Node<Student> getStudentNodeList(){
        Student s1 = new Student();
        s1.setAge(13244);
        s1.setID("dsaaafgsafefwgrhtjfgndfsbvfqfewrg");
        List<Student> students = StudentBean.getStudentArrayList();
        Node<Student> head = new Node<>(s1,null);
        Node<Student> p    = head;
        for (Student student : students) {
            //Node<Student> temp = new Node<>(student,null);
            if ( s1.equals(p.item)){
                p.item = student ;
            }else {
                p.next = new Node<Student>(student,null);
                p = p.next;
            }
        }
        return head;
    }

    public static boolean isCircle(Node first){
        Node slow = first;
        Node fast = first;
        while (slow!=null && fast.next!=null){
            fast = fast.next.next;

            slow = slow.next;

            if (fast.equals(slow)){
                return true;
            }
        }
        return false;
    }

    public static Node getCircleStartAddress(Node first){
        Node slow = first;
        Node fast = first;

        while (fast!=null && fast.next!=null){
            fast = fast.next.next;

            slow = slow.next;

            if (fast.equals(slow)){
                Node temp = fast;
                while (!temp.equals(first)){
                    temp = temp.next;
                    first = first.next;
                }
                return temp;
            }
        }
        return null;
    }

    public static Node circleFor41Node(){
        Node<Integer> first = new Node<>(0,null);
        Node p = first;
        for (int i = 1; i < 41 ; i++) {
            if (p.item.equals(0)){
                p.item = i;
                p.next = new Node<Integer>(0,null);
                p=p.next;
            }
        }
        p.item = 41;
        p.next = first;
        return first;
    }

    public static void printEvery3SecondForNode(Node head) {
        Node p = head;

        while (p.next != null) {
            System.out.println(p.item);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            p = p.next;

        }
    }
}
class TestListAPi{
    public static void main(String[] args) {
        long before = System.currentTimeMillis();
      Node<Student> w = ListAPI.getStudentNodeList();
        System.out.println("////////////////////////////////////////////////////////////////////////////");
        System.out.println(w);
        System.out.println("////////////////////////////////////////////////////////////////////////////");
        Node a=  ListAPI.reverse(w);
        System.out.println(a);
        System.out.println("////////////////////////////////////////////////////////////////////////////");
        long after = System.currentTimeMillis();
        System.out.println(after - before);
    }

}

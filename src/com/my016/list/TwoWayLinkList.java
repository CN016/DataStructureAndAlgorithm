package com.my016.list;

import java.util.Iterator;

public class TwoWayLinkList<T> implements Iterable<T> {

    //首结点
    private Node head;

    //尾结点
    private Node last;

    private int N;//链表的长度

    public TwoWayLinkList(){
        last = null;
        head = new Node(null,null,null);
        N    = 0;
    }

    //清空列表
    public void clear(){
        last=null;
        head.next=null;
        head.pre=null;
        head.item=null;
        N=0;
    }

    public int length(){
        return N;
    }

    public boolean isEmpty(){
        return N==0;
    }

    public void insert(T t){
        if (last == null){
            last = new Node(t,head,null);
            head.next = last;
        }else {
            Node oldLast = last;
            Node node = new Node(t,oldLast,null);
            oldLast.next = node;
            last = node;
        }
        N++;
    }

    public void insert(int i,T t){
        if (i<0 || i>=N){
            throw new RuntimeException("'位置不合法");
        }

        //找到位置 i 的前一个结点
        Node pre = head ;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }

        //当前结点
        Node curr = pre.next;

        Node newNode = new Node(t,pre,curr);
        curr.pre=newNode;
        pre.next=newNode;

        N++;
    }

    public T get(int i){
        if (i<0 || i>=N){
            throw new RuntimeException("位置不合法");
        }

        Node cur = head.next;

        for (int index = 0; index < i; index++) {
            cur=cur.next;
        }

        return cur.item;
    }

    public int indexOf(T t){
        Node n = head;
        for (int i = 0; n.next!=null; i++) {
            n = n.next;
            if (n.next.equals(t)){
                return i;
            }
        }
        return -1;
    }

    public T remove(int i){
        if (i<0 || i>=N){
            throw new RuntimeException("位置不合法");
        }

        //寻找i位置的前一个元素
        Node pre = head;
        for (int index = 0; index < i; index++) {
            pre = pre.next;
        }
        //i的位置
        Node curr = pre.next;
        //i的下一个位置
        Node curr_next = curr.next;

        pre.next = curr_next;
        curr_next.pre = pre;

        N--;
        return curr.item;
    }

    public T getFirst(){
        if (isEmpty()){
            return null;
        }
        return head.next.item;
    }

    public T getLast(){
        if (isEmpty()){
            return null;
        }
        return last.item;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator{

        private Node n = head;


        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public Object next() {
            n=n.next;
            return n.item;
        }
    }


    private class Node {
        //存储的数据
        public T item;
        //上结点
        public Node pre;
        //下结点
        public Node next;

        public Node(T item , Node pre , Node next){
            this.item = item;
            this.pre  = pre;
            this.next = next;
        }

    }


    public static void main(String[] args) {
        TwoWayLinkList<String> list = new TwoWayLinkList<>();

    }
}

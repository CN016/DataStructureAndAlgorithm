package com.my016.list;

import java.util.Iterator;

public class Queue<T> implements Iterable<T> {
    private Node head;
    private Node last;
    private int  N;

    public Queue(){
        head = new Node(null,null);
        last = null;
        N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public int size(){
        return N;
    }

    public void enqueue(T t){
        if (last == null){
            last = new Node(t,null);
            head.next = last;
        }else {
            Node oldLast = last;
            last = new Node(t,null);
            oldLast.next=last;
        }
        N++;
    }

    public T dequeue(){
        if (isEmpty()){
            return null;
        }

        Node oldFirst = head.next;
        head.next = oldFirst.next;
        N--;
        if (isEmpty()){
            last = null;
        }
        return (T) oldFirst.item;
    }

    @Override
    public String toString() {
        return "Queue{" + head.next +
                '}';
    }

    @Override
    public Iterator<T> iterator() {
        return new QIterator();
    }

    private class QIterator implements Iterator<T>{

        private Node n = head;
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public T next() {
            return null;
        }
    }
}

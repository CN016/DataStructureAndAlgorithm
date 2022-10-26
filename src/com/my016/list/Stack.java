package com.my016.list;

import com.my016.list.Node;

import java.util.Iterator;

public class Stack<T> implements Iterable<T>{
    private Node head;
    private int N;

    @Override
    public String toString() {
        return "Stack{" +
                  head.next +
                '}';
    }

    public Stack(){
        head = new Node(null,null);
        N = 0;
    }

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(T t){
        Node oldNext = head.next;
        Node node = new Node(t,oldNext);
        head.next = node;
        N++;
    }

    public T pop(){
        Node oldNext = head.next;
        if (oldNext == null){
            return null;
        }
        head.next=head.next.next;
        N--;
        return (T) oldNext.item;
    }

    public int size(){
        return N;
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    private class SIterator implements Iterator<T>{

        private Node n = head;
        @Override
        public boolean hasNext() {
            return n.next!=null;
        }

        @Override
        public T next() {
            Node node = n.next;
            n = n.next;
            return (T) node.item;
        }
    }
}

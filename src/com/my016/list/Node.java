package com.my016.list;

import java.util.Objects;

public class Node<T>{
    public T item;
    public Node next ;

    public Node(T item,Node next){
        this.item = item;
        this.next = next;
    }

    @Override
    public String toString() {
        return "{" +
                forNode() +
                '}';
    }

    private String forNode(){
        if (item==null){
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Node p = this;
        while (p.next!=null){
            stringBuffer.append(p.item.toString()+",");
            p=p.next;
        }
        stringBuffer.append(p.item.toString());
        return stringBuffer.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(item, node.item) && Objects.equals(next, node.next);
    }

    @Override
    public int hashCode() {
        return Objects.hash(item, next);
    }

    public static void main(String[] args) {
        Node<Integer> first = new Node<>(11,null);
        Node<Integer> second = new Node<>(45,null);
        Node<Integer> third = new Node<>(14,null);
        Node<Integer> fourth = new Node<>(19,null);
        Node<Integer> fifth = new Node<>(19,null);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;

        System.out.println(first);
        System.out.println(second);
    }
}

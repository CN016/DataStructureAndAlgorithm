package com.my016.fivesList;

class Node{
     public int data;
     public Node next;

     public Node(int data){
         this.data=data;
         this.next=null;
     }

}

public class MyLinkedList {

    public Node head;//保存单列表的头节点的引用

    public void addFirst(int data){//头插法
        Node node= new Node(data);
        if(head==null){
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;
    }

    public void disPlay(){//打印单链表
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public void addLast(int data){
        Node node =new Node(data);
        if(this.head==null){
            this.head=node;
            return;
        }
        Node cur=this.head;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }

    public boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    public int size(){
        int count=0;
        Node cur=this.head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
        return count;
    }

    public void addIndex(int index,int data){
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size()-1){
            addLast(data);
            return;
        }
        Node node = new Node(data);

        Node cur = searchIndex(index);

        node.next=cur.next;
        cur.next=node;
    }

    private Node searchIndex(int index){
        if(index<0||index>size()-1){
            throw new RuntimeException("index 位置不合法");
        }
        Node cur=this.head;
        for (int i = 0; i < index-1; i++) {
            cur=cur.next;
        }
        return cur;
    }

}

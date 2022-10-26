package com.my016.fivesList;

import java.util.Arrays;

public class mArraList {

    public int[] elem;
    public int usedSize;
    public static int intCapacity=10;

    public mArraList(){
        this.elem=new int[intCapacity];
        this.usedSize=0;
    }

    public void setElem(int[] elem){
        this.usedSize=elem.length;
        for(int i=0;i<this.usedSize;i++)
        {
            this.elem[i]=elem[i];
            //this.usedSize++;
        }
    }

    private boolean isFull(){
//        if(this.usedSize==this.elem.length){
//            return true;
//        }
//        return false;
        return this.usedSize==this.elem.length;
    }

    public void add(int pos,int data){

        checkPos(pos);

        if (isFull()){
            this.elem=Arrays.copyOf(this.elem,2*this.elem.length);
        }

        if(pos>this.usedSize-1 || pos<0){
            return;
        }


        for(int i=this.usedSize-1;i>=pos;i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }

    public void disPlay(){
        System.out.println(Arrays.toString(this.elem));
    }

    public boolean contains(int toFind){
        int l=0;
        int r=this.usedSize-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)>>>1;
            if(toFind>this.elem[mid]){
                l=mid+1;
            }else if(toFind<this.elem[mid]){
                r=mid-1;
            }else {
                return true;
            }
        }
        return false;
    }

    public int search(int toFind){
        int l=0;
        int r=this.usedSize-1;
        int mid=0;
        while(l<=r){
            mid=(l+r)>>>1;
            if(toFind>this.elem[mid]){
                l=mid+1;
            }else if(toFind<this.elem[mid]){
                r=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    private boolean isEmpty(){
        return this.usedSize==0;
    }

    private void checkPos(int pos){
        if(pos<0 || pos>=this.usedSize){
            throw new RuntimeException("pos位置不合法");
        }
    }

    public int getPos(int pos){
        checkPos(pos);

        if(isEmpty())
        {
            throw new RuntimeException("顺序表为空");
        }
        return this.elem[pos];
    }

    public int size(){
        return this.usedSize;
    }

    public void remove(int toRemove){
        if(contains(toRemove)==false){
            throw new RuntimeException("顺序表中没有这个数字");
        }
        for(int i=search(toRemove);i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }

        this.usedSize--;
        this.elem[this.usedSize]=0;

    }

    public void clear(){
        this.usedSize=0;
        this.elem=Arrays.copyOf(this.elem,0);
    }

}



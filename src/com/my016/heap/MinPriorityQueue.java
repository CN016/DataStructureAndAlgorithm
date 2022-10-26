package com.my016.heap;

public class MinPriorityQueue<T extends Comparable<T>> extends Heap<T> {


    public MinPriorityQueue(int capacity) {
        super(capacity);
    }

    public MinPriorityQueue() {
    }

    private boolean less(int i , int j){
    return getItems()[i].compareTo(getItems()[j])<0;
    }
    private void exchange(int i , int j){
        T[] source = getItems();
        T temp1 = getItems()[i];
        T temp2 = getItems()[j];
        source[i] = temp2;
        source[j] = temp1;
    }

    private void swim(int k){
        while (k >1){
            if (less(k,k/2)){
                exchange(k,k/2);
            }
            k = k/2;
        }
    }
    private void sink(int k){
        while (2*k <= getN()){
            int min = 2 * k;
            if (2*k + 1 <= getN() && less(2*k+1, 2*k)){
                min = 2*k+1;
            }
            if (less(k,min)){
                break;
            }
            exchange(min , k);
            k = min;
        }
    }
    @Override
    public T delMax(){
        System.out.println("Error");
        new RuntimeException("Error meth");
        return null;
    }

    public T delMin(){
        T[] source = getItems();

        T min = getItems()[1];

        exchange(1,getN());

        source[getN()] = null;

        setN(getN()-1);

        sink(1);

        return min;
    }

    public boolean isEmpty(){
        return super.size() == 0;
    }
    @Override
    public void insert(T t){
        setN(getN()+1);
        T[] source = getItems();
        source[getN()] = t;

        swim(getN());
    }
}

package com.my016.API;

public class HeapSortAPI {
    //数组从小到大排序
    public static void sort(Comparable[] source){

        //构建堆
        Comparable[] heap = new Comparable[source.length+1];

        createHeap(source,heap);

        int N = heap.length-1;

        while (N!=1){
            exchange(heap,1,N);
            N--;

            sink(heap,1,N);

        }

        System.arraycopy(heap,1,source,0,source.length);

    }

    private static void createHeap(Comparable[] source ,Comparable[] heap){

        System.arraycopy(source,0,heap,1,source.length);

        //heap索引一半倒叙遍历，元素下沉

        for (int i = (heap.length-1)/2 ; i>0 ;i--){
            sink(heap,i, heap.length-1);
        }

    }
    private static boolean less(Comparable[] heap ,int i , int j){
        return heap[i].compareTo(heap[j]) < 0;
    }
    private static void exchange(Comparable[] heap , int i ,int j ){
        Comparable temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    private static void sink(Comparable[] heap ,int target ,int range){
        while (2*target <= range){

            int max = 2*target;

            if (2*target+1 <= range){
                //有右结点
                if (less(heap,2*target,2*target+1)){
                    max = 2*target+1;
                }
            }

            if (less(heap,target,max)){
                exchange(heap,target,max);
            }
            target = max;
        }
    }
}

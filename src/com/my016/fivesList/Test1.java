package com.my016.fivesList;

import java.util.Arrays;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        mArraList m1= new mArraList();

        //System.out.println(m1.usedSize);
        //m1.elem={0,1,6};
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        m1.setElem(arr);
        m1.disPlay();
        System.out.println(m1.usedSize);
        m1.add(9,112);
        m1.disPlay();
        System.out.println(m1.usedSize);
        m1.remove(1);
        m1.disPlay();
        System.out.println(m1.usedSize);
        System.out.println("clear");
        m1.clear();
        m1.disPlay();
        System.out.println(m1.usedSize);

//        System.out.println(m1.getPos(9));
//        System.out.println(m1.search(5));
//        System.out.println(m1.contains(2));
//        List
    }
}

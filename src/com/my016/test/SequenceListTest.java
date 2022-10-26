package com.my016.test;

import com.my016.sort.SequenceList;

import java.util.ArrayList;

public class SequenceListTest {
    public static void main(String[] args) {
        SequenceList<String> test = new SequenceList<>(10);

        test.insert("114");
        test.insert("114");
        test.insert("114");
        test.insert("114");
        test.insert("514");

        System.out.println(test);

        for (String s : test){
            System.out.println(s);
        }
       // ArrayList
    }
}

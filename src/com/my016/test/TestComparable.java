package com.my016.test;

import com.my016.sort.Student;

import java.util.concurrent.Callable;

public class TestComparable {
    public static void main(String[] args) {
        Student s1 = new Student("114",19);
        Student s2 = new Student("514",81);

        Comparable max = getMax(s1,s2);
        System.out.println(max);
    }
    public static Comparable getMax (Comparable c1 , Comparable c2){
        return    c1.compareTo(c2) > 0 ? c1 : c2 ;
    }
}

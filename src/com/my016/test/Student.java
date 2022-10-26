package com.my016.test;

import java.util.Arrays;
import java.util.Scanner;

public class Student {//学生类
    int age; //年龄
    char sex; //性别
    public void myPrint(){
        System.out.println("hello");//打印 hello
    }
}
class TEST{ //测试类
    public static void main(String[] args) {
        Student student = new Student();
        //定义一个学生对象（类）  Student（）是构造器函数
        student.age = 19;   //访问student对象里面的 属性/字段 并赋值
        student.sex = '男';

        System.out.println(student.age); //打印
        System.out.println(student.sex);

        student.myPrint();//调用student对象里面的方法

//        Scanner sc = new Scanner(System.in);
//        int[] arr = new int[114];
//        for (int i = 0; i < 5; i++) {
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
    }
}

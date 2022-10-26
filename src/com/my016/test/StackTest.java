package com.my016.test;

import com.my016.list.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("4");
        stack.push("1");
        stack.push("5");
        stack.push("4");
        stack.push("1");
        stack.push("1");
        System.out.println(stack);
    }
}

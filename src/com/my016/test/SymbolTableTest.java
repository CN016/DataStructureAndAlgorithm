package com.my016.test;

import com.my016.table.SymbolTable;

public class SymbolTableTest {
    public static void main(String[] args) {
        SymbolTable<Integer,String> table = new SymbolTable<>();
        table.put(1,"00");
        table.put(2,"00");
        table.put(3,"00");
        table.put(4,"00");
        table.put(5,"00");
        table.put(6,"00");
        System.out.println(table.size());

        System.out.println(table.get(3));
    }
}

package com.company;

import java.sql.SQLOutput;

public class StringDemo {
    public static void main(String[] args) {
        System.out.println(String.format("123 %s", "ddd"));
        System.out.println(String.format("123 %s %d", "ddd" ,2 ));
        String x = "12345";
        System.out.println(x.length());
    }
}

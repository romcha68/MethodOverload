package com.brainacad.oop.overloadtest2;

public class Main {
    public static void main(String[] args) {
        byte b = 5;
        foo(b);
    }

    public static void foo(int i) {
        System.out.println("int");
    }

    public static void foo(Byte b) {
        System.out.println("Byte");
    }
}

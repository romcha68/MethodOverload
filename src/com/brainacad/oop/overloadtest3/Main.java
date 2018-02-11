package com.brainacad.oop.overloadtest3;

public class Main {
    public static void main(String[] args) {
        foo(15,17);
       foo(3,5,7);
    }
    public static void foo(int a, int b){
        System.out.println(a + " " + b);
    }
    public static void foo(int ...a){
        for(int A: a){
            System.out.println(A);
        }
    }
}

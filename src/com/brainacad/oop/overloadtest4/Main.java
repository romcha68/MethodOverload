package com.brainacad.oop.overloadtest4;

public class Main {
    public static void main(String[] args) {
        //foo(null); ошибка компиляции, не может определить какой из методов вызывать
    }

    public static void foo(Animal a) {
        System.out.println("Animal");
    }

    public static void foo(Dog d) {
        System.out.println("Dog");
    }

    public static void foo(Puppi p) {
        System.out.println("Puppi");
    }

}

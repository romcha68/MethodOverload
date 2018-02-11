package com.brainacad.oop.overloadtest1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        foo(animal);
    }

    public static void foo(Animal a) {
        System.out.println("Animal");
    }

    public static void foo(Dog d) {
        System.out.println("Dog");
    }
}

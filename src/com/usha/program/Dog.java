package com.usha.program;

public class Dog {
    String breed;
    int age;
    String color;
    public Dog(){
        System.out.println("Dog() constructor");
    }
    static final String VOICE = "barks";

    public static void main(String[] args) {
        Dog d2 = new Dog();
        System.out.println(d2.breed);
        System.out.println(d2.color);
        System.out.println(d2.age);
        System.out.println(d2.VOICE);


    }
}

package com.usha.program;

public class Constractores1 {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.age = 10;// one way of assigning value with the help of constructor 
        System.out.println(d1.age);
        d1.breed = "rhjjj";
        System.out.println(d1.breed);
        d1.color = "black";
        System.out.println(d1.color);
        System.out.println(d1.VOICE);

    }
}

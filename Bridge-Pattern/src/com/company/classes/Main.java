package com.company.classes;

// Demonstration of bridge design pattern

//The Bridge design pattern allows to separate the abstraction from the implementation.

public class Main {
    public static void main(String[] args)
    {
        Dish kunafa = new Kunafa(new Prepare(), new Serve());
        kunafa.order();

        Dish cafemocha = new CafeMocha(new Prepare(), new Serve());
        cafemocha.order();
    }
}

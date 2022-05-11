package com.company.classes;

import com.company.interfaces.Restaurant;

// Concrete implementation 1 for bridge pattern

public class Serve implements Restaurant {
    @Override
    public void task() {
        System.out.println("And  Served!! Enjoy");
    }
}

package com.company.classes;

import com.company.interfaces.Restaurant;


// Refine abstraction 2 in bridge pattern

public class Kunafa extends Dish {

    public Kunafa(Restaurant restaurant1, Restaurant restaurant2){
        super(restaurant1,restaurant2);
    }
    @Override
    public void order() {
        System.out.println("Kunafa ");
        restaurant1.task();
        restaurant2.task();
    }
}

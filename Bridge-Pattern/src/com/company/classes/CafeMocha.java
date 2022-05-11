package com.company.classes;

import com.company.interfaces.Restaurant;


// Refine abstraction 1 in bridge pattern

public class CafeMocha extends Dish {

    public CafeMocha(Restaurant restaurant1, Restaurant restaurant2){
        super(restaurant1,restaurant2);
    }
    @Override
    public void order() {
        System.out.println("Cafe Mocha ");
        restaurant1.task();
        restaurant2.task();
    }
}

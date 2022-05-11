package com.company.classes;

import com.company.interfaces.Restaurant;

// abstraction in bridge pattern

abstract class Dish {
    protected Restaurant restaurant1;
    protected Restaurant restaurant2;

    protected Dish(Restaurant restaurant1,Restaurant restaurant2 )
    {
        this.restaurant1=restaurant1;
        this.restaurant2=restaurant2;
    }

    abstract public void order();
}
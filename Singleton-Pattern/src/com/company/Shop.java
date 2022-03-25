package com.company;

public class Shop {
    private static Shop shopobj;//a private attribute of the class type that refers to the single object.

    private Shop() {
    }//a private constructor of the class to restrict object creation outside the class.

    public static Shop getInstance() {

        // create object if it's not already created
        if(shopobj == null) {
            shopobj = new Shop();
        }

        // returns the singleton object
        return shopobj;
    }//a public static method that allows us to create and access the object we created.
    // Inside the method, we will create a condition that restricts us from creating more than one object.

    public void goToTheShop(int i) {
        System.out.println("Person " + i + "-- You are now at the shop");
    }
}

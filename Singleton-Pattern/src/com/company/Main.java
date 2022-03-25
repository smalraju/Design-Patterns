package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Shop person1;
        person1= Shop.getInstance();// refers to the only object of Shop
        person1.goToTheShop(1);

        Shop person2;
        person2= Shop.getInstance();// refers to the only object of Shop
        person2.goToTheShop(2);
    }
}

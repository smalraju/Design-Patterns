package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        TradeSecret permission1 = new ProxyAccess(11);
        permission1.accessInfo();

        TradeSecret permission2 = new ProxyAccess(5);
        permission2.accessInfo();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        
        Temperature temp = new TemperatureAdapter();

        temp.setTemperatureInC(0);
        System.out.println("temp in C:" + temp.getTemperatureInC());
        System.out.println("temp in F:" + temp.getTemperatureInF());

        temp.setTemperatureInF(85);
        System.out.println("temp in C:" + temp.getTemperatureInC());
        System.out.println("temp in F:" + temp.getTemperatureInF());
    }
}

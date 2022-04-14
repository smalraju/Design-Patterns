package com.company;

public class Main {

    public static void main(String[] args) {

       /*
       Cake cake1=new Cake("chocolate","choco chips","birthday","Two");
       System.out.println(cake1);

        */

        //Creating object using Builder pattern in java
       Cake cake2=new Cake.CakeBuilder().setLayers("Three").setFlavour("red velvet").setToppings("Kit Kat").setOccasion("Birthday").makeCake();
       System.out.println(cake2);
    }
}

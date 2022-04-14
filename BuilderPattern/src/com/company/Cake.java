package com.company;

//we have static nested CakeBuilder class inside Cake which is used to create object.

public class Cake {
    private String flavour;
    private String toppings;
    private String occasion;
    private String layers;

    //Builder class will have exactly same set of fields as original class.

    public static class CakeBuilder {
        private String flavour;
        private String toppings;
        private String occasion;
        private String layers;

        //each method will return same Builder object. Builder will be enriched with each method call.

        public CakeBuilder setFlavour(String flavour) {
            this.flavour = flavour;
            return this;
        }

        public CakeBuilder setToppings(String toppings) {
            this.toppings = toppings;
            return this;
        }

        public CakeBuilder setOccasion(String occasion) {
            this.occasion = occasion;
            return this;
        }

        public CakeBuilder setLayers(String layers) {
            this.layers = layers;
            return this;

        }
        //will copy all builder field values into Cake class and return object of Cake class.
        public Cake makeCake(){
            return new Cake(flavour,toppings,occasion,layers);
        }
    }//end of builder class

    //private constructor to create its object from makeCake() method and prevent outsider to access its constructor.

    private Cake(String flavour, String toppings, String occasion, String layers){
        this.flavour=flavour;
        this.toppings=toppings;
        this.occasion=occasion;
        this.layers=layers;
    }

    @Override
    public String toString(){
        return layers+ " layered cake ordered on the occasion of " + occasion +
                " which is " + flavour +" flavoured and has "+ toppings+" toppings.";
    }
}

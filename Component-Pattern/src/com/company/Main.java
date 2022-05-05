package com.company;

public class Main {

    public static void main(String[] args) {

        Leaf s1 = new Leaf(100,"shreya");
        Leaf s2 = new Leaf(98,"akhil");
        Leaf s3 = new Leaf(87,"charishma");
        Leaf s4 = new Leaf(78,"anish");
        Leaf s5 = new Leaf(89,"nikitha");
        Leaf s6 = new Leaf(67,"bhavana");
        Leaf s7 = new Leaf(76,"Aditya");

        Composite cse = new Composite("CSE");
        Composite ds = new Composite("Data Science");
        Composite mech = new Composite("MECHANICAL");
        Composite snist = new Composite("Sreenidhi");

        ds.addStudent(s3);
        ds.addStudent(s4);

        cse.addStudent(s1);
        cse.addStudent(s2);
        cse.addStudent(s7);

        cse.addStudent(ds);

        mech.addStudent(s5);
        mech.addStudent(s6);


        snist.addStudent(cse);
        snist.addStudent(mech);

        snist.displayMarks();
        cse.displayMarks();
    }
}

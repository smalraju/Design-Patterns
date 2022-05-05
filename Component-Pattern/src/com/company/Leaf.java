package com.company;

public class Leaf implements Student {

    public int marks;
    public String name;

    public Leaf(int marks, String name) {
        this.marks = marks;
        this.name = name;
    }

    @Override
    public void displayMarks() {
        System.out.println(name + ":"+ marks);
    }
}

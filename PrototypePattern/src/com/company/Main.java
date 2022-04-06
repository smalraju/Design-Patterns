package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Student s1= new Student(1,"shreya","cse",90);
        s1.displayDetails();
        System.out.println();
        Student s2= (Student) s1.getClone();
        s2.displayDetails();
        System.out.println();
        System.out.println(" \tStudent Details ");
        System.out.println("id\tname\tbranch\tpercentage");
        s2.setId(2);
        s2.setName("Akhil");
        s2.setPercentage(96);
        s2.displayDetails();
    }
}

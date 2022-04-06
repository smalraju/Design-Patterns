package com.company;

public class Student implements Prototype{

    private int id;
    private String name, branch;
    private float percentage;

    Student(){
        System.out.println();
        System.out.println(" \tStudent Details ");
        System.out.println("id\tname\tbranch\tpercentage");
    }

    Student(int id, String name, String branch, float percentage){
        this();
        this.id=id;
        this.name=name;
        this.branch=branch;
        this.percentage=percentage;
    }

    public void displayDetails(){
        System.out.println(id+"\t"+name+"\t"+branch+"\t\t"+percentage);
    }

    public void setId(int i){
        this.id=i;
    }
    public void setName(String i){
        this.name=i;
    }
    public void setPercentage(float i){
        this.percentage=i;
    }

    @Override
    public Prototype getClone(){
        return new Student(id,name,branch,percentage);
    }
}

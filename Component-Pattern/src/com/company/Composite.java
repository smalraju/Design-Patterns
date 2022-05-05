package com.company;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Student {

    String name;
    List<Student> persons = new ArrayList<>();

    public Composite(String name) {
        this.name = name;
    }

    public void addStudent(Student p){
        persons.add(p);
    }

    @Override
    public void displayMarks() {
        System.out.println(name);

        for(Student p : persons){
            p.displayMarks();
        }
    }
}

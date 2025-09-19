package com.riyaz.oops.encapsulation.v0;

/*
 * Student class blueprint with attributes and methods
 */
public class Student {
    // data (attributes)
    private String name;
    private int age;

    // behavior (methods)
    void joinLecture() {
	System.out.println(name + " joined the lecture.");
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public int getAge() {
	return age;
    }

    public void setAge(int age) {
	if (age < 0) {
	    System.out.println("Age cannot be negative.");
	    return;
	}
	this.age = age;
    }

}

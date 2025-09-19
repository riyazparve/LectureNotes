package com.riyaz.oops.encapsulation.v1;

public class StudentDemo {

    public static void main(String[] args) {
	/*
	 * An object is an instance of a class. Once a class is defined, objects can be
	 * created from it, which represents real-world instances
	 */

	// create an object of Student class
	Student student1 = new Student();
	student1.name = "Riyaz";
	student1.age = 33;

	System.out.println(student1.name + " is " + student1.age + " years old.");
	student1.joinLecture();

	student1.age = -1; // user can set invalid age
    }

    /*
     * OUTPUT: Riyaz is 33 years old. 
     * Riyaz joined the lecture.
     */
}

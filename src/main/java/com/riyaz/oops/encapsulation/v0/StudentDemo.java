package com.riyaz.oops.encapsulation.v0;

public class StudentDemo {

    public static void main(String[] args) {
	/*
	 * An object is an instance of a class. Once a class is defined, objects can be
	 * created from it, which represents real-world instances
	 */

	// create an object of Student class
	Student student1 = new Student();
	student1.setName("Riyaz");
	student1.setAge(33);

	System.out.println(student1.getName() + " is " + student1.getAge() + " years old.");
	student1.joinLecture();

	student1.setAge(-1); // user cannot set invalid age
	System.out.println(student1.getName() + " is " + student1.getAge() + " years old.");
    }

    /*
     * OUTPUT: Riyaz is 33 years old. 
     * Riyaz joined the lecture.
     */
}

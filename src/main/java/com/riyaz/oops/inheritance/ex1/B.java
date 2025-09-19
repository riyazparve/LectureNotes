package com.riyaz.oops.inheritance.ex1;

/*
 *  1. B, C, and D are classes
 *  The program to the right is not a legal Java program because class
 *  D may extend only one class, and here it extends both B and C. But if it
 *  were legal, it would be ambiguous because in class D, it is not known
 *  which method m to call, the one inherited from class B or the one inherited from class C. 
 *  Java avoids the multiple inheritance problem for
 *  classes by allowing a class to extend only one other class
*/

class B {
    int m() {
	return 0;
    }
}

class C {
    int m() {
	return 1;
    }
}

class D // extends B,C // multiple inheritance is not legal in Java
{

    void p() {
	//	System.out.println(m());
    }
}
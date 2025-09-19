package com.riyaz.oops.inheritance.ex2;

/*
 * 2. B, C are interfaces and D is a class, in version 7 or less
 * Class D can implement many interfaces. To the right, it implements both B and C. Further, 
 * in Java 7 and earlier, all methods in an
 * interface are abstract, and any non-abstract class that implements the
 * interface must override interface’s abstract methods. The interface
 * defines only the syntax of calls on a method, so there is no ambiguity.*/

interface B {
    int m();
}

interface C {
    int m();
}

class D implements B, C {
    void p() {
	System.out.println(m());
    }

    public int m() {
	return 5;
    }
}
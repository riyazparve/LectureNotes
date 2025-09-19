package com.riyaz.oops.inheritance.ex3;

/*
 * 3. B and D are classes and C is an interface, in version 7 or less
 * To the right, class B declares method m and interface C declares
 * abstract m. Since D inherits m from B, D need not declare m again; it is
 * already available. There is no ambiguity here because interface C defines only the syntax of calls on m.
 * Suppose B does not declare m to be public. Then there is a syntax
 * error: inherited method m cannot hide public abstract method m in C.
 * There is a choice: either have m in B be public or declare public method m in D.*/

class B {
    public int m() {
	return 0;
    }
}

interface C {
    int m();
}

class D extends B implements C {
    void p() {
	System.out.println(m());
    }
}

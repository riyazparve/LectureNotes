package com.riyaz.oops.inheritance.ex5;

/*
 * 5. How does one call the interface default method?
 * In method D.p, how does one call inherited default method
 * C.m? Use C.super.... to designate the implemented interface C
 * whose method is to be called:
 * C.super.m();
 * Here, there is no ambiguity. In method p, a call m() calls method m
 * in inherited from class B, and a call C.super.m() calls default
 * method m inherited from interface C.
*/

class B {
    public int m() {
	return 0;
    }
}

interface C {
    default int m() {
	return 1;
    }
}

class D extends B implements C {
    void p() {
	System.out.println(C.super.m());
    }
}
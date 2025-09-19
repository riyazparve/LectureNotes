package com.riyaz.oops.inheritance.ex4;

/*
 * 4. Default interface methods in Java version 8
 * Version 8 of Java, released in Spring 2014, allowed default
 * methods in interfaces, as shown to the right. Since interface C has a
 * default method m, class D does not have to override m; if it doesn't,
 * the default method is used.
 * Ah, but now we have a problem. With the classes and interfaces shown to the right, 
 * what method m will be called in method D.p?
 * The one in class B or the one in interface C?
 * 
 * For backward compatibility (a Java 7 program should run in
 * Java 8) the Java designers ruled that the method in B should be
 * called: the superclass has precedence over the interface.
 * */


class K {
    public int m() {
	return 0;
    }
}

interface L {
    default int m() {
	return 1;
    }
}

class R extends K implements L {
    void p() {
	System.out.println(m());
    }
}
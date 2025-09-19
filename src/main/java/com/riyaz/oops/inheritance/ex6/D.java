package com.riyaz.oops.inheritance.ex6;

/*6. No class extension, no multiple interfaces with a default
 * If class D does not extend a class and implements two interfaces that both have a default method m, 
 * as shown in the example,
 * the program has a syntax error and won’t compile. Even if
 * method m in one of the interfaces is abstract, it’s still a syntax
 * error.
 * */

interface C1 {
    default int m() {
	return 1;
    }
}

interface C2 {
    default int m() {
	return 2;
    }
}

//class D implements C1, C2 { // syntax error: won’t compile
class D {
}
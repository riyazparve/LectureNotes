package com.riyaz.designpatterns.solid;

/*
 * To understand the SOLID principles, let us take the help of a bird. 
 * A bird is a living creature that can fly, eat, and make a sound. How can we design a bird?
 * The simplest solution would be to create a
 * Bird class with different attributes and methods. 
 * A bird could have the following attributes: Weight, Color, Type, Size, BeakType
 * A bird would also exhibit the following behaviors: Fly, Eat, Make a sound
 * */
public class BirdV0 {
    private int weight;
    private String colour;
    private String type;
    private String size;
    private String beakType;

    // The fly method is implemented in a way that it checks the type of bird and then calls the appropriate method.
    // This is not a good design as it violates the SOLID principles.
    //    Single Responsibility Principle - A class should have only one reason to change.
    //    There should never be more than one reason for a class/code unit to change. 
    //    Every class should have only one responsibility
    //    Open/Closed Principle - A class should be open for extension but closed for modification.
    //  The below code exhibits the following problems:
    //	Readability - The code is not readable. It is difficult to understand what the code is doing.
    //	Testing - It is difficult to test the code. We would have to test each type of bird separately.
    //	Reusability - The code is not reusable. If we want to re-use the code of specific type of bird, 
    //       		we would have to change the above code.
    //	Parallel development - The code is not parallel development friendly. If multiple developers are working 
    //    		on the same code, they could face merge conflicts.
    //	Multiple reasons to change - The code has multiple reasons to change. 
    //    		If we want to change the way a type of bird flies, we would have to change the code in the fly method.
    //	
    public void fly() {
	if (type.equals("eagle")) {
	    // flyLikeEagle();
	} else if (type.equals("penguin")) {
	    // flyLikePenguin();
	} else if (type.equals("parrot")) {
	    // flyLikeParrot();
	}
    }

    public void eat() {
    }

    public void makeSound() {
    }

    public int getWeight() {
	return weight;
    }

    public void setWeight(int weight) {
	this.weight = weight;
    }

    public String getColour() {
	return colour;
    }

    public void setColour(String colour) {
	this.colour = colour;
    }

    public String getType() {
	return type;
    }

    public void setType(String type) {
	this.type = type;
    }

    public String getSize() {
	return size;
    }

    public void setSize(String size) {
	this.size = size;
    }

    public String getBeakType() {
	return beakType;
    }

    public void setBeakType(String beakType) {
	this.beakType = beakType;
    }
}
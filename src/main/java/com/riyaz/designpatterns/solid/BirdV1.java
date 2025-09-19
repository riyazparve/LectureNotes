package com.riyaz.designpatterns.solid;

/*
 * To understand the SOLID principles, let us take the help of a bird. 
 * A bird is a living creature that can fly, eat, and make a sound. How can we design a bird?
 * The simplest solution would be to create a
 * Bird class with different attributes and methods. 
 * A bird could have the following attributes: Weight, Color, Type, Size, BeakType
 * A bird would also exhibit the following behaviors: Fly, Eat, Make a sound
 * */
public abstract class BirdV1 {
    private int weight;
    private String colour;
    private String type;
    private String size;
    private String beakType;

    //    Single Responsibility Principle - A class should have only one reason to change.
    //    There should never be more than one reason for a class/code unit to change. 
    //    Every class should have only one responsibility
    //    Open/Closed Principle - A class should be open for extension but closed for modification.
    //    Let us fix the SRP and OCP violation in the BirdV0 class. 
    //    In order to fix the SRP violations, we would consider having a parent class Bird and 
    //	  child classes Eagle, Penguin, and Parrot. 
    //    Since, different birds have the same attributes and behaviors, we would want to use classes. 
    //    An instance of the Bird class does not make sense, hence we would use an abstract class	
    public abstract void fly();

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

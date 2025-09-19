package com.riyaz.designpatterns.solid;

import java.util.ArrayList;
import java.util.List;

/*
 * To understand the SOLID principles, let us take the help of a bird. 
 * A bird is a living creature that can fly, eat, and make a sound. How can we design a bird?
 * The simplest solution would be to create a
 * Bird class with different attributes and methods. 
 * A bird could have the following attributes: Weight, Color, Type, Size, BeakType
 * A bird would also exhibit the following behaviors: Fly, Eat, Make a sound
 * */
public abstract class BirdV2 {
    private int weight;
    private String colour;
    private String type;
    private String size;
    private String beakType;

    //    Single Responsibility Principle - A class should have only one reason to change.
    //    There should never be more than one reason for a class/code unit to change. 
    //    Every class should have only one responsibility
    //    Open/Closed Principle - A class should be open for extension but closed for modification.
    //    Liskov Substitution Principle - Sub types must be substitutable for their base types.

    //    We have also added a fly() method to the Bird class. 
    //    All the subclasses of Bird have to implement this method.
    //    Lets consider we have Eagle, Parrot, and Penguin classes that extend the Bird class.
    //    A penguin cannot fly, yet we have added a fly() method to the Penguin class.
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

    public static void main(String[] args) {
	//	List<BirdV2> birds = List.of(new EagleV2(), new ParrotV2(), new PenguinV2());
	List<BirdV2> birds = new ArrayList<>();
	birds.add(new EagleV2());
	birds.add(new ParrotV2());
	birds.add(new PenguinV2());

	for (BirdV2 bird : birds) {
	    bird.fly();
	}
    }
}

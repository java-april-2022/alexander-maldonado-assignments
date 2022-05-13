package com.java.zooKeeper.controllers;

public class Gorilla extends Mammal{
	public Gorilla(int energy) {
		super(energy);
		// TODO Auto-generated constructor stub
	}

	public void throwSomething() {
		System.out.println("The gorilla has thrown something and has lost -5 energy");
		this.energy -=5;
	}
	
	public void eatBananas() {
		System.out.println("The gorilla ate a banana and gained +10 energy");
		this.energy +=10;
	}
	
	public void climb() { 
		System.out.println("The gorilla has started climbing and has lost -10 energy");
		this.energy -=10;
	}
}

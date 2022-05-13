package com.java.zooKeeper.controllers;

public class Test {
	
	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla(250);
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.eatBananas();
		gorilla.eatBananas();
		gorilla.climb();
		System.out.println("Gorilla's energy at" + gorilla.displayPercentage() );
		
		Bat bat = new Bat(300);
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.eatHumans();
		bat.eatHumans();
		bat.fly();
		bat.fly();
		System.out.println("Bat's energy at" + bat.displayPercentage());
		
	}

}

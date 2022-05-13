package com.java.zooKeeper.controllers;

public class Bat extends Mammal{

	public Bat(int energy) {
		super(energy);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.println("pffpffpfff.. Bat started to fly and decreased it's energy by -50");
		this.energy -=50;
	}
	
	public void eatHumans() {
		System.out.println("so- well, never mind, bat has increased it's energy by +25");
		this.energy +=25;
	}
	
	public void attackTown() {
		System.out.println("Wee-woo-wee-woo, the bat has caused a fire and decreased it's energy by -100");
		this.energy -=100;
	}
}

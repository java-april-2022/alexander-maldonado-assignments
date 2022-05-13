package com.java.zooKeeper.controllers;

public class Mammal {
	protected int energy;
	
	public Mammal(int energy) {
		this.energy = energy;
	}
	
	public int displayPercentage() {
		System.out.println("Energy percent is at" + this.energy);
		return this.energy;
	}
}

package com.kriti;

public class Vehicle {
	private int currentDirection;
	private int currentVelocity;
	private String name;
	private String size;
	public Vehicle(String name, String size) {

		this.name = name;
		this.size = size;

		this.currentDirection = 0;
		this.currentVelocity = 0;
	}

	public void steer(int direction) {
		this.currentDirection = direction;
		System.out.println("Vehicle.steer() : Steering at " + this.currentDirection + " degrees.");
	}

	public void move(int velocity, int direction) {
		currentVelocity = velocity;
		currentDirection = direction;
		System.out.println("Vehicle.move(): Moving at " + currentVelocity + " in direction " + currentDirection +" degrees.");

	}

	public int getCurrentDirection() {
		return currentDirection;
	}
	public int getCurrentVelocity() {
		return currentVelocity;
	}
	public String getName() {
		return name;
	}
	public String getSize() {
		return size;
	}
	
	public void stop() {
        this.currentVelocity = 0;
    }

}

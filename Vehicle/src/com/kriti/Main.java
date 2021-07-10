package com.kriti;

public class Main {

	public static void main(String[] args) {
		Venue venue = new Venue(36);
		venue.steer(30);
		venue.accelerate(30);
		venue.accelerate(20);
		venue.accelerate(-42);
	}

}

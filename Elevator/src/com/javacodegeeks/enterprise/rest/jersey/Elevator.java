package com.javacodegeeks.enterprise.rest.jersey;

public class Elevator {
	int currentfloor;
	int headingfloor;
	boolean movement;
	boolean doors;
	int trip = 0;

	void goToFloor(int s) {
		headingfloor = s;
		System.out.println("\nLift is heading to floor=" + headingfloor);
	}

	void openDoors() {
		doors = true;
		System.out.println("\nDoors are open\n");
		if(trip == 100) {
			System.out.println("\nElevator is under maintenance\n");
		}
	}

	void closeDoors() {
		doors = false;
		System.out.println("\nDoors are close\n");
	}

	void goingUp() {
		if(trip <= 100) {
			movement = true;
		}
	}

	void goingDown() {
		if(trip <= 100) {
			movement = false;
		}
	}

	void print(int h) {
		currentfloor = h;
		System.out.print("\n@@Heading please wait@@\n");
		if(trip <= 100) {
			if (headingfloor > currentfloor) {
				System.out.print("\nMovement up\n");
				goingUp();
				trip++;
			} else {
				System.out.print("\nMovement down\n");
				goingDown();
				trip++;
			}
		}
	}
}


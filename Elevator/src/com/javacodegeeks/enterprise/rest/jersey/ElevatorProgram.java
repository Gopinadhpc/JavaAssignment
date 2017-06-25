package com.javacodegeeks.enterprise.rest.jersey;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ElevatorProgram {
	public static void main(String args[]) throws IOException {
		Elevator ob = new Elevator();
		ob.openDoors();
		System.out.print("\nPresent floor=");
		BufferedReader stdin1 = new BufferedReader(new InputStreamReader(System.in));
		String h;
		h = stdin1.readLine();
		int a = Integer.parseInt(h);
		System.out.print("\nDesired floor=");
		BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
		String l;
		l = stdin.readLine();
		int u = Integer.parseInt(l);
		ob.goToFloor(u);
		ob.print(a);
		ob.closeDoors();
	}
}
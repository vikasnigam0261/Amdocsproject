package com.amdocs.Medical.entities;

import java.util.Scanner;

public class doctorDetails {
	private Scanner sc = new Scanner(System.in);
	Doctor doctor;
	public int takeId() {
		System.out.println("                                    ");
		System.out.println("ENTER ID: ");
		int id = Integer.parseInt(sc.nextLine());
		return id;
	}
}

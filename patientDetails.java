package com.amdocs.Medical.entities;

import java.util.Scanner;

public class patientDetails {
	private Scanner sc = new Scanner(System.in);
	Patient patient;
	public Patient takeInput() {
		patient = new Patient();
		System.out.println("ENTER YOU FIRST NAME: ");
		String firstName = sc.nextLine();
		patient.setFirstName(firstName);
		
		System.out.println("ENTER YOU LAST NAME:  ");
		String lastName = sc.nextLine();
		patient.setLastName(lastName);
		
		System.out.println("ENTER YOU AGE:  ");
		String age = sc.nextLine();
		patient.setAge(age);
		
		System.out.println("ENTER YOU PLACE:  ");
		String place = sc.nextLine();
		patient.setPlace(place);
		
		System.out.println("ENTER YOU MOBILE NO:  ");
		String mobileno = sc.nextLine();
		patient.setMobileNo(mobileno);
		
		System.out.println("ENTER YOU ISSUE:  ");
		String issue = sc.nextLine();
		patient.setIssue(issue);
		
		System.out.println("DOCTOR NAME:  ");
		String doctorName = sc.nextLine();
		patient.setDoctorName(doctorName);
		
		System.out.println("ENTER YOUR CHOISE:  ");
		System.out.println("1.EMERGENCY APPOINMENT or  2.NORMAL CONSULTING");
		String choice = sc.nextLine();
		patient.setChoice(choice);
		
		System.out.println("GRAND TOTAL:  ");
		int price = sc.nextInt();
		if(choice == "1") {
			price = 600;	
		}else {
			price = 400;
		}
		patient.setPrice(price);
		
		
		return patient;
		
			
	}
	public int takeId() {
		System.out.println("                                    ");
		System.out.println("ENTER ID: ");
		int id = Integer.parseInt(sc.nextLine());
		return id;
	}

}

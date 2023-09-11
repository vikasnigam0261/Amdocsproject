package com.amdocs.Medical;

import java.util.Scanner;

import com.amdocs.Medical.entities.DoctorChoice;
import com.amdocs.Medical.entities.PatientChoice;

public class App
{
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main( String[] args ) throws InterruptedException
	
    {
		boolean mark = true ;
    	while (mark) {
    		
        System.out.println( " ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ WELCOME ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺ ☺" );
        System.out.println( "*******************************************************************************" );
        Thread.sleep(1000);
        System.out.println("                         Online Doctor Appointment System                       " );
        System.out.println( "*******************************************************************************" );
        Thread.sleep(1000);
        System.out.println( "        Good health and good sense are two of life's greatest blessings.       " );
        System.out.println( "*******************************************************************************");
        Thread.sleep(1000);
        System.out.println("\n           1.PATIENT");
        System.out.println("\n           2.DOCTOR");
      //System.out.println("\n           3.Appointment");
        System.out.println("\n           3.EMERGENCY CONTACT");
        System.out.println("\n           0.EXIT");

       int vikas = Integer.parseInt(scanner.nextLine());
			switch (vikas) {
			case 1:
				uponChoosingPatient();
				break;
				case 2:
				uponChoosingDoctor();
				break;
				case 3:
					uponEmergencyContact();
					break;
			case 0:
				System.out.println("                        THANK YOU  😊 😊 😊                                 ");
				System.exit(0);
				mark = false;
			default:
				System.out.println("Try again");
			
    }
    	}
    }

private static void uponEmergencyContact() throws InterruptedException { //InterruptedException for thread.sleep(1000)
	           System.out.println( "              'It is better to offer no excuse than a bad one'              " );
	           Thread.sleep(1000);
	           System.out.println( "               EMERGENCY CONTACT (ICU) CALL ON :0990-8990-0001             " );
	           System.out.println( "               AMBULANCE SERVICE       CALL ON :0990-8990-0002             " );
	           System.out.println( "                                                                           " );
	           System.out.println( "                                                                           " );
	           }

//CALLING THE FUNCTIONS / METHODS ;
   
  private static void  uponChoosingPatient() {
	  PatientChoice patientchoice = new PatientChoice();
	  patientchoice.OptionsChoosed();
	 
	  
	  
	  
  }
  
 private static void uponChoosingDoctor() {
	 DoctorChoice doctorchoice = new DoctorChoice();
	 doctorchoice.optionsChoosed();
	  
 }
    }




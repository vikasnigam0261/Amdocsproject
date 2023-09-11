package com.amdocs.Medical.entities;



import java.util.Scanner;

import com.amdocs.Doa.impl.PatientImpl;
import com.amdocs.mainDao.PatientDoa;

public class PatientChoice {
	private Scanner sc ;
	//private static Scanner scanner = new Scanner(System.in);
	public void OptionsChoosed()
	{
		sc=new Scanner(System.in);
		PatientDoa patientdao = new PatientImpl();
	System.out.println( "                     WELCOME TO CUSTOMER PAGE                        ");
	System.out.println( "                     ************************                        ");

	
	boolean mark = true ;
	while(mark) {
	    System.out.println("                   SELECT YOUR CHOICE                              ");
		System.out.println( "              ****************************                        ");

	    System.out.println("\n                   1.Book an appointment                         ");
	    System.out.println("\n                   2.Modify appointment details                  ");
		System.out.println("\n                   3.Delete an appointment                       ");
		System.out.println("\n                   4.View single record                          ");
		System.out.println("\n                   5.View all records                            ");
		System.out.println("\n                   6.Exit                                        ");
		int vikas = Integer.parseInt(sc.nextLine());
		switch (vikas) {
		case 1:
			patientdao.bookAppointment();
			break;
		case 2:
			patientdao.updateAppointment();
			break;
		case 3:
			patientdao.deleteAppointment();
			break;
		case 4:
			patientdao.viewSingle();
			break;
		case 5:
			patientdao.viewAll();
			break;
		case 6:
			System.out.println( "                    EXITED                                    " );
			System.out.println( "                                                              " );
			mark = false ;
			break;
			default:
				System.out.println( "              TRY AGAIN :)                                " );
				System.out.println( "                                                              " );
			break;
		}	
		}
		}
		}

package com.amdocs.Medical.entities;

import java.util.Scanner;

import com.amdocs.Doa.impl.DoctorImpl;
import com.amdocs.Doa.impl.PatientImpl;
import com.amdocs.mainDao.DoctorDao;
import com.amdocs.mainDao.PatientDoa;

public class DoctorChoice {
	private Scanner sc ;
	//private static Scanner scanner = new Scanner(System.in);
	public void optionsChoosed()
	{
		sc=new Scanner(System.in);
		DoctorDao doctordao = new DoctorImpl();
	System.out.println( "-------WELCOME TO DOCTOR PAGE-------\n" );
	boolean mark = true ;
	while(mark) {
	    System.out.println("             SELECT YOUR DOCTOR ------->" );
	    System.out.println("\n           1.Book an DOCTOR");

		int vikas = Integer.parseInt(sc.nextLine());
		switch (vikas) {
		case 1:
			doctordao.viewAll();
			break;
		case 2:
		//	doctordao.UpdateAppointment();
			break;
		case 3:
			//patientdao.DeleteAppointment();
			break;
		case 4:
		//	patientdao.ViewSingle();
			break;
		case 5:
		//	patientdao.ViewAll();
			break;
		case 6:
			System.out.println( "                    EXITED                                    " );
			System.out.println( "                                                              " );
			mark = false ;
			break;
			default:
			System.out.println( "              TRY AGAIN :)                                    " );
			System.out.println( "                                                              " );
			break;
		}	
		}
		}
		}


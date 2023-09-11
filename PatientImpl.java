package com.amdocs.Doa.impl;
import com.amdocs.Medical.entities.Patient;
import com.amdocs.Medical.entities.patientDetails;
import com.amdocs.mainDao.PatientDoa;
import com.amdocs.mainDao.dbDao;


public class PatientImpl implements PatientDoa {
	
	dbDao dbdao = new dbImpl();
	

	@Override
	public void bookAppointment() {
		patientDetails patientdetails = new patientDetails();
		Patient patient = patientdetails.takeInput();
		boolean Mark = dbdao.addToDB(patient);
		if(Mark == true) {
			System.out.println("Inserted Succesfully");
		}
		else {
			System.out.println("Insertion Failed");
			
		}
		
		
	}

	@Override
	public void updateAppointment() {
		patientDetails patientdetails = new patientDetails();
		int id = patientdetails.takeId();
		Patient patient = patientdetails.takeInput();
		
		boolean Mark = dbdao.updateDB(id,patient);
		if(Mark==true) {
			System.out.println("Updated");
		}
		else {
			System.out.println("Update Failed");
		}
	}

	@Override
	public void deleteAppointment() {
		patientDetails patientdetails=new patientDetails();
		int id = patientdetails.takeId();
		//Patient patient = patientdetails.takeInput();
		
		boolean Mark = dbdao.delete(id);
		if(Mark==true) {
			System.out.println("Deleted");
		}
		else {
			System.out.println("Delete Failed");
		}
	}
		
	

	@Override
	public void viewSingle() {
		patientDetails patientdetails=new patientDetails();
		int id = patientdetails.takeId();
		dbdao.viewSingleRecord(id);
		
	}

	@Override
	public void viewAll() {
		// TODO Auto-generated method stub
		dbdao.viewAllRecord();
		
	}
	
}

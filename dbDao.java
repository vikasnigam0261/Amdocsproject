package com.amdocs.mainDao;
 
import com.amdocs.Medical.entities.Patient;

public interface dbDao{
	
	public boolean addToDB(Patient patient);
	
	public boolean updateDB(int id,Patient patient);
	
	public boolean delete(int id);
	
	public void viewSingleRecord(int id);
	
	public void viewAllRecord();
	
	public  void viewAllDoctor();


	
}
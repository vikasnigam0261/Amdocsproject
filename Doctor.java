package com.amdocs.Medical.entities;
public class Doctor extends Object{
	//Instance Variables
	 int Doctor_id;
	 public int getId() {
		return Doctor_id;
	}
	public void setId(int Doctor_id) {
		this.Doctor_id = Doctor_id;
	}

	String Name;
	
	 String Department;
	 String Year;
	 String phonenumber;
	 String email;
	public int getDoctor_id() {
		return Doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		Doctor_id = doctor_id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String firstname) {
		Name = firstname;
	}
	public String getDepartment() {
		return Department;
	}
	public void setDepartment(String department) {
		Department = department;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}

	
	

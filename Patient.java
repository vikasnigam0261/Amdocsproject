package com.amdocs.Medical.entities;
public class Patient extends Object{
	//Instance Variables
	 int id;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	String firstName;
	 String lastName;
	 String Age;
	 String Place;
	 String mobileNo;
	 String Issue;
	
	
	public String getIssue() {
		return Issue;
	}
	public void setIssue(String issue) {
		Issue = issue;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String Age) {
		this.Age = Age;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Patient [firstName=" + firstName + ", lastName=" + lastName + ", Age=" + Age
				+ ", Place=" + Place + ",Mobile No.=" + mobileNo +",Location="+ Place + ",Issue=" + Issue +"]";
	}
	
	
	

}
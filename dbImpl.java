package com.amdocs.Doa.impl;

import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.amdocs.Medical.entities.Patient;
import com.amdocs.db.DBConnection;
import com.amdocs.mainDao.dbDao;

public class dbImpl implements dbDao {
	
	//private static DBConnection dbConnection = new DBConnection();
	private static Connection connection = DBConnection.createConnection();
	
	@Override
	public boolean addToDB(Patient patient) {
		try {
			String sql = "INSERT INTO users(first_name,last_name,Age,Place,Mobile_no,Issue) VALUES (?,?,?,?,?,?)";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,patient.getFirstName());
			ps.setString(2,patient.getLastName());
			ps.setString(3,patient.getAge());
			ps.setString(4,patient.getPlace());
			ps.setString(5,patient.getMobileNo());
			ps.setString(6,patient.getIssue());
			
			int executeUpdate = ps.executeUpdate();
			ps.close();
			if(executeUpdate>0) {
				return true;
			}
			}
		catch(Exception e)
		{
System.out.println("Error: "+e);
		}
		return false;
	}
	
	@Override
	public boolean updateDB(int id,Patient patient){
		//String sql = "UPDATE users SET first_name=?,last_name=?,Age=?,Place=?,Mobile_no=?,Issue=? WHERE id=?";
		try {
			String sql = "UPDATE users SET first_name=?,last_name=?,Age=?,Place=?,Mobile_no=?,Issue=? WHERE id=?";
			
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setString(1,patient.getFirstName());
			ps.setString(2,patient.getLastName());
			ps.setString(3,patient.getAge());
			ps.setString(4,patient.getPlace());
			ps.setString(5,patient.getMobileNo());
			ps.setString(6,patient.getIssue());
			ps.setInt(7, id);
			
			int executeUpdate = ps.executeUpdate();
			ps.close();
			if(executeUpdate>0) {
				return true;
			}
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return false;
	}
	
	@Override
	public boolean delete(int id){
		
		try {
			String sql = "DELETE FROM users  WHERE id=?";
			PreparedStatement ps=connection.prepareStatement(sql);
			ps.setInt(1,id);
			int executeUpdate = ps.executeUpdate();
			ps.close();
			if(executeUpdate>0) {
				return true;
			}
	}catch (SQLException e) {
		e.printStackTrace();
	}
		return false;
	}
	
	
	@Override
	public void viewSingleRecord(int id) {
	
	try {
		String sql ="SELECT * FROM users WHERE id= ?";
		PreparedStatement ps=connection.prepareStatement(sql);
		ps.setInt(1,id);
		ResultSet resultSet = ps.executeQuery();
		if(resultSet.next()) {
			System.out.println("Patient id:"+resultSet.getInt("id"));
			System.out.println("Patient id:"+resultSet.getString("first_name"));
			System.out.println("Patient id:"+resultSet.getString("last_name"));
			System.out.println("Patient id:"+resultSet.getString("issue"));
		}
		resultSet.close();
		ps.close();
			
}catch (SQLException e) {
	e.printStackTrace();
}
	
	
}
	
		
	@Override
	public void viewAllRecord(){
		
		try {
			String sql ="SELECT * FROM users";
			PreparedStatement ps=connection.prepareStatement(sql);
			ResultSet resultSet = ps.executeQuery();
			while(resultSet.next()) {
				System.out.println("Patient id:"+resultSet.getInt("id"));
				System.out.println("Patient id:"+resultSet.getString("first_name"));
				System.out.println("Patient id:"+resultSet.getString("last_name"));
				System.out.println("Patient id:"+resultSet.getString("issue"));
			}
			resultSet.close();
			ps.close();
				
	}catch (SQLException e) {
		e.printStackTrace();
	}
		
		
	}

	@Override
	public void viewAllDoctor() {
		String sql ="SELECT * FROM Doctor";
		try {
		PreparedStatement ps=connection.prepareStatement(sql);
		ResultSet resultSet = ps.executeQuery();
		while(resultSet.next()) {
			System.out.println("Patient id:"+resultSet.getInt("Doctor_id"));
			System.out.println("Patient id:"+resultSet.getString("Firstname"));
			System.out.println("Patient id:"+resultSet.getString("Lastname"));
			System.out.println("Patient id:"+resultSet.getString("Year_exp"));
			System.out.println("Patient id:"+resultSet.getString("phonenumber"));
			System.out.println("Patient id:"+resultSet.getString("email"));
			
		}
		resultSet.close();
		ps.close();
			
}catch (SQLException e) {
	e.printStackTrace();
}
	
	
}

		
	}

	



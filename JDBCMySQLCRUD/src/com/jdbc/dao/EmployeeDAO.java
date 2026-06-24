package com.jdbc.dao;

import java.sql.*;
import com.jdbc.connection.DBConnection;
import com.jdbc.model.Employee;

public class EmployeeDAO {
	public void insertEmployee(Employee emp) {
		try {
			Connection con = DBConnection.getConnection();
			String QUERY = "INSERT INTO employee(name, email, salary)" + " values(?, ?, ?)";
			
			PreparedStatement ps = con.prepareStatement(QUERY);
			ps.setString(1, emp.getName());
			ps.setString(2, emp.getEmail());
			ps.setDouble(3, emp.getSalary());
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				System.out.println("Employee inserted successfully");
			}
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getAllEmployees() {
		try {
			Connection con = DBConnection.getConnection();
			String QUERY = "SELECT * FROM employee";
			
			PreparedStatement ps = con.prepareStatement(QUERY);
			
			ResultSet rs = ps.executeQuery();
			
			System.out.println("Employee records");
			System.out.println("Id,    Name,    Email,    salary");
			
			while(rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String email = rs.getString("email");
				double salary = rs.getDouble("salary");
				
				System.out.println(id + ", \t" + name + ", \t" + email + ", \t" + salary);
			}
			con.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void updateEmployeeSalary(int id, double salary) {
		try {
			Connection con = DBConnection.getConnection();
			
			String QUERY = "UPDATE employee " + "SET salary = ? " + "WHERE id = ?";
			
			PreparedStatement ps = con.prepareStatement(QUERY);
			
			ps.setDouble(1, salary);
			ps.setInt(2, id);
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				System.out.println("Updated employee details");
			}
			con.close();					
					
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteEmployee(int id) {
		try {
			Connection con = DBConnection.getConnection();
			
			String QUERY = "DELETE FROM employee " + "WHERE id = ? ";
			
			PreparedStatement ps = con.prepareStatement(QUERY);
			
			ps.setInt(1, id);
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				System.out.println("Deleted employee details");
			}
			con.close();					
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}

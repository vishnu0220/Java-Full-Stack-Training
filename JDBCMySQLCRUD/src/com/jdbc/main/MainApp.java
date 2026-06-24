package com.jdbc.main;

import com.jdbc.dao.EmployeeDAO;
import com.jdbc.model.Employee;
public class MainApp {
	public static void main(String args[]) {
		EmployeeDAO dao = new EmployeeDAO();
		
		Employee emp = new Employee("Amol", "amol@gmail.com", 75000.0);
		
		dao.insertEmployee(emp);
		dao.getAllEmployees();
		dao.updateEmployeeSalary(1, 90000.0);
		dao.getAllEmployees();
		dao.deleteEmployee(1);
		dao.getAllEmployees();
	}
}

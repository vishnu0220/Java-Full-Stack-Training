package com.crud.dao;

import com.crud.model.Employee;
import com.crud.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

    // Method-level connection getter
    private Connection getConnection() {
        return DBConnection.getConnection();
    }

    // ADD EMPLOYEE
    public void addEmployee(Employee employee) {

        try (Connection connection = getConnection()) {

            String query =
                    "INSERT INTO employee(name,email,department,salary) VALUES(?,?,?,?)";

            PreparedStatement ps =
                    connection.prepareStatement(query);

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getDepartment());
            ps.setDouble(4, employee.getSalary());

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Employee Added Successfully");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // SELECT ALL
    public List<Employee> getAllEmployees() {

        List<Employee> employees = new ArrayList<>();

        try (Connection connection = getConnection()) {

            String query = "SELECT * FROM employee";

            Statement statement =
                    connection.createStatement();

            ResultSet rs =
                    statement.executeQuery(query);

            while (rs.next()) {

                Employee employee = new Employee();

                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setDepartment(rs.getString("department"));
                employee.setSalary(rs.getDouble("salary"));

                employees.add(employee);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employees;
    }

    // GET BY ID
    public Employee getEmployeeById(int id) {

        Employee employee = null;

        try (Connection connection = getConnection()) {

            String query = "SELECT * FROM employee WHERE id=?";

            PreparedStatement ps =
                    connection.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                employee = new Employee();

                employee.setId(rs.getInt("id"));
                employee.setName(rs.getString("name"));
                employee.setEmail(rs.getString("email"));
                employee.setDepartment(rs.getString("department"));
                employee.setSalary(rs.getDouble("salary"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employee;
    }

    // UPDATE
    public void updateEmployee(Employee employee) {

        try (Connection connection = getConnection()) {

            String query =
                    "UPDATE employee SET name=?, email=?, department=?, salary=? WHERE id=?";

            PreparedStatement ps =
                    connection.prepareStatement(query);

            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getDepartment());
            ps.setDouble(4, employee.getSalary());
            ps.setInt(5, employee.getId());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void deleteEmployee(int id) {

        try (Connection connection = getConnection()) {

            String query =
                    "DELETE FROM employee WHERE id=?";

            PreparedStatement ps =
                    connection.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
package com.example.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;

@Repository
public class EmployeeDAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // INSERT
    public int save(Employee emp) {

        String sql = "INSERT INTO employee(name,email,department,salary) VALUES(?,?,?,?)";

        return jdbcTemplate.update(sql,
                emp.getName(),
                emp.getEmail(),
                emp.getDepartment(),
                emp.getSalary());
    }

    // UPDATE
    public int update(Employee emp) {

        String sql = "UPDATE employee SET name=?,email=?,department=?,salary=? WHERE id=?";

        return jdbcTemplate.update(sql,
                emp.getName(),
                emp.getEmail(),
                emp.getDepartment(),
                emp.getSalary(),
                emp.getId());
    }

    // DELETE
    public int delete(int id) {

        String sql = "DELETE FROM employee WHERE id=?";

        return jdbcTemplate.update(sql, id);
    }

    // GET SINGLE
    public Employee getEmployeeById(int id) {

        String sql = "SELECT * FROM employee WHERE id=?";

        return jdbcTemplate.queryForObject(
                sql,
                new Object[]{id},
                new BeanPropertyRowMapper<>(Employee.class)
        );
    }

    // GET ALL
    public List<Employee> getAllEmployees() {

        String sql = "SELECT * FROM employee";

        return jdbcTemplate.query(
                sql,
                new BeanPropertyRowMapper<>(Employee.class)
        );
    }
}
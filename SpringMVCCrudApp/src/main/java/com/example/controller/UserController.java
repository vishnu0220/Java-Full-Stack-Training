package com.example.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.dao.EmployeeDAO;
import com.example.model.Employee;

@Controller
public class UserController {

    @Autowired
    private EmployeeDAO employeeDAO;

    // Home Page
    @GetMapping("/")
    public String home(Model model) {

        List<Employee> employees =
                employeeDAO.getAllEmployees();

        model.addAttribute("employees", employees);

        return "employeelist";
    }

    // Show Form
    @GetMapping("/addEmployee")
    public String addEmployeeForm(Model model) {

        model.addAttribute("employee", new Employee());

        return "employeeform";
    }

    // Save Employee
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute Employee employee) {

        employeeDAO.save(employee);

        return "redirect:/";
    }

    // Edit Form
    @GetMapping("/editEmployee/{id}")
    public String editEmployee(@PathVariable int id,
                               Model model) {

        Employee employee =
                employeeDAO.getEmployeeById(id);

        model.addAttribute("employee", employee);

        return "editemployee";
    }

    // Update Employee
    @PostMapping("/updateEmployee")
    public String updateEmployee(@ModelAttribute Employee employee) {

        employeeDAO.update(employee);

        return "redirect:/";
    }

    // Delete Employee
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id) {

        employeeDAO.delete(id);

        return "redirect:/";
    }
}
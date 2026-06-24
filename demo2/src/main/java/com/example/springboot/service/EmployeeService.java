package com.example.springboot.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.entity.Employee;
import com.example.springboot.repository.EmployeeRepository;

@Service
public class EmployeeService {

	@Autowired
    private EmployeeRepository repository;
	
	 // CREATE
    public Employee save(Employee employee) {
    	return repository.save(employee);
    }
    
    // GET ALL
    public List<Employee> getAllEmployees() {
    	return repository.findAll();
    }
    
    // GET BY ID
    public Employee getEmployee(Long id) {
    	return repository.findById(id).orElse(null);
    }
    
 // UPDATE
    public Employee updateEmployee(Long id,
                                   Employee employee) {
    	 Optional<Employee> optional =
                 repository.findById(id);
    	 
    	 if(optional.isPresent()) {
    		 Employee dbEmployee = optional.get();
    		 
    		 dbEmployee.setName(employee.getName());
    		 dbEmployee.setDepartment(employee.getDepartment());
    		 dbEmployee.setSalary(employee.getSalary());
    		 
    		 return repository.save(dbEmployee);
    	 }
    	 return null;
    }
    
    // PATCH
    public Employee updateSalary(Long id,
                                 double salary) {

        Employee emp =
                repository.findById(id).orElse(null);

        if(emp != null) {
            emp.setSalary(salary);
            return repository.save(emp);
        }

        return null;
    }
    
    // DELETE
    public void deleteEmployee(Long id) {
        repository.deleteById(id);
    }
}

package com.dna.service;

import com.dna.Repoisitory.EmployeeRepository;
import com.dna.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> emplist = new ArrayList<>();

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int eId){
        return employeeRepository.findById(eId).get();
    }

    public Employee addEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    public Employee updateEmployee(Employee emp){
        return employeeRepository.save(emp);
    }

    public Employee deleteEmployee(int eId){
        employeeRepository.deleteById(eId);
        return null;
    }
}

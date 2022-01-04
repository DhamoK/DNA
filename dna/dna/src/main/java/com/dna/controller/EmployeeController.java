package com.dna.controller;

import com.dna.model.Employee;
import com.dna.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("index")
    public ModelAndView pay() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("login1.jsp");
        return mv;
    }

    @GetMapping("/empById/{eId}")
    public Employee empById (@PathVariable(name="eId") int eId){
        return employeeService.getEmployeeById(eId);
    }

    @GetMapping("/empList")
    public List<Employee> empList(){
        return employeeService.getAllEmployees();
    }

    @PostMapping("/addemp")
    public Employee addEmployee(@RequestBody Employee emp){
        return employeeService.addEmployee(emp);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee emp){
        return employeeService.updateEmployee(emp);
    }

    @DeleteMapping("/deleteEmployee/{eId}")
    public Employee deleteEmployee(@PathVariable(name="eId") int eId){
       return employeeService.deleteEmployee(eId);
    }

}

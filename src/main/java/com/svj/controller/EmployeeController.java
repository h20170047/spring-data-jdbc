package com.svj.controller;

import com.svj.entity.Employee;
import com.svj.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService){
        this.employeeService= employeeService;
    }

    @PostMapping
    public String saveEmployee(@RequestBody Employee employee){
        return employeeService.saveEmployee(employee);
    }

    @GetMapping
    public List<Employee> getEmployees(){
        return employeeService.getEmployees();
    }

    @GetMapping("/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/name/{id}")
    public String getNameById(@PathVariable int id){
        return employeeService.getNameById(id);
    }

    @GetMapping("/{name}/{dept}")
    public List<Employee> findEmployeeByNameAndDept(@PathVariable String name, @PathVariable String dept){
        return employeeService.findEmployeeByNameAndDept(name, dept);
    }

    @PutMapping
    public String update(@RequestBody Employee employee){
        return employeeService.update(employee);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }
}

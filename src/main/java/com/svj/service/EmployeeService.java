package com.svj.service;

import com.svj.entity.Employee;
import com.svj.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository){
        this.employeeRepository= employeeRepository;
    }

    public String saveEmployee(Employee employee){
        int count = employeeRepository.saveEmployee(employee);
        return "RECORD INSERTED !"+count;
    }

    public List<Employee> getEmployees(){
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id){
        return employeeRepository.findById(id);
    }

    public String getNameById(int id){
        return employeeRepository.getNameById(id);
    }

    public List<Employee> findEmployeeByNameAndDept(String name, String dept){
        return employeeRepository.findByNameAndDept(name, dept);
    }

    public String update(Employee employee){
        int count= employeeRepository.update(employee);
        return count+" RECORD UPDATED!";
    }

    public String deleteEmployee(int id){
        int count= employeeRepository.delete(id);
        return count+" RECORD DELETED!";
    }

}

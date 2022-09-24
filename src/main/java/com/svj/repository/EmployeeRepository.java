package com.svj.repository;

import com.svj.entity.Employee;

import java.util.List;

public interface EmployeeRepository {

    int saveEmployee(Employee employee);

    List<Employee> findAll();

    Employee findById(int id);

    String getNameById(int id);

    List<Employee> findByNameAndDept(String name, String dept);

    int update(Employee employee);

    int delete(int id);
}

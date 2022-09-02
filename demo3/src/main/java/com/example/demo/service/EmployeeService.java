package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.entities.Employee;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;
    public Employee getEmployee(Long empId) {
        return employeeDAO.getEmployee(empId);
    }
    public Employee adEmployee(Employee empForm) {
        return employeeDAO.addEmployee(empForm);

    }
    public Employee updateEmployee(Employee empForm) {
        return employeeDAO.updateEmployee(empForm);
    }
    public void deleteEmployee(Long empId) {
        employeeDAO.deleteEmployee(empId);
    }
    public List<Employee> getAllemEmployees(){
        return employeeDAO.getAllEmployee();
    }
}

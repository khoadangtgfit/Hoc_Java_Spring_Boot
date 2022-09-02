package com.example.demo.controller;

import java.awt.PageAttributes.MediaType;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Employee;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping("\rest")

public class EmployeeRESTController {
    private EmployeeService employeeService;
    @RequestMapping(value = "/employees",
            method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE,
                    MediaType.APPLICATION_XML_VALUE})
    @ResponseBody
    public List<Employee> getEmployees(){
        List<Employee> list=employeeService.getAllemEmployees();
        return list;

    }
}

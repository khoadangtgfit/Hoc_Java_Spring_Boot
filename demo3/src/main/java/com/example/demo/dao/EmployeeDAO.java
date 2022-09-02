package com.example.demo.dao;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.example.demo.entities.Employee;

@Repository
public class EmployeeDAO {
    private static final Map<Long, Employee> empMap=new HashMap<Long,Employee>();
    static {
        initEmps();
    }
    private static void initEmps() {
        Employee emp1=new Employee(1L,"E01","Test 1");
        Employee emp2=new Employee(2L,"E02","Test 2");
        Employee emp3=new Employee(3L,"E03","Test 3");
        empMap.put(emp1.getEmpId(), emp1);
        empMap.put(emp2.getEmpId(), emp2);
        empMap.put(emp3.getEmpId(), emp3);
    }
    public Long getMaxEmpId() {
        Set<Long> keys=empMap.keySet();
        Long max=0L;
        for(Long key:keys) {
            if(key>max) {
                max=key;
            }
        }
        return max;
    }
    public Employee getEmployee(Long empId) {
        return empMap.get(empId);
    }
    public Employee addEmployee(Employee empForm) {
        Long empId=this.getMaxEmpId()+1;
        empForm.setEmpId(empId);
        empMap.put(empForm.getEmpId(),empForm );
        return empForm;
    }
    public Employee updateEmployee(Employee empFrom) {
        Employee empUpdate =this.getEmployee(empFrom.getEmpId());
        if(empUpdate!=null) {
            empUpdate.setEmpNo(empFrom.getEmpNo());
            empUpdate.setEmpName(empFrom.getEmpName());
        }
        return empUpdate;
    }
    public void deleteEmployee(Long empId) {
        empMap.remove(empId);
    }
    public List<Employee> getAllEmployee(){
        Collection<Employee> collection=empMap.values();
        List<Employee> list=new ArrayList<Employee>();
        list.addAll(collection);
        return list;
    }
}


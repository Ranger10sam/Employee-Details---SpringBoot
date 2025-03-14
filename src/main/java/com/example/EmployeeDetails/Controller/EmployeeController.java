package com.example.EmployeeDetails.Controller;

import com.example.EmployeeDetails.Model.Employee;
import com.example.EmployeeDetails.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @PostMapping("createEmp")
    public ResponseEntity<Employee> createEmp(@RequestBody Employee employee) {
        return employeeService.createEmp(employee);
    }

    @GetMapping("getAllEmp")
    public ResponseEntity<List<Employee>> getAllEmp() {
        return employeeService.getAllEmp();
    }
}

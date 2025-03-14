package com.example.EmployeeDetails.Controller;

import com.example.EmployeeDetails.Model.Department;
import com.example.EmployeeDetails.Model.Employee;
import com.example.EmployeeDetails.Service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("dept")
public class DepartmentController {

    @Autowired
    private DepartmentService deptService;

    @PostMapping("createDept")
    public ResponseEntity<Department> createDept(@RequestBody Department department) {
        return deptService.createDept(department);
    }

    @GetMapping("getAllDept")
    public ResponseEntity<List<Department>> getAllDept(){
        return deptService.getAllDept();
    }
}

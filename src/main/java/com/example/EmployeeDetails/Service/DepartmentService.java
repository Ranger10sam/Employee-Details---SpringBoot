package com.example.EmployeeDetails.Service;

import com.example.EmployeeDetails.Model.Department;
import com.example.EmployeeDetails.Model.Employee;
import com.example.EmployeeDetails.Repository.DepartmentDAO;
import jakarta.persistence.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentDAO deptDAO;

    public ResponseEntity<Department> createDept(Department department) {
        Department dept = deptDAO.save(department);
        return new ResponseEntity<>(dept, HttpStatus.CREATED);
    }

    public ResponseEntity<List<Department>> getAllDept() {
        return new ResponseEntity<>(deptDAO.findAll(), HttpStatus.OK);
    }
}

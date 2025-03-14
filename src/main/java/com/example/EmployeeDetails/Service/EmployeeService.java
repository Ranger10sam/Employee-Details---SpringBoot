package com.example.EmployeeDetails.Service;

import com.example.EmployeeDetails.Model.Department;
import com.example.EmployeeDetails.Model.Designation;
import com.example.EmployeeDetails.Model.Employee;
import com.example.EmployeeDetails.Repository.DepartmentDAO;
import com.example.EmployeeDetails.Repository.DesignationDAO;
import com.example.EmployeeDetails.Repository.EmployeeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeDAO empDAO;
    @Autowired
    DepartmentDAO deptDAO;
    @Autowired
    DesignationDAO desDAO;

    public ResponseEntity<Employee> createEmp(Employee employee) {
        // Fetch department and designation from DB using the IDs from the nested objects
        Department department = deptDAO.findById(employee.getDepartment().getId())
                .orElseThrow(() -> new RuntimeException("Department not found"));

        Designation designation = desDAO.findById(employee.getDesignation().getId())
                .orElseThrow(() -> new RuntimeException("Designation not found"));

        // Set the correct department and designation
        employee.setDepartment(department);
        employee.setDesignation(designation);

        // Save and return the newly created Employee
        return new ResponseEntity<>(empDAO.save(employee), HttpStatus.CREATED);
    }

    public ResponseEntity<List<Employee>> getAllEmp() {
        return new ResponseEntity<>(empDAO.findAll(), HttpStatus.OK);
    }
}

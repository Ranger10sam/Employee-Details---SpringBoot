package com.example.EmployeeDetails.Repository;

import com.example.EmployeeDetails.Model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {
}

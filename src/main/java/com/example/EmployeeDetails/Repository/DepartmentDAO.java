package com.example.EmployeeDetails.Repository;

import com.example.EmployeeDetails.Model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDAO extends JpaRepository<Department, Long> {

}

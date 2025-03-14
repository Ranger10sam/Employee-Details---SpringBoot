package com.example.EmployeeDetails.Repository;

import com.example.EmployeeDetails.Model.Designation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DesignationDAO extends JpaRepository<Designation, Long> {
}

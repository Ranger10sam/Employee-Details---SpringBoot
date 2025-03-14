package com.example.EmployeeDetails.Service;

import com.example.EmployeeDetails.Model.Designation;
import com.example.EmployeeDetails.Repository.DesignationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DesignationService {

    @Autowired
    DesignationDAO designationDAO;

    public ResponseEntity<Designation> createDesignation(Designation designation) {
        return new ResponseEntity<>(designationDAO.save(designation), HttpStatus.CREATED);
    }

    public ResponseEntity<List<Designation>> getAllDesignation() {
        return new ResponseEntity<>(designationDAO.findAll(), HttpStatus.OK);
    }
}

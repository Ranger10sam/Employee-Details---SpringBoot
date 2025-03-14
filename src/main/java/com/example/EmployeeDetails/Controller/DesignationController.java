package com.example.EmployeeDetails.Controller;

import com.example.EmployeeDetails.Model.Designation;
import com.example.EmployeeDetails.Service.DesignationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("designation")
public class DesignationController {

    @Autowired
    DesignationService designationService;

    @PostMapping("createDesignation")
    public ResponseEntity<Designation> createDesignation(@RequestBody Designation designation){
        return designationService.createDesignation(designation);
    }

    @GetMapping("getAllDesignation")
    public ResponseEntity<List<Designation>> getAllDesignation(){
        return designationService.getAllDesignation();
    }
}

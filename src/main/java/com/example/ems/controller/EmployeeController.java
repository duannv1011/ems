package com.example.ems.controller;

import com.example.ems.dto.EmployeeDto;
import com.example.ems.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @PostMapping("em-create")
    public ResponseEntity<EmployeeDto> createEmployee(EmployeeDto employeeDto) {
        EmployeeDto saveEmployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(saveEmployee, HttpStatus.CREATED);

    }
    @GetMapping()
    ResponseEntity<List<EmployeeDto>> getEmployees() {
        List<EmployeeDto> saveEmployee = employeeService.getAllEmployees();
        return new ResponseEntity<>(saveEmployee, HttpStatus.FOUND);
    }
    @GetMapping("{id}")
    ResponseEntity<EmployeeDto> getEmployeesById(@PathVariable("id") Long id) {
        EmployeeDto getEmployee = employeeService.getEmployeeById(id);
       return ResponseEntity.ok(getEmployee);
    }
}

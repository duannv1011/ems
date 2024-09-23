package com.example.ems.mapper;

import com.example.ems.dto.EmployeeDto;
import com.example.ems.entity.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMapper {
    public static EmployeeDto mapToEmployeeDto(Employee emp) {
        return new EmployeeDto(
                emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getEmail()
        );
    }
    public static List<EmployeeDto> mapToEmployeeDtoList(List<Employee> employees) {
        return employees.stream()
                .map(EmployeeMapper::mapToEmployeeDto) // assuming the method is in EmployeeService
                .collect(Collectors.toList());
    }
    public static Employee mapToEmployee(EmployeeDto emp) {
        return new Employee(
                emp.getId(), emp.getFirstName(), emp.getLastName(), emp.getEmail()
        );
    }
    public static List<Employee> mapToEmployeeList(List<EmployeeDto> employees) {
        return employees.stream()
                .map(EmployeeMapper::mapToEmployee) // assuming the method is in EmployeeService
                .collect(Collectors.toList());
    }
}

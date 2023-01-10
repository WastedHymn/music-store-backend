package com.chinook.musicstore.controller;

import com.chinook.musicstore.entities.Employee;
import com.chinook.musicstore.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/musicapi/employees")
public class EmployeesController {
    private final EmployeeService employeeService;

    @GetMapping("/findAllEmployees")
    public List<Employee> findAllEmployees(){
        return this.employeeService.findAllEmployees();
    }

}

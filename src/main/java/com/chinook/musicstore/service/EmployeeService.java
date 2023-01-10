package com.chinook.musicstore.service;

import com.chinook.musicstore.entities.Employee;
import com.chinook.musicstore.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    private final EmployeeRepository employeeRepository;

    public List<Employee> findAllEmployees(){
        return this.employeeRepository.findAll();
    }
}

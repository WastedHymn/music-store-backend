package com.chinook.musicstore.repository;

import com.chinook.musicstore.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}

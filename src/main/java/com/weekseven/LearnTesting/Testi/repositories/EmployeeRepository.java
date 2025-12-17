package com.weekseven.LearnTesting.Testi.repositories;

import com.weekseven.LearnTesting.Testi.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByEmail(String email);
}

package com.codeclan.example.onetomany_manytomany.repositories;

import com.codeclan.example.onetomany_manytomany.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}

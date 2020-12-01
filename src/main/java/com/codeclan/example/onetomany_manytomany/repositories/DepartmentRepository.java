package com.codeclan.example.onetomany_manytomany.repositories;

import com.codeclan.example.onetomany_manytomany.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}

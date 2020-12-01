package com.codeclan.example.onetomany_manytomany.repositories;

import com.codeclan.example.onetomany_manytomany.models.Employee;
import com.codeclan.example.onetomany_manytomany.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{}

package com.codeclan.example.onetomany_manytomany;

import com.codeclan.example.onetomany_manytomany.models.Department;
import com.codeclan.example.onetomany_manytomany.models.Employee;
import com.codeclan.example.onetomany_manytomany.models.Project;
import com.codeclan.example.onetomany_manytomany.repositories.DepartmentRepository;
import com.codeclan.example.onetomany_manytomany.repositories.EmployeeRepository;
import com.codeclan.example.onetomany_manytomany.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class OnetomanyManytomanyApplicationTests {

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Accounts");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Amy", "Browne", 1389, department);
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Alan", "Parley", 7892, department);
		employeeRepository.save(employee2);

	}

	@Test
	public void addEmployeeAndProjects(){
		Department department = new Department("HR");
		departmentRepository.save(department);
		Employee employee1 = new Employee("Billy", "Browne", 1389, department);
		employeeRepository.save(employee1);
		Project project1 = new Project("Massive Project", 89);
		projectRepository.save(project1);
		project1.addEmployee(employee1);
		projectRepository.save(project1);

	}

}

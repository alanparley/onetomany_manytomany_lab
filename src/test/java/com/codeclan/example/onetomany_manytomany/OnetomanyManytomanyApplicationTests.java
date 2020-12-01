package com.codeclan.example.onetomany_manytomany;

import com.codeclan.example.onetomany_manytomany.models.Department;
import com.codeclan.example.onetomany_manytomany.models.Employee;
import com.codeclan.example.onetomany_manytomany.repositories.DepartmentRepository;
import com.codeclan.example.onetomany_manytomany.repositories.EmployeeRepository;
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

	@Test
	void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department = new Department("Accounts");
		departmentRepository.save(department);

		Employee employee1 = new Employee("Amy", "Browne", 1389);
		employeeRepository.save(employee1);
		Employee employee2 = new Employee("Alan", "Parley", 7892);
		employeeRepository.save(employee2);

	}

}

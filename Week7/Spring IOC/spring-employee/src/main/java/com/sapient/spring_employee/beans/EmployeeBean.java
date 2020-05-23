package com.sapient.spring_employee.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.sapient.spring_employee.Employee;

@Configuration
@EnableAspectJAutoProxy
public class EmployeeBean {

	@Bean
	public Employee empFunc() {
		Employee emp = new Employee();
		emp.setCity("Default City from Java Container");
		emp.setName("Default name from Java Container");
		return emp;
	}
}

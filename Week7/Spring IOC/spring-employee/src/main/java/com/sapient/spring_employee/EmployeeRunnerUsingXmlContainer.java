package com.sapient.spring_employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sapient.spring_employee.util.Methods;

public class EmployeeRunnerUsingXmlContainer {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Employee employee = (Employee) context.getBean("employee");
		System.out.print("Enter employee id : ");
		String id = Methods.reader.nextLine();
		employee.setId(id);
		System.out.println(employee);
		
	}
}

package com.sapient.spring_employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sapient.spring_employee.beans.EmployeeBean;
import com.sapient.spring_employee.util.Methods;

public class EmployeeRunnerUsingJavaContainer {

	public static void main(String[] args) {

		ApplicationContext ctxt = new AnnotationConfigApplicationContext(EmployeeBean.class);
		Employee emp = ctxt.getBean(Employee.class);
		System.out.print("Enter employee id : ");
		String id = Methods.reader.nextLine();
		emp.setId(id);
		System.out.println(emp);
	}

}

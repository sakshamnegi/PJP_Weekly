package com.sapient.week5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentBO {
	
	private List<Student> studentList = new ArrayList<Student>();

	public void readStudent() {
		Student s = new Student();
		System.out.print("Student Id : ");
		s.setId(Integer.parseInt(CustomHelper.read.nextLine()));
		System.out.print("Name : ");
		s.setName(CustomHelper.read.nextLine());
		System.out.print("City : ");
		s.setCity(CustomHelper.read.nextLine());
		studentList.add(s);
		s = null;

	}

	public void displayStudent(Student s) {
		System.out.println(s);
	}
	
	public void displayStudentsFromCity(String city) {
		boolean flag = false;
		System.out.println("Students from " + city + " are : ");
		for(Student s: studentList) {
			if(s.getCity().equalsIgnoreCase(city)) {
				flag = true;
				System.out.println(s.getName());
			}
		}
		if (flag == false) {
			System.out.println("No record found!");
		}
		
	}
	
	public void displayCityWise() {
		Collections.sort(studentList, new CityComparator());
		for (Student s : studentList) {
			displayStudent(s);
		}

	}
	
	public void displayNameWise() {
		Collections.sort(studentList, new NameComparator());
		for (Student s : studentList) {
			displayStudent(s);
		}

	}
	public void displayStudent(int id) {
		boolean flag = false;
		for (Student s : studentList) {
			if (s.getId() == id) {
				flag = true;
				displayStudent(s);
			}
		}
		if (flag == false) {
			System.out.println("No record for the given ID");
		}
		
	}

	public static void main(String[] args) {
		int ch;
		StudentBO studentBO = new StudentBO();
		System.out.println("CHOICES \n"
				+ "1. Read Student info  \n2. Display all student info "
				+ "\n3. Display students from a city \n4. Display students name wise \n"
				+ "5. Display students city wise \n6. Display student by id");
		do {
			System.out.println("Enter choice : ");
			ch = Integer.parseInt(CustomHelper.read.nextLine());
			if (ch == 1) {
				// reading student info
				studentBO.readStudent();
			} else if (ch == 2) {
				// display student list
				if (studentBO.studentList.isEmpty()) {
					System.out.println("No records present!");
				} else {
					for (Student s : studentBO.studentList) {
						studentBO.displayStudent(s);
					}
				}

			} else if (ch == 3) {
				System.out.print("Enter city : ");
				studentBO.displayStudentsFromCity(CustomHelper.read.nextLine());

			} else if (ch == 4) {
				studentBO.displayNameWise();

			} else if (ch == 5) {
				studentBO.displayCityWise();

			} else if (ch == 6) {
				System.out.print("Enter id (integer) : ");
				studentBO.displayStudent(Integer.parseInt(CustomHelper.read.nextLine()));

			}

		} while (ch >= 1 && ch <= 6);

	}

	class CityComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {
			return o1.getCity().compareTo(o2.getCity());
		}
	}

	class NameComparator implements Comparator<Student> {

		@Override
		public int compare(Student o1, Student o2) {

			return o1.getName().compareTo(o2.getName());
		}

	}

}

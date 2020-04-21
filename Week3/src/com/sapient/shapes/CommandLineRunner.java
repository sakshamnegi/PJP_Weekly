package com.sapient.shapes;

public class CommandLineRunner {

	public static void main(String[] args) {
		Command_Line1 obj = new Command_Line1();
		obj.setData(args);
		try {
			obj.calData();
		} catch (Exception e) {
			System.out.println("Error occurred " + e.getLocalizedMessage());
		}
		try {
			obj.displayData();
		} catch (Exception e) {
			System.out.println("Error occurred " + e.getLocalizedMessage());
		}

	}

}

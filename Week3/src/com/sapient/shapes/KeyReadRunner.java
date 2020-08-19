package com.sapient.shapes;

import java.util.Scanner;

public class KeyReadRunner {

	public static void main(String[] args) {
		KeyRead_Line2 obj = new KeyRead_Line2();
		obj.read();
		System.out.println("Entered numbers : ");
		obj.display();
		System.out.println("Numbers after sorting : ");
		obj.sort();
		obj.display();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number to search for : ");
		int num = input.nextInt();
		if (obj.find(num) == true)
			System.out.println("Number found!");
		else
			System.out.println("Number not found!");

	}
}

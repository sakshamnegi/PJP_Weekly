package com.sapient.shapes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class KeyRead_Line2 {

	private ArrayList<Integer> numList = new ArrayList<Integer>();

	public void read() {
		Scanner input = new Scanner(System.in);

		System.out.println("How many numbers? : ");
		int n = input.nextInt();
		System.out.println("Enter " + n + " numbers : ");
		while (n > 0) {
			numList.add(input.nextInt());
			n--;
		}

	}

	public void display() {
		for (int num : numList) {
			System.out.println(num + " ");
		}
	}

	public void sort() {
		Collections.sort(numList);

	}

	public boolean find(int num) {
		return (numList.contains(num));
	}
}

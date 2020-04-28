package com.sapient.week4;

import java.util.HashMap;

public class Num_Process_Runner {

	public static void main(String[] args) {
		
		
		HashMap<Character, Num_Process> map = new HashMap<Character, Num_Process>();
		map.put('+', (int a, int b) -> {
			return (a + b);
		});
		map.put('-', (int a, int b) -> {
			return (a - b);
		});
		map.put('*', (int a, int b) -> {
			return (a * b);
		});
		map.put('/', (int a, int b) -> {
			return (a / b);
		});

		int x, y;
		Character ch;
		System.out.println("Enter two numbers ");
		x = Reader.read.nextInt();
		y = Reader.read.nextInt();
		System.out.println("Choose an operation ");
		System.out.println("+ for addition");
		System.out.println("- for subtraction");
		System.out.println("* for multiplication");
		System.out.println("/ for division");
		ch = Character.valueOf(Reader.read.next().charAt(0));
		System.out.println("Result : " + map.get(ch).cal(x, y));


	}

}

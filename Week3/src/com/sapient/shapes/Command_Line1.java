package com.sapient.shapes;

import java.util.ArrayList;
import java.util.Collections;

public class Command_Line1 {
	private ArrayList<Integer> numList  = new ArrayList<Integer>();
	private long sum;
	private double avg;
	private int max, min;
	
	public void setData(String[] args) {
		for (String arg : args) {
			numList.add(Integer.parseInt(arg));
		}
	}
	
	public void calData() {
		
		sum = 0;
		for(int num: numList) {
			sum += num;
		}
		avg = (double) sum / numList.size();
		max = Collections.max(numList);
		min = Collections.min(numList);
		
	}
	
	public void displayData() {
		System.out.println("Sum of numbers : " + sum);
		System.out.println("Average of numbers : " + avg);
		System.out.println("Maximum number : " + max);
		System.out.println("Minimum number : " + min);
		
	}
	

}

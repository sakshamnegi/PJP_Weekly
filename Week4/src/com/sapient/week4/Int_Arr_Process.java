package com.sapient.week4;

import java.util.Arrays;

public class Int_Arr_Process {
	private int[] array;

	public Int_Arr_Process() {
		array = new int[10];
	}

	public Int_Arr_Process(int size) {
		array = new int[size];
	}

	public Int_Arr_Process(int[] array) {
		this.array = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			this.array[i] = array[i];
		}
	}

	public Int_Arr_Process(Int_Arr_Process obj) {
		array = new int[obj.array.length];
		for (int i = 0; i < obj.array.length; i++) {
			array[i] = obj.array[i];
		}
	}

	public void readArray() {
		System.out.println("Enter " + array.length + " array elements : ");
		for (int i = 0; i < array.length; i++) {
			array[i] = Reader.read.nextInt();
		}
	}

	public void displayHorizontally() {
		System.out.println("Displaying elements horizontally ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public void displayVertically() {
		System.out.println("Displaying elements vertically ");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

	public void sort() {
		Arrays.sort(array);
	}

	public int findBiggest() {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;

	}

	public int findSmallest() {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		return min;

	}

	public long findSum() {
		long sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum = sum + array[i];
		}
		return sum;
	}

	public int findSecondBiggest() {
		int max = findBiggest();
		int ans = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > ans && array[i] < max) {
				ans = array[i];
			}
		}
		return ans;
	}

	public void finalize() {

		System.out.println(this + " Object destroyed ");
	}
}

package com.sapient.week4;

public class Int_Arr_Process_Runner {

	public static void main(String[] args) {
		

		Int_Arr_Process arrayObj = new Int_Arr_Process(6);
		arrayObj.readArray();
		arrayObj.displayHorizontally();
		arrayObj.displayVertically();
		System.out.println("Biggest element : "+ arrayObj.findBiggest());
		System.out.println("Smallest element : "+ arrayObj.findSmallest());
		System.out.println("Second biggest element "+ arrayObj.findSecondBiggest());
		arrayObj.sort();
		System.out.println("After sorting array : ");
		arrayObj.displayHorizontally();
		arrayObj = null;
		System.gc();
		
		

	}

}


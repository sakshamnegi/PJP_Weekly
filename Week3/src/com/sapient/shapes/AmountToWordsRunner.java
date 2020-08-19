package com.sapient.shapes;

import java.util.Scanner;

public class AmountToWordsRunner {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		try {
			long amount;
			System.out.print("Enter amount in digits : ");
			amount = input.nextLong();
			System.out.println(AmountToWords.fig_to_words(amount));
		} finally {
			input.close();
		}

	}

}

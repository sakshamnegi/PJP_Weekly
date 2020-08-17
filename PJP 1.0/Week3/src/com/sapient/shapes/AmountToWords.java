package com.sapient.shapes;

public class AmountToWords {
	private static String[] a = { "", "one ", "two ", "three ", "four ", "five ", "six ", "seven ", "eight ", "nine ",
			"ten ",
			"eleven ", "twelve ", "thirteen ", "fourteen ", "fifteen ", "sixteen ", "seventeen ", "eighteen ",
			"nineteen " };
	private static String[] b = { "", "", "twenty ", "thirty ", "forty ", "fifty ", "sixty ", "seventy ",
			"eighty ",
			"ninety " };

	public static String fig_to_words(long amount) {
		// 0 to 10^9-1
		if (amount > 999999999) {
			return "Please enter amount in the range 0-999999999 only :(";
		}
		if (amount == 0) {
			return "zero only";
		}
		boolean andFlag = false;
		if ((amount > 100) && (amount % 100 != 0)) {
			andFlag = true;
		}
		StringBuilder ans = new StringBuilder();
		ans.append(assignFace(amount / 10000000, "crore "));
		amount = amount % 10000000;

		ans.append(assignFace(amount / 100000, "lakh "));
		amount = amount % 100000;

		ans.append(assignFace(amount / 1000, "thousand "));
		amount = amount % 1000;

		ans.append(assignFace(amount / 100, "hundred "));
		amount = amount % 100;

		if (andFlag == true) {
			ans.append("and ");
		}

		ans.append(assignFace(amount, ""));
		ans.append("only ");

		return ans.toString();
	}

	public static String assignFace(long n, String value) {
		StringBuilder temp = new StringBuilder("");
		if (n <= 19) {
			temp.append(a[(int) n]);
		} else {
			temp.append(b[(int) (n / 10)]);
			temp.append(a[(int) (n % 10)]);
		}
		if (n > 0) {
			temp.append(value);
		}
		return temp.toString();
	}

}

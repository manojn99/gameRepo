/**
 * 
 */
package com.org.numberguess;

import java.util.Scanner;

/**
 * Brief Comments
 * <p>
 * Detailed Comments
 * 
 * @author manoj, Feb 3, 2015
 */
public class NumberGuessing {

	/**
	 * This method uses binary search kind of algorithm to know the exact value. <br>
	 * It uses divide and conquer technique to search for the number. <br>
	 * Its a recursive function.
	 * 
	 * <p>
	 * Detailed Comments
	 * <li>Feb 3, 2015 , manoj
	 * 
	 * @param low
	 * @param high
	 *            void
	 */
	public static String checkNumber(Scanner inputValue, int low, int high) {
		if (low > high) {
			System.out
					.println("You didnt guess any number or you have given a wrong input, Please try again");
			return null;
		}

		int mid = (low + high) / 2;
		System.out.println("Is the number " + mid + "?");
		System.out.print("Please specify its higher/lower/yes : ");
		String resultValue = inputValue.next();

		if (resultValue.equalsIgnoreCase("yes")) {
			return resultValue;
		} else if (resultValue.equalsIgnoreCase("higher")) {
			System.out.println("Is the number " + high + "?");
			System.out.print("Please specify its higher/lower/yes : ");
			String resultHighValue = inputValue.next();

			if (resultHighValue.equalsIgnoreCase("yes")) {
				return resultHighValue;
			} else if (resultHighValue.equalsIgnoreCase("lower")) {
				checkNumber(inputValue, mid + 1, high - 1);
			} else if (resultHighValue.equalsIgnoreCase("higher")) {
				System.out
						.println("You guess is not in our range, please try again");
				checkNumber(inputValue, low, high);
			} else {
				System.out
						.println("Invalid Input, Please enter higher/lower/yes. ");
				checkNumber(inputValue, low, high);
			}
		} else if (resultValue.equalsIgnoreCase("lower")) {
			System.out.println("Is the number " + low + "?");
			System.out.print("Please specify its higher/lower/yes : ");
			String resultLowValue = inputValue.next();

			if (resultLowValue.equalsIgnoreCase("yes")) {
				return resultLowValue;
			} else if (resultLowValue.equalsIgnoreCase("higher")) {
				checkNumber(inputValue, low + 1, mid - 1);
			} else if (resultLowValue.equalsIgnoreCase("lower")) {
				System.out
						.println("You guess is not in our range, please try again");
				checkNumber(inputValue, low, high);
			} else {
				System.out
						.println("Invalid Input, Please enter higher/lower/yes. ");
				checkNumber(inputValue, low, high);
			}
		} else {
			System.out
					.println("Invalid Input, Please enter higher/lower/yes. ");
			checkNumber(inputValue, low, high);
		}

		return resultValue;
	}

	public static void main(String[] args) {
		// Assumption 1: The number which is guessed by the user should be
		// between 0 and 1000.
		Scanner inputValue = new Scanner(System.in);
		NumberGuessing.checkNumber(inputValue, 0, 1000);
		System.out.println("Thank you for using ");
	}
}

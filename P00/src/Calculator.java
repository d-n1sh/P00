/*
 * I declare that this code was written by me.
 * I do not copy or allow others to copy my code. 
 * I understand that copying code is considered as plagiarism.
 * 
 * Student Name: Danish
 * Student ID: 21012612
 * Class: E66K
 * Date/Time created: 30-5-2022 11:11am
 */

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
		
	public int add(int a, int b) {
		if (a > 999 && b > 999 && a < 10000 && b < 10000) {
			System.out.print(a + b);
			return a + b;
		}
		else if(a > 0 || a < 1000 || b > 0 || b < 1000) {
			System.out.print("Input a 4 digit number");
			return 0;
		}
		else if(a < 0 || b < 0) {
			System.out.println("No negative number!");
			return 0;
		}
		else {
			System.out.print("Input must be a number that is bigger than 0");
			return 0;
		}
	}
		
	public int subtract (int a, int b) {
		if (a > 999 && b > 999 && a < 10000 && b < 10000) {
			System.out.print(a - b);
			return a - b;
		}
		else if(a > 0 || a < 1000 || b > 0 || b < 1000) {
			System.out.print("Input a 4 digit number");
			return 0;
		}
		else if(a < 0 || b < 0) {
			System.out.println("No negative number!");
			return 0;
		}
		else {
			System.out.print("Input must be a number that is bigger than 0");
			return 0;
		}
	}

	public int multiple(int a, int b) {
		if (a > 999 && b > 999 && a < 10000 && b < 10000) {
			System.out.print(a * b);
			return a * b;
		}
		else if(a > 0 || a < 1000 || b > 0 || b < 1000) {
			System.out.print("Input a 4 digit number");
			return 0;
		}
		else if(a < 0 || b < 0) {
			System.out.println("No negative number!");
			return 0;
		}
		else {
			System.out.print("Input must be a number that is bigger than 0");
			return 0;
		}
	}

	public int divide(int a, int b) {
		if (a > 999 && b > 999 && a < 10000 && b < 10000) {
			System.out.print(a / b);
			return a / b;
		}
		else if(a > 0 || a < 1000 || b > 0 || b < 1000) {
			System.out.print("Input a 4 digit number");
			return 0;
		}
		else if(a < 0 || b < 0) {
			System.out.println("No negative number!");
			return 0;
		}
		else {
			System.out.print("Input must be a number that is bigger than 0");
			return 0;
		}
	}
	
}
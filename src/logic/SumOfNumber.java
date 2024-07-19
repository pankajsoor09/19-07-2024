package logic;

import java.util.Scanner;

public class SumOfNumber {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		int result = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		num = sc.nextInt();
		sc.close();

		for (; num > 0;) {
			result = num % 10;
			sum = sum + result;
			num = num / 10;
		}

		System.out.println("sum of digits : " + sum);
	}

}

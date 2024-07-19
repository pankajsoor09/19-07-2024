package logic;

import java.util.Scanner;

public class SumOfNumber1 {

	public static void main(String[] args) {

		int num;
		int sum = 0;
		int result;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number");
		num = sc.nextInt();
		sc.close();

		while (num > 0) {
			result = num % 10;
			sum = sum + result;
			num = num / 10;
		}

		System.out.println("sum of digits : " + sum);
	}

}

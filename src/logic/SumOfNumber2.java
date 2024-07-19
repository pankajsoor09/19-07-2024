package logic;

import java.util.Scanner;

public class SumOfNumber2 {
	
	public static void main(String[] args) {
		
		int num ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 3 Digit Number");
		num = sc.nextInt();
		
		sc.close();
		
		if(num<=999) {
		int digit1 = num%10;
		int digit2 = (num/10)%10;
		int digit3 = (num/100)%10;
		int sum = digit1+digit2+ digit3;
		
		System.out.println("Sum of Digits of Given number : "+sum);
		}
		else {
			System.err.println("Enter a 3 Digit Number Only !");
		}
	}

}

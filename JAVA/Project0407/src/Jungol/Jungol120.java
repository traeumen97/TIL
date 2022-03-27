package Jungol;

import java.util.Scanner;

public class Jungol120 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
//		System.out.println(num1);
//		System.out.println(num2);
		
		System.out.println(Math.abs(num1 - num2));
		
		
//		if (num1 > num2) {
//			System.out.println(num1 - num2);
//		} else {
//			System.out.println(num2 - num1);
//		}
	}
}
package Jungol;

import java.util.Scanner;

public class Jungol521 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		sc.close();
		
//		System.out.println(num1);
//		System.out.println(num2);
		
		int res = num1++ * --num2;
		System.out.println(num1 + " " + num2 + " " + res);
	}
}
package jungol;

import java.util.Scanner;

public class Jungol581 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iNum1 = sc.nextInt();
		int iNum2 = sc.nextInt();
		double dbNum1 = sc.nextDouble();
		double dbNum2 = sc.nextDouble();
		
		sc.close();
		
//		System.out.println(iNum1);
//		System.out.println(iNum2);
//		System.out.println(dbNum1);
//		System.out.println(iNum1);
//		System.out.println(dbNum2);
		
		
		if(Math.abs(iNum2) < Math.abs(iNum2)) {
			System.out.println(iNum2);
		} else {
			System.out.println(iNum1);
		}
		
		if(Math.abs(dbNum2) < Math.abs(dbNum2)) {
			System.out.printf("%.2f", dbNum2);
		} else {
			System.out.printf("%.2f", dbNum1);
		}
	}
}
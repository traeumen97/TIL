package Jungol;

import java.util.Scanner;

public class Jungol516_sol4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double db1 = sc.nextDouble();
		double db2 = sc.nextDouble();
		String str = sc.next();
		char c = sc.next().charAt(0);

		sc.close();
		
		System.out.printf("%.2f\n", db1);
		System.out.printf("%.2f\n", db2);
		System.out.printf(str);
		System.out.println(c);
	}
}
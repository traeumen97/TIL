package Jungol;

import java.util.Scanner;

public class Jungol516_2 {

	public static void main(String[] args) {
		double a, b;
		String c;
		
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.next();
		
		sc.close();
		
		System.out.printf("%.2f\n", a);
		System.out.printf("%.2f\n", b);
		System.out.printf("%s", c);
	}
}
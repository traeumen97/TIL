package Jungol;

import java.util.Scanner;

public class Jungol572 {
//	p=r
	public static double circle(int p) {
		double area = p * p * 3.14;
		return area;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		sc.close();
		
//		System.out.println(r);
		double d = circle(r);
		System.out.printf("%.2f\n",d);
	}
}
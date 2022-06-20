package jungol;

import java.util.Scanner;

public class Jungol559 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		sc.close();
		
//		System.out.println(n1);
//		System.out.println(n2);
		
//		double[] ar = new double[6];
		double[] ar = {85.6, 79.5, 83.1, 80.0, 78.2, 75.0};
		System.out.println(ar[n1-1] + ar[n2-1]);
//		System.out.printf("%.1f\n", ar[n1-1] + ar[n2-1]);
		
	}

}

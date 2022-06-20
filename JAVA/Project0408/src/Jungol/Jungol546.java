package Jungol;

import java.util.Scanner;

public class Jungol546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] ar = new int[n];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

//		System.out.println(n);
//		for (int i = 0; i < ar.length; i++) {
//			System.out.print(ar[i] + " ");
//		}
		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}
		double avg = sum / (double) n;
		System.out.printf("avg : %.1f\n", sum / (double) n);

		if (avg >= 80.0) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

}

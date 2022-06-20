package baekjoon;

import java.util.Scanner;

public class Baekjoon10871 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int X = sc.nextInt();
		int[] A = new int[N];
		for (int i = 0; i < A.length; i++) {
			A[i] = sc.nextInt();
		}
		sc.close();

//		System.out.println(N + " " + X);
//		for (int i = 0; i < A.length; i++) {
//			System.out.print(A[i] + " ");
//		}
//		System.out.println();

		for (int i = 0; i < A.length; i++) {
			if (X > A[i]) {
				System.out.print(A[i] + " ");
			}
		}
	}
}
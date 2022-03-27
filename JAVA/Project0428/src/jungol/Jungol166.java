package jungol;

import java.util.Scanner;

public class Jungol166 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("firstarray");
		int[][] ar1 = new int[2][3];
		for (int i = 0; i < ar1.length; i++) {
			for (int j = 0; j < ar1[i].length; j++) {
				ar1[i][j] = sc.nextInt();
			}
		}
		System.out.println("second array");
		int[][] ar2 = new int[2][3];
		for (int i = 0; i < ar2.length; i++) {
			for (int j = 0; j < ar2[i].length; j++) {
				ar2[i][j] = sc.nextInt();
			}
		}
		sc.close();		
	}
}
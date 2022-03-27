package jungol;

import java.util.Scanner;

public class Jungol602 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] ar = new String[5];
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.next();
		}
		sc.close();

		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[ar.length - i - 1]);
		}
	}
}
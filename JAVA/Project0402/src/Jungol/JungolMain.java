package Jungol;

import java.util.Scanner;

public class JungolMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();

//		System.out.println(num);

		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= num; j++) {
				System.out.print("(" + i + ", " + j + ") ");
			}
			System.out.printf("\n");
		}
	}
}

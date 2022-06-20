package jungol;

import java.util.Scanner;

public class Jungol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp = 0;
		while (inp != -1) {
			inp = sc.nextInt();
			if (inp % 3 == 0) {
				// 3ÀÇ¹è¼ö
				System.out.println(inp / 3);
			}
		}
		sc.close();
	}

}

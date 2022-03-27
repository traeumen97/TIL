package jungol;

import java.util.Scanner;

public class Jungol544 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp = sc.nextInt();
		sc.close();

//		System.out.println(inp);

		int sum = 0;

		for (int i = inp; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
//		int sum2 = 0;
//		while(inp <=100) {
//			sum2 += inp++;
//		}
//		System.out.println(sum);
	}
}
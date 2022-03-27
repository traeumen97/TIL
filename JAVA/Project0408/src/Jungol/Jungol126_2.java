package Jungol;

import java.util.Scanner;

public class Jungol126_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int inp, even = 0, odd = 0;
		while (true) {
			inp = sc.nextInt();
			if (inp == 0)
				break;
			if (inp % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}

		sc.close();
		
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);

	}

}

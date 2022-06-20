package Jungol;

import java.util.Scanner;

public class Jungol539 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0, n = 0, inp;
		
		do {
			inp = sc.nextInt();
			sum += inp;
			n++;
		} while (inp < 100);
		sc.close();
		
		System.out.println(sum);
		System.out.println(n);
		System.out.printf("%01f\n", (float)sum / n);
	}

}

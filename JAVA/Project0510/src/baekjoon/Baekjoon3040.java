package baekjoon;

import java.util.Scanner;

public class Baekjoon3040 {

	public static void main(String[] args) {
		int[] ar = new int[9];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();

		int sum = 0;
		for (int i = 0; i < ar.length; i++) {
			sum += ar[i];
		}

		int num1 = 0, num2 = 0;
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (i != j && sum - ar[i] - ar[j] == 100) {
					num1 = i;
					num2 = j;
					break;
				}
			}
		}
		for (int k = 0; k < ar.length; k++) {
			if (k != num1 && k != num2) {
				System.out.println(ar[k]);
			}
		}
	}
}
package p512;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		int cnt = 0;

		while (sc.hasNextInt()) {
			sum += sc.nextInt();
			cnt++;
		}
		sc.close();

		System.out.println("sum=" + sum);
		System.out.println("average=" + (double) sum / cnt);
	}
}
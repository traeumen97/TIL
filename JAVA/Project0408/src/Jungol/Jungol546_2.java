package Jungol;

import java.util.Scanner;

public class Jungol546_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum = 0;
		for(int i=0; i<n;i++) {
			sum += sc.nextInt();
		}
		sc.close();
		
		double avg = sum / (double)n;
		System.out.printf("avg : %.1f\n", avg);
		if(avg >= 80.0) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}
	}

}

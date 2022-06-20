package jungol569;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] ar = new int[5][4];
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				ar[i][j] = sc.nextInt();
			}
		}
		sc.close();
		
		int cnt = 0;
		for(int i=0; i<ar.length; i++) {
			int sum = 0;
			for(int j=0; j<ar[i].length; j++) {
//				System.out.print(ar[i][j] + " ");
				sum += ar[i][j];
			}
			double avg = (double)sum / ar[i].length;
//			System.out.print(avg);
			
			if(avg >= 80) {
				System.out.println("pass");
				cnt++;
			} else {
				System.out.println("fail");
			}
		}
		System.out.println("Successful : " + cnt);
	}
}
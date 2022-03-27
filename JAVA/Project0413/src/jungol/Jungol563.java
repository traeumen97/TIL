package jungol;

import java.util.Scanner;

public class Jungol563 {

	public static void main(String[] args) {
		int[] ar = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<ar.length;i++) {
			ar[i] = sc.nextInt();
		}
		sc.close();
		
//		for(int i=0;i<ar.length;i++) {
//			System.out.print(ar[i] + " ");
//		}
//		System.out.println();

		for(int i=0;i<ar.length; i++) {
			int max = -1;
			int idx = -1;
			for(int j=0; j<ar.length; j++) {
				if(max < ar[j]) {
					max = ar[j];
					idx = j;
				}
			}
			System.out.print(max + " ");
//			System.out.println(idx);
			ar[idx] = -1;
		}
	}

}

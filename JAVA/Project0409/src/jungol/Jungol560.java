package jungol;

import java.util.Scanner;

public class Jungol560 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] ar = new int[10];
		
		for(int i=0; i<ar.length; i++) {
			ar[i] = s.nextInt();
		}
		s.close();
		
		int min = Integer.MAX_VALUE;
		for(int i=0; i<ar.length; i++) {
			if(min > ar[i]) {
				min = ar[i];
			}
		}
		System.out.println(min);
	}
}
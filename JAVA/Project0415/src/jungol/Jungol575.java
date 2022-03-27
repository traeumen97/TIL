package jungol;

import java.util.Scanner;

public class Jungol575 {
	public static int pow(int c, int d) {
		
		int r = 1;
		for(int i=0; i<d; i++) {
			r *= c;
		}
		
		return r;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		s.close();

//		System.out.println(a);
//		System.out.println(b);

		System.out.println(pow(a, b));
	}
}
package Jungol;

import java.util.Scanner;

public class Jungol596 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int inp = sc.nextInt();
		sc.close();

//		System.out.println(str);
//		System.out.println(n);
//		
//		System.out.println(str.charAt(str.length()-1));
		for (int i = str.length() - 1, cnt = 0; cnt < inp; i--, cnt++) {
			if (i >= 0) {
				System.out.print(str.charAt(i));
			}
		}
	}

}
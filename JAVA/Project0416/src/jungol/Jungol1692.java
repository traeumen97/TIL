package jungol;

import java.util.Scanner;

public class Jungol1692 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		String num2 = sc.next();
		sc.close();

//		System.out.println(num1);
//		System.out.println(num2);

		for (int i = num2.length() - 1; i < num2.length(); i++) {
			System.out.println(num2.charAt(i));
			System.out.println(num1 * (num2.charAt(i)-'0'));
		}
		System.out.println(num1 * Integer.parseInt(num2));
	}

}

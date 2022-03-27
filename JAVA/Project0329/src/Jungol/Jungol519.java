package Jungol;

import java.util.Scanner;

public class Jungol519 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		scan.close();
		
//		System.out.println(n1);
//		System.out.println(n2);
		
		n1 = n1 + 100;
//		n1 += 100;
		n2 = n2 % 10;
//		n2 %= 10;
		
		System.out.println(n1 + " ");
		System.out.println(n2);
	}
}
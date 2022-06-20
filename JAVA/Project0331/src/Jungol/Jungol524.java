package Jungol;

import java.util.Scanner;

public class Jungol524 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
		System.out.printf("%d > %d --- %b\n", num1, num2, num1>num2);
		System.out.print(num1 + " < " + num2 + " --- " + (num1 < num2) + "\n");
//		System.out.println(num1 + " >= " + num2 + " --- " + num1 >= num2);
//		System.out.println(num1 + " <= " + num2 + " --- " + num1 <= num2);
		
	}

}

package Jungol;

import java.util.Scanner;

public class Jungol114 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();
		
//		System.out.println(num1); //1��Ȯ��
//		System.out.println(num2); //1��Ȯ��
		
//		++num1;
//		num2--;
		
		System.out.println(++num1 + " " + num2--);
		System.out.println(num1 + " " + num2);
	}
}
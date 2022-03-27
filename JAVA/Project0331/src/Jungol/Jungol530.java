package Jungol;

import java.util.Scanner;

public class Jungol530 {

	public static void main(String[] args) {
//		System.out.print("당신의 나이를 입력하세요.>");
		
		Scanner scanner  = new Scanner(System.in);		
		int age = scanner.nextInt();
		
		scanner.close();
		
		if (age >= 20) {
			System.out.println("adult");
		} else {
			System.out.println(20 - age + " years later");
		}
	}
}
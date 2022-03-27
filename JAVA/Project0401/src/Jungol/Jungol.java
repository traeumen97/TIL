package Jungol;

import java.util.Scanner;

public class Jungol {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int inp;
		do {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");
			inp = sc.nextInt();

//			System.out.println(); //띄어쓰기 두줄 오류

			switch (inp) {
			case 1:
				System.out.println("Seoul");
				break;
			case 2:
				System.out.println("Washington");
				break;
			case 3:
				System.out.println("Tokyo");
				break;
			case 4:
				System.out.println("Beijing");
				break;
			default:
				System.out.println("none");
				break;
			}

			System.out.println();
		} while (1 <= inp && inp <= 4);
		sc.close();
	}
}

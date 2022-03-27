package jungol;

import java.util.Scanner;

public class Jungol534 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String str = sc.nextLine();
		char c = sc.next().charAt(0);;
		sc.close();
		
		//switch		
//		switch(c) {
//		case 'A':
//			System.out.println("Excellent");
//			break;
//		case 'B':
//			System.out.println("Good");
//			break;
//			default:
//				System.out.println("error");
//		}
		
		//str
//		System.out.println(str);
		
//		if (str.equals("A")) {
//			System.out.println("Excellent");
//		} else if (str.equals("B")) {
//			System.out.println("Good");
//		}
		
		//char
		if(c == 'A') {
			System.out.println("Excellent");
		} else if (c == 'B') {
			System.out.println("Good");
		} else if (c == 'C') {
			System.out.println("Usually");
		} else if (c=='D') {
			System.out.println("Effort");
		} else if (c=='F') {
			System.out.println("Failuer");
		} else {
			System.out.println("error");
		}
		
	}

}

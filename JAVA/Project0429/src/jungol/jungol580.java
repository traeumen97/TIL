package jungol;

import java.util.Scanner;

public class jungol580 {

	public static void main(String[] args) {
		int cnt[] = {31, 28, 31, 30, 31, 30,
					 31, 31, 30, 31, 30, 31};
		Scanner sc = new Scanner(System.in);
		int mon = sc.nextInt();
		int day = sc.nextInt();
		sc.close();
		
//		System.out.println(mon);
//		System.out.println(day);
		
		if ((1 <= mon && mon <= 12) && cnt[mon-1] > day) {
			System.out.println("OK!");
		} else {
			System.out.println("BAD!");
		}
	}
}
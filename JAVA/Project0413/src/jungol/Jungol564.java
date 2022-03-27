package jungol;

import java.util.Scanner;

public class Jungol564 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] cnt = new int[26];
		char c;
		while (true) {
			c = sc.next().charAt(0);
			if ('A' <= c && c <= 'Z') {
				cnt[c - 'A']++;
			} else {
				break;
			}

		}
		sc.close();
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] > 0) {
				System.out.println((char) (65 + i) + " : " + cnt[i]);
			}
		}
	}

}

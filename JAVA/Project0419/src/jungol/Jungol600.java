package jungol;

import java.util.Scanner;

public class Jungol600 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String inp = sc.next(); //공백 이전까지만 출력됨
		String inp = sc.nextLine();
		sc.close();

//		System.out.println(inp);

		int cnt = 0;
		for (int i = 0; i < inp.length(); i++) {
			System.out.println(inp.charAt(i++));
			if (inp.charAt(i) == ' ') {
				cnt++;
			}
		}
		System.out.println(cnt + 1);
	}
}
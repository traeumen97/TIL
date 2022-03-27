package baekjoon9012;

import java.util.Scanner;

public class Baekjoon9012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			String str = sc.next();
//			System.out.println(str);

			boolean b = true;
			int cnt = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == '(') {
					cnt++;
				} else {
					if(cnt == 0) {
						b = false;
						break;
					}
					cnt--;
				}
			}
			if(cnt == 0 && b) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
		sc.close();
	}

}

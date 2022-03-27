package book;

import java.util.Scanner;

public class P170 {

	public static void main(String[] args) {
		int num = 0, sum = 0;
		System.out.print("숫자를 입력하세요(예:12345)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		
		scanner.close();
		
		num = Integer.parseInt(tmp);
		
		while(num!=0) {
			sum += num % 10;
			System.out.printf("sum=3%d\n", sum, num);
			num /= 10;
		}
		System.out.println("각 자리으수의 합:" + sum);
	}

}

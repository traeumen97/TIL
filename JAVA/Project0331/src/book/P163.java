package book;

import java.util.Scanner;

public class P163 {

	public static void main(String[] args) {
		int num = 0;
		
		System.out.print("*�� ����� ������ ���� �Է��ϼ���.>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		
		scanner.close();
		
		num = Integer.parseInt(tmp);
		
		for(int i=0; i < num; i++) {
			for (int j = 0; j <= j; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
package book;

import java.util.Scanner;

public class P152 {

	public static void main(String[] args) {
		System.out.print("����� �ֹε�Ϲ�ȣ�� �Է��ϼ���. (011231-1111222)>");
		
		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();
		
		scanner.close();
		
		char gender = regNo.charAt(7);
		
		switch (gender) {
		case '1' : case '3':
			 System.out.println("����� �����Դϴ�.");
			 break;
		case '2' : case '4':
			 System.out.println("����� �����Դϴ�.");
			 break;
		default:
			System.out.println("��ȿ���� ���� �ֹε�Ϲ�ȣ�Դϴ�.");
		}
	}

}

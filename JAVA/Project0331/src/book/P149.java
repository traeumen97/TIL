package book;

import java.util.Scanner;

public class P149 {

	public static void main(String[] args) {
		System.out.print("���� ���� �Է��ϼ���.>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		scanner.close();		
		
//		case 3:
//			System.out.println("������ ���� 3���Դϴ�.");
//			break;
//		case 4:
//			System.out.println("������ ���� 4���Դϴ�.");
//			break;
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.println("������ ������ ���Դϴ�.");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("������ ������ �����Դϴ�.");
		} else if (9 <= month && month <= 11) { //���� �� ���
			System.out.println("������ ������ �����Դϴ�.");
		} else {
			System.out.println("������ ������ �ܿ��Դϴ�.");
		}
		
		
		switch (month) { //���� ���� �� �� ����. �ٸ� ���� ���� > ���߿�
		
		case 3:
		case 4:
		case 5:
			System.out.println("������ ������ ���Դϴ�.");
			break;
		case 6: case 7: case 8:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 9: case 10: case 11:
			System.out.println("������ ������ �����Դϴ�.");
			break;
		case 12: case 1: case 2:
			System.out.println("������ ������ �ܿ��Դϴ�.");
			break;
		}
	}
}
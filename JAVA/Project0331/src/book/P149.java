package book;

import java.util.Scanner;

public class P149 {

	public static void main(String[] args) {
		System.out.print("현재 월을 입력하세요.>");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		scanner.close();		
		
//		case 3:
//			System.out.println("현재의 월은 3월입니다.");
//			break;
//		case 4:
//			System.out.println("현재의 월은 4월입니다.");
//			break;
		
		if(month == 3 || month == 4 || month == 5) {
			System.out.println("현재의 계절은 봄입니다.");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("현재의 계절은 여름입니다.");
		} else if (9 <= month && month <= 11) { //범위 값 사용
			System.out.println("현재의 계절은 가을입니다.");
		} else {
			System.out.println("현재의 계절은 겨울입니다.");
		}
		
		
		switch (month) { //범위 값은 들어갈 수 없음. 다른 예제 있음 > 나중에
		
		case 3:
		case 4:
		case 5:
			System.out.println("현재의 계절은 봄입니다.");
			break;
		case 6: case 7: case 8:
			System.out.println("현재의 계절은 여름입니다.");
			break;
		case 9: case 10: case 11:
			System.out.println("현재의 계절은 가을입니다.");
			break;
		case 12: case 1: case 2:
			System.out.println("현재의 계절은 겨울입니다.");
			break;
		}
	}
}
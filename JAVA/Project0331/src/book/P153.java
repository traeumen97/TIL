package book;

import java.util.Scanner;

public class P153 {

	public static void main(String[] args) {
		char grade = ' ';
		
		System.out.print("당신의 점수를 입력하세요.(1~100)>");
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		scanner.close();
		
		switch(score/10) {
//		case 100: case 98: case 97: case 96: case 95:
//		case 94: case 93: case 92: case 91: case 90:
		case 10: case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		default :
			grade = 'F';
		}
		System.out.println("당신의 학점은 " + grade + "입니다.");
	}

}

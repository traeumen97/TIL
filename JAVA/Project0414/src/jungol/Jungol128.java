package jungol;

import java.util.Scanner;

public class Jungol128 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inp, cnt = 0;
		while(true) {
			inp = sc.nextInt();
			if(inp == 0)
				break;
			if(!(inp % 3 == 0 || inp % 5 == 0)) {
				cnt++;
			}
			
			//�ݴ�� �Է��ϴ� ���
//			if((inp % 3 != 0 && inp % 5 != 0)) {
//				cnt++;
//			}
		}
		sc.close();
		System.out.println(cnt);
	}
}
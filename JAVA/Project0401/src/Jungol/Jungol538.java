package Jungol;

import java.util.Scanner;

public class Jungol538 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		while(), do-while
		for(;;) {
			System.out.print("number? ");
			int inp = sc.nextInt();
			if(inp > 0) {
				System.out.println("positive integer");
			}else if(inp < 0) {
				System.out.println("negetive number");
			}else {
				break;
			}
			System.out.println(inp);
			
			}
		sc.close();
	}
}
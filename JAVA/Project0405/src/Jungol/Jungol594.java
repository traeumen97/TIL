package Jungol;

import java.util.Scanner;

public class Jungol594 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String inp = scan.next();
		
		scan.close();
		System.out.print(inp);
		System.out.println(inp);
		
		System.out.println(inp + inp);
		
		for(int i=0; i<100; i++) {
			System.out.print(inp);
		}
		System.out.println();
	}
}
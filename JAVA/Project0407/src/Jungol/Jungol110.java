package Jungol;

import java.util.Scanner;

public class Jungol110 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double inp = sc.nextDouble();
		sc.close();
		
		System.out.print(inp + "yard = ");
		System.out.printf("%.1fcm\n", (91.44 * inp));

	}

}
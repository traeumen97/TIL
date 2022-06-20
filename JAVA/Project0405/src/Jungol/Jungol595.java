package Jungol;

public class Jungol595 {

	public static void main(String[] args) {
		String str = "Hong Gil Dong";
		for(int i=3; i<=6; i++) {
			System.out.print(str.charAt(i));
		}
		System.out.println();
		
		System.out.println(str.substring(3, 7));
		
		char[] chArr = str.toCharArray();
		for (int i=3; i<=6; i++) {
			System.out.print(chArr[i]);
		}
	}
}
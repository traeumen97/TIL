package ppt;

public class operatorExample_9 {
	public static void main (String[] args) {
		char c1 = 'A' +1;
		char c2 = 'A';
		char c3 = (char)(c2 + 1);
		
		System.out.println("c1 : " + c1);
		System.out.println("c2 : " + c2);
		System.out.println("c3 : " + c3);
		
		System.out.printf("%c\n", c1);
		System.out.printf("%d\n", (int)c1);
	}
}

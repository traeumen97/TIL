package Jungol;

public class Jungol548 {

	public static void main(String[] args) {
		// #1
//		System.out.println("2 * 1 =  2   2 * 2 =  4   2 * 3 =  6   2 * 4 =  8   2 * 5 = 10");
//		System.out.println("3 * 1 =  3   3 * 2 =  6   3 * 3 =  9   3 * 4 = 12   3 * 5 = 15");
//		System.out.println("4 * 1 =  4   4 * 2 =  8   4 * 3 = 12   4 * 4 = 16   4 * 5 = 20");
		
		for(int i=2; i <= 4; i++) {
			for(int j=1; j <=5; j++) {
				System.out.printf("%d * %d = %3d    ", i ,j ,i*j);
			}
			System.out.println();
		}
	}
}
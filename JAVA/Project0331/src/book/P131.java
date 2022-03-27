package book;

public class P131 {

	public static void main(String[] args) {
		int x, y, z;
		int absX, absY, absZ;
		char signX, signY, signZ;
		
		x = 10;
		y = -5;
		z = 0;
		
//		absX = x > 0 ? x : -x;
//		x가 양수일 경우 (0포함), absX = x; / X가 음수일경우 absX = -x;
	
		if (x >= 0) {
			absX = x;
		} else {
			absX = -x;
		}
		absY = x > 0 ? y : -y;
		absZ = x > 0 ? z : -z;
		
//		signX = x > 0 ? '+' : (x == 0 ? ' ' : '-');
		
		if (x > 0) {
			signX = '+';
		} else {
			if(x==0) {
				signX = ' ';
			} else {
				signX = '-';
			}
		}
		
		signY = x > 0 ? '+' : (y == 0 ? ' ' : '-');
		signZ = x > 0 ? '+' : (z == 0 ? ' ' : '-');
		
		System.out.printf("x=%c%d\n", signX, absX);
		System.out.printf("x=%c%d\n", signY, absY);
		System.out.printf("x=%c%d\n", signZ, absZ);
	}

}

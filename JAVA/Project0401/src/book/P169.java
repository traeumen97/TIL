package book;

public class P169 {

	public static void main(String[] args) {
		int i = 11;
		System.out.println("ī��Ʈ �ٿ��� �����մϴ�.");

		while (i-- != 0) {
			System.out.println(i);
			for (long j = 0; j < 5_000_000_000l; j++) {
				;
			}
		}
		System.out.println("GAME OVER");
	}

}
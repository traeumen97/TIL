package book;

import java.text.SimpleDateFormat;
import java.util.Date;

public class P341 {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/mm/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("���� ��¥�� " + date.format(today));
		System.out.println("���� �ð��� " + time.format(today));

	}

}

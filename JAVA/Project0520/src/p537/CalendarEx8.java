package p537;

public class CalendarEx8 {

	public static void main(String[] args) {
		String date1 = "201508";
		String date2 = "201405";
		
		int month1 = Integer.parseInt(date1.substring(0,4)) * 12 + Integer.parseInt(date1.substring(4));
		int month2 = Integer.parseInt(date2.substring(0,4)) * 12 + Integer.parseInt(date2.substring(4));
		
		System.out.println(date1 + "�� " + date2 + "�� ���̴� " + Math.abs(month1 - month2) + " ���� �Դϴ�.");
		
		String str1 = "1234567890";
		int n1 = Integer.parseInt(str1.substring(0,4));
		System.out.println(n1);
		int n2 = Integer.parseInt(str1.substring(4));
		System.out.println(n2);
	}

}

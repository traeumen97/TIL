package jungol;

import java.util.Scanner;

public class Jungol577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		Data d = new Data(num1, num2);
		System.out.println(d.getFrist() + " " + d.getSecond());
	}
}

class Data {
	int first;
	int second;

	Data(int a, int b) {
		first = a;
		second = b;
	}

	public void process() {
		if (first > second) {
			first /= 2;
			second *= 2;
		} else {
			first *= 2;
			second /= 2;
		}
	}

	public int getFrist() {
		return first / 2;
	}

	public int getSecond() {
		return second * 2;
	}
}
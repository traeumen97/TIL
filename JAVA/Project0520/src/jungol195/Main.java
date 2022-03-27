package jungol195;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String address = sc.next();
		sc.close();
		
		Person p = new Person(name, tel, address);
		System.out.println(p);
	}
}

class Person {
	private String name;
	private String tel;
	private String address;
	
	Person(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	public String toString() {
		String ret = "name : " + name + "\ntel : " + tel + "\naddr : " + address;
		return ret;
	}
}

package jungol196;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[3];
		for(int i=0; i<p.length; i++) {
			String name = sc.next();
			String tel = sc.next();
			String address = sc.next();
			p[i] = new Person(name, tel, address);
		}
		
		sc.close();
		
//		for(int i=0; i<p.length; i++) {
//			p[i].print();
//		}
		
		char ch = 'z';
		for(int i=0; i<p.length; i++) {
			if(ch > p[i].getName().charAt(0)) {
				ch = p[i].getName().charAt(0);
			}
		}
//		System.out.println(ch);
		for(int i=0; i<p.length; i++) {
			if(p[i].getName().charAt(0) == ch) {
				p[i].print();
			}
		}
	}
}

class Person {
	private String name;
	private String tel;
	private String address;
	
	public Person(String name, String tel, String address) {
		this.name = name;
		this.tel = tel;
		this.address = address;
	}
	
	public void print() {
		System.out.println("name : "+name);
		System.out.println("tel : "+tel);
		System.out.println("addr : "+address);
	}
	
	public String getName() {
		return name;
	}
}
package jungol618;

import java.util.Arrays;
//import java.util.Collections;
import java.util.Scanner;

import jungol195.Person;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] p = new Person[5];
		
		for(int i=0; i<p.length; i++) {
			String name = sc.next();
			int height = sc.nextInt();
			double weight = sc.nextDouble();
			
			p[i] = new Person(name, height, weight);
		}
		sc.close();
		
		for(int i=0; i<p.length; i++) {
			p[i].print();
		}
		
		String pname[] = new String[5];
		for(int i=0; i<p.length; i++) {
			pname[i] = p[i].getName();
		}
		
//		for(int i=0; i<p.length; i++) {
//			System.out.println(pname[i]);
//		}
		Arrays.sort(pname);
//		Collections.sort(p);
		for(int i=0; i<p.length; i++) {
			p[i].print();
		}
	}
}
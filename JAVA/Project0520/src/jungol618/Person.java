package jungol618;

public class Person implements Comparable<Person>{
	private String name;
	private int height;
	private double weight;
	
	Person(String name, int height, double weight) {
		this.name= name;
		this.height = height;
		this.weight = weight;
		}
	public void print() {
		System.out.println(name + " " + height + " " + weight);
	}
	
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	@Override
	public int compareTo(Person o) {
//		return o.getHeight() - height;
//		return height - o.getHeight(); //¿ª¼ø
		return name.charAt(0)-o.getName().charAt(0);
	}
}
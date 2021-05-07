package test;

public class Parent {
	int i;
	private String name;
	public Parent() {
		System.out.println("Default");
	}
	public Parent(String name) {
		this.name = name;
		System.out.println("Parent: " + this.name);
	}
}

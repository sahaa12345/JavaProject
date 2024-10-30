package com.ex.Spring_IOC_DI;

public class Person {
	private String name;
	private int id;
	private int age;
	public Person(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	public void display() {
		System.out.println("Person name is: "+name);
		System.out.println("Person id is: "+id);
		System.out.println("Person age is: "+age);
	}

}

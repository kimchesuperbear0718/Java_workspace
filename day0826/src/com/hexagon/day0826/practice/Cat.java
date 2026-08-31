package com.hexagon.day0826.practice;

public class Cat {
	public int age;
	public String name;
	
	public String eat() {
		return "냠냠";
	}
	public String sleep() {
		return "쿨쿨";
	}
	
	public Cat() {
		super();
	}
	
	public Cat(int age) {
		super();
		this.age = age;
	}
	
	public Cat(String name) {
		super();
		this.name = name;
	}
	public Cat(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	
}
Cat c1 = new Cat();
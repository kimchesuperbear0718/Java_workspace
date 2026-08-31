package com.hexagon.day0826.testpractice;

import com.hexagon.day0826.practice.Cat;

public class TestCat {

	public static void main(String[] args) {
		Cat c1 = new Cat();
		Cat c2 = new Cat();
		
		Cat c3 = new Cat(5,"호스");
		Cat c4= new Cat(3);
		Cat c5 = new Cat("하마");
		
		c1.name="철수";
		c1.age=4;
		
		c2.name="영희";
		c2.age=4;
		
		c1.eat();
		c1.sleep();
		
		c2.eat();
		c2.sleep();
		
		System.out.println(c1.age);
		System.out.println(c2.age);
		System.out.println(c1.name);
		System.out.println(c2.name);
		
		System.out.println("철수가 " + c1.eat());
		System.out.println("철수가 " + c1.sleep());
		String a=c1.eat();
		System.out.println(a);
		
		System.out.println("영희가 " + c2.eat());
		System.out.println("영희가 " + c2.sleep());
		
		System.out.println(c3.age);
		System.out.println(c3.name);
		
		System.out.println(c4.age);
		System.out.println(c4.name);
		
		System.out.println(c5.name);	
		System.out.println(c5.age);	
				
	}

}

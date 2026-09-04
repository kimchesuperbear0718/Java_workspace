package com.hexagon.day0902.thread;

//하나의 프로세스내에 독립적(비동기적)으로 동작되는 세부 실행단위
public class ThreadStudy {

	
	//쓰레드에서 개발자가 실행시키고 싶은 코드는 run()에 작성하고,
	Thread t1;
	
	public ThreadStudy() {
		//굳이.java 까지 만들필요가 있을까?...
		System.out.println("A");
		
		t1 = new Thread() {
			
			public void run() {
				System.out.println("B");
			}
		};
		
		//t1.start() 를 호출하는 순간,우리의 실행부인 메인쓰레드는 t1쓰레드가 업무를 마칠때까지
		//기다리지 않고, 바로 다음 줄로 가버린다..즉 코드의 순서를 지키지 않고 실행하는 방식을 가리켜
		//비동기방식(Asynchronous)이라 한다.쓰레드는 비동기적으로(독립적) 수행된다..
		t1.start();
		System.out.println("C");
		
	}
	
	public static void main(String[] args) {
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
	}
}

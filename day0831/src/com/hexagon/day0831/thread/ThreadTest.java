package com.hexagon.day0831.thread;


/*
 * Thread 란?
 * - 하나의 프로세스내에서 독립적으로 실행될 수 있는 세부 실행 단위
 * 
 * Thread 구현 방법
 * - 쓰레드를 생성한 후,절대로 개발자가 쓰레드에 들어있는 로직 메서드를 직접 호출해서는 안된다
 * 	이유?스레드를 건드리는 의무는 개발자가 아닌 jvm에게 있기 때문에..
 * 예)개발자가 쓰레드를 3개 만들었을 경우,이 중 jvm이 누구를 선택할지는 알수없다..개발자는 단지 생성 후 jvm에게
 * 맡기면 된다..
 * 
 * - 개발자는 본인이 쓰레드로 구현하고 싶은 로직이 있을 경우 Thread가 보유한 메서드중 run()메서드를 오버라이딩 하면 된다..
 * 
 * 
 * */
public class ThreadTest {

	public static void main(String[] args) {
		MyThread m1 = new MyThread("☆",2000);
		MyThread m2 = new MyThread("★",1000);
		//개발자가 직접 호출하는 순간 jvm 에 의해 관리되는게아니라
		//일반 메서드 호출이 되어 버림..즉 개발자는 쓰레드를 생성하고,시스템에
		//맡기기만 하면 된다..
		
		m1.start();
		m2.start();
	}

}

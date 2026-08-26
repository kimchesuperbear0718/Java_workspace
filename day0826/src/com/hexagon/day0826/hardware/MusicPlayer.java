package com.hexagon.day0826.hardware;

//추상클래스도 규격을 명시하는 목적으로는 훌륭하다.
//하지만,만일 어떤 클래스가 이 MusicPlayer라는 추상 클래스를 상송하기에 앞서 이미 다른 클래스의
//자식인 경우, 그 클래스는 MusicPlayer를 상속받지 못한다(단일 상속 원칙 위배됨)

//해결책?클래스로만 복잡한 현실을 반영하려고 하면 다중상속금지의 원칙의 위베되므로,
// MusicPlayer를 What is 가 아닌 What can do 의 의미로 정의해본다
//즉 추상메서드만을 보유한 자료형인 인터페이스로 정의할 수 있다..

//[인터페이스란?
/*1)추상메서드만을 보유한 자료형
 * 2)추상클래스와 동일하게 규격을 선언하여 이를 구현하는 자식에게 구현 강제를 할수 있다.
 * 3)추상클래스와 동일하게 인터페이스를 구현하는 객체는 같은 종류의 자료형으로 본다
 * */

/*
 * 인터페이스의 특징
 * 1)오직 상수와 추상메서드만을 보유할 수 있다.
 * 따라서 어차피 인터페이스 아느이 메서드는 추상메서드 이므로, 굳이 abstract를 명시할 필요가 없다..*/

public class GallerxyA extends Phone implements MusicPlayer{
	
	public void calling() {
		System.out.println("전화를 걸어요..");
	}
	
	//인터페이스의 추상 메서드는 내용이 채워져 있지 않으므로, 현재 GallerxyA에 맞게끔
	//커스텀 해야한다.. 즉 구현해야 한다..
	@Override
	public void sound() {
		System.out.println("갤럭시A에서 음악 재생")
	}
}
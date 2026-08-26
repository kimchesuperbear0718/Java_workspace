package com.hexagon.day0826.gui;


import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;

/*
 * Java 언어도 프로그램의 결과물을 그래픽으로 보여주는 GUI 프로그래밍이 가능하다
 * Java뿐만 아니라,모든 애플리케이션은 윈도우라는 단위내에서 보여질 수 있으므로-
 * GUI 프로그래밍을 다른 말로 윈도우 프로그래밍이라고도 한다..
 * 
 * java에서 gui 관련된 패키지는
 * java.awt~~ 초창기 gui패키지
 * javax.swing ~~개선된 gui패키지
 * 에서 지원한다.
 * */
public class GuiTest {

	public static void main(String[] args) {
		//Frame 이란 단어에서 알수 있듯,java 언어에서 윈도우는 Frame 으로 표현..
		//난생 처음 보는 클래스를 만났을떄 대처법
		//1.일반인지,추상인지,인터페이스인지 부터 조사
		// -일반인면 new로 생성,
		//추상이면 자식을 정의 new,
		//인터페이스도 자식을 정의 new
		Frame frame =new Frame("나의 첫 윈도우");
		Button bt=new Button("Im Button");
		Button bt1=new Button("Im Button");
		Button bt2=new Button("Im Button");
		Button bt3=new Button("Im Button");
		Button bt4=new Button("Im Button");
		Button bt5=new Button("Im Button");
		
		//윈도우 창의 너비,높이를 지정해야 제대로된 크기를 볼 수 있다..
		//setSize(너비,높이)
		frame.setSize(300,400);
		
		//윈도우 프로그래밍에서는 어떤 부품을 윈도우에 부착할때는 반드시,배치방법을
		//명시해야 함..(레이아웃)
		//컴포넌트 즉 부품을 붙일때 흐르는 배치 방법을 사용하는 레이아웃 매니저
		//여기서 흐른다는 현상은 두자기 유형으로 나누낟
		//1)수평방향으로 흐를지.
		//2)수직방향으로 흐를지..
		frame.setLayout(new FlowLayout());
		
		//프레임에 버튼 부착 div에 appendChild()하는 느낌..
		frame.add(bt);//add()메서드는 Component 형이라면 누구라도 올수있는데,//add()메서드는 Component 형이라면 누구라도 올수있는데,
		frame.add(bt1);//Button 의 경우 Component형이기 때문에 자각이 됀다..
		frame.add(bt2);
		frame.add(bt3);
		frame.add(bt4);
		frame.add(bt5);
		
		//html 에서의 intput 박스는 java에서 TextField 라 함
		TextField t1=new TextField(10);		//윈도우 창은 디폴트로 안보이게 되어 있음..따라서 이 창을 보이게 처리하자..
		//setVisible(true)
		frame.add(t1);
		frame.setVisible(true);

	}

}

package com.hexagon.day0828.gui;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.FlowLayout;
import java.awt.Frame;

public class GuiStudy {

	public static void main(String[] args) {
		/*
		 * Java 로 프로그램을 개발할 때, 개발자가 일일이 모든것을 다 개발하지 않는다. 즉, 프로그래밍에서 필수적이고 중요한 부분은 언어의
		 * 벤더사가 이미 제공 String . . 등 등
		 */

		// 아래의 클래스처럼 개발자가 처음 접하는 클래스를 만날 경우
		// 이 클래스는 쓰라고 준것이므로, 메모리에 올리는 법을 선택해야함
		// Java 의 객체의 유형은 일반클래스, 추상클래스, 인터페이스 3가지가 있고,
		// 이 3가지 방법에 따라 인스턴스를 생성하는 방법이 틀리다.

		Frame frame = new Frame("My Frame");
		// 모든 그래픽 프로그래미에서 윈도우에 UI 컴포넌트를 부착할때는 어떤 방식의
		// 배치 방법을 사용할지를 결정해야 함
		// FlowLayout 은 윈도우 창의 크기에 따라 내부에 부착된 UI 컴포넌트들의 위치가
		// 흘러다닐 수 있는 배치방법을 지원함

		FlowLayout flow = new FlowLayout();

		// 생성한 레이아웃 매니저를 프레임에 적용
		frame.setLayout(flow);

		// 윈도우 창에 붙여넣을 UI 컴포넌트들
		Button bt = new Button("Im a Button");
		frame.add(bt); // 프레임에 버튼 부착

		// 체크박스
		int[] arr = new int[5]; // 기본 자료형 배열
		Checkbox[] ch = new Checkbox[5]; // 객체자료형의 배열
		String[] str = new String[5]; // 객체자료형의 배열
		String[] subject = { "java", "mysql", "spring", "mybatis", "react" };
		// JavaScript : 생성시 크기 생략 가능, 배열 요소의 자료형 복합 가능
		// JAVA : 반드시 크기 명시, 지정된 자료형만 가능

		// 주의) Checkbox[] ch = new Checkbox[5];
		// 위 코드는 체크박스 5개 생성이 아니라, 상자 5개 즉 공간이 5개 비어있는 상태,
		// 그 공간에는 오직 Checkbox만 넣을 수 있다는 선언에 불과

		for (int i = 0; i < subject.length; i++) {
			Checkbox box = new Checkbox(subject[i]);
			frame.add(box);
		}
		// Checkbox c1 =new Checkbox("java");
		// Checkbox c2 =new Checkbox("mysql");
		// Checkbox c3 =new Checkbox("spring");
		// Checkbox c4 =new Checkbox("mybatis");
		// Checkbox c5 =new Checkbox("react");

		frame.setSize(400, 500); // 너비, 높이
		frame.setVisible(true); // 보이도록 처리

	}

}

package com.hexagon.day0828.collection;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ListApp extends JFrame implements ActionListener { // 현재 클래스를 윈도우로 만들기!!(is a)

	// 현재 클래스는 버튼 2개를 가지고 있다..(has a 관계)
	JButton bt_create, bt_color;
	int n;

	// Java 언어는 배열 선언시 반드시 그 크기를 명시해야 한다...그런데 이 크기를 명시해야 한다는 원칙은
	// 프로그래밍 개발시 유연하지 못하다..동적으로 생성된 데이터를 처리할수 없다..(단 js는 배열이 동적으로 고무줄처럼늘어날수있으므로 해결
	// 가능)
	// 즉 자바의 배열은 js 처럼 길이가 동적으로 변경될수 없다...
	// 해결책?java Collection Framework 을 이용해본다!!
	// JButton[] arr=new JButton[];
	/*
	 * java 언어에서는 "객체를 모아서 처리할때 유용하고 효율적으로 처리할 수 있는 패키지또는 API를 지원하는데 이를 가리켜"
	 * Collection Framework 이라 한다" 주의!! 반드시 객체만을 대상으로 한다..
	 * 
	 * java언어에서는 객체가 모여있는 모습을 크게 3가지 유형으로 본다 1)순서가 있는 집합 : List 형 - 우리가 이미 알고있는 배열과
	 * 거의 같다..차이점이라면 크기를 고무줄처럼 동적으로 늘릴수 있다.. - 순서를 가지므로 반복문 실행하기에 너무 적절 2)순서가 없는 집합
	 * :Set 형 map 형 - key-value의 쌍으로 존재 ex)키세스 초콜릿 -순서가 없는 집합이므로,반복문을 이용하려면 가공 작업이
	 * 요구됨. js의 객체 리터럴 let dog={ name:"뽀미", age:3, mix:false }
	 * 
	 * 아래의 Dog 클래스는 거푸집 이므로, 직접 사용이 불가능하여 반드시 new 해서 인스터느를 생성해야 함 class Dog{
	 */

	// collection framework
	List list = new ArrayList();// List를 생성할때 개발자가 그 크기를 명시하지 않아도 에러나지 않음..
								// 아무런 요소를 넣은적이 없으므로 현재 크기는 0 이다..

	// has a 관계에 있는 부속품들은 내가 태어날때 함께 태어나는게 좋으므로,
	// 생성자 타이밍을 놓치지 말자!!!
	public ListApp() {
		bt_create = new JButton("버튼 생성"); // bt_create 는 버튼 자체를 담을 수 없으므로, heap에 생성된 버튼을 가리킬 뿐이다..
		bt_color = new JButton("배경색 변경");// bt_color 는 버튼 자체를 담을 수 없으므로, heap에 생성된 버튼을 가리킬 뿐이다..

		// bt_create의 색상을 blue로 변경해 보자
		Color c = new Color(0, 0, 255);

		bt_create.setBackground(Color.BLUE);

		// 부착 전 배치방법을 결정하자!!!
		setLayout(new FlowLayout()); // 플로우 레이아웃 적용!!(윈도우 창 크기에 따라 수평, 수직으로 흘러다니는 레이아웃)

		add(bt_create);
		add(bt_color);

		bt_create.addActionListener(this);// 생성 버튼과 리스너와의 연결
		bt_color.addActionListener(this); // 색상 버튼과 리스너와의 연결

		setSize(400, 500); // width, height 설정
		setVisible(true); // 윈도우창 보이게..
	}

	public void createButton() {
		JButton btn = new JButton("버튼" + n); // 메모리에 인스턴스 올리기!!
		add(btn);

		// 동적으로 늘어날 수 있는 LIST에 생성된 버튼을 추가하기!
		list.add(btn);// add()메서드에는 Object형은 죄다 올수있으므로,버튼 또한 당연히 가능함.

		System.out.println("현재 모여진 버튼의 수는" + list.size());

		// 변경된 사항을 다시 그려서 반영해줘!!!
		// 그래서 그래픽 작업은 상당히 무겁다
		btn.updateUI();
		n++;
	}

	// 지금까지 생성된 모든~~버튼의 색상을 바꾸자!!
	public void setBg() {
     for(int i=0;i<list.size();i++) {
    	 Object obj=list.get(i);
    	 
    	 //우리가 넣을때 JButton을 넣어씅므로,위 코드에서 Object obj에 담겨진 주소값은 JButton 이다!!
    	 JButton btn=(JButton)obj;
    	 btn.setBackground(Color.yellow);
     }
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 동적으로 생성하여, 윈도우 창에 부착!!!!
		System.out.println("눌렀어?");

		Object obj = e.getSource(); // 이벤트를 일으킨 컴포넌트를 반환!!! 즉 어떤 버튼을 눌렀는지 알기위해 추출!!

		if (obj == bt_create) { // 생성 버튼이라면...
			createButton();
		} else {// 색상 버튼이라면..
			setBg();
		}
	}

	public static void main(String[] args) {
		new ListApp();
	}

}
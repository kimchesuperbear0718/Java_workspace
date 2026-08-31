package com.hexagon.day0831.bg;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WinA extends JFrame implements ActionListener {
	// 인스턴스 변수들은 인스턴스가 가비지 컬렉터에 의해 사살될때까지는 계속 살아간다..따라서
	// java에서는 전역변수란 개념이 없다!!
	JButton bt_open;
	JButton bt_bg;
	WinB b;
	
	public WinA() {
		bt_open = new JButton("open");
		bt_bg = new JButton("color");

		// 부착할 방식을 결정하자(레이아웃 고민)
		setLayout(new FlowLayout());

		// 프레임에 부착
		add(bt_open);
		add(bt_bg);

		// 버튼들과 리스너와의 연결
		bt_open.addActionListener(this);
		bt_bg.addActionListener(this);

		// 윈도우 설정
		setBounds(200, 200, 300, 400);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	// ActionListner 인터 페이스는 불완전한 메서드를 가지고 있으므로,
	// 이 메서드를 완전하게 구현할 의무는 자식은 WinA 에게 있다..따사러 아래의 메서드를
	// 오버라이딩하자!!
	public void actionPerformed(ActionEvent e) {
		// 사용자가 이벤트를 일으키면 윈도우OS가 감지하고, 이 정보를 jvm에게 전달하면,jvm 이 정보를 받아서
		// 적절한 이벤트 객체로 생성하는데,클릭일 경우 jvm ActionEvenet 메모리를 메모리에 올려 이 메서드로 전달
		// java FUI 프로그래밍 에서는 이벤트를 일으킨 컴포넌트를 가리켜 이벤트 소스라 한다..
		JButton btn = (JButton) e.getSource();

		if (btn == bt_open) {// 이벤트소스로부터 얻은 버튼이 bt_opne 의 주소값을 가진다면... 즉 왼쪽 버튼이라면..
			b = new WinB(this);
		} else {
			// 친구의 윈도우 색상을 변경
			b.bt_bg.setBackground(Color.YELLOW);
		}
	}

	public static void main(String[] args) {
		new WinA();

	}

}

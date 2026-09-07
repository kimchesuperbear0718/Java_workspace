package com.hexagon.day0831.bg;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class WinB extends JFrame implements ActionListener {
	JButton bt_bg;
	// 아래의 코드처럼 하면 안되는 이유?WinB는 기존의 WinB는 WinA를 제어하고 싶었던 것이므로
	// 여기서 new를 해버리면 새로운 winA가 태어나 버려서 기존의 A를 제어하려던 계획은 실패..
	WinA a;//결론,해결책?기존의 WinA의 주소값을 얻어오면 된다..
	
	public WinB(WinA winA) {
		// 멤버변수로 선언된 버튼들을 생성
		bt_bg = new JButton("color");
		a = winA;

		// 부착할 방식을 결정하자(레이아웃 고민)
		setLayout(new FlowLayout());

		// 프레임에 부착
		add(bt_bg);
		
		//버튼과 리스너 연결
		bt_bg.addActionListener(this);

		// 윈도우 설정
		setBounds(500, 200, 300, 400);
		setVisible(true);
		
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//버튼을 누르면 나의 친구인 WinA가 보유한 버튼의 색상을 빨간색으로 바꾸자
		a.bt_bg.setBackground(Color.RED);
	}

}

package com.hexagon.day0831.graphic;

import java.awt.Canvas;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * 지금까지는 이미 java에서 디자인해놓은 UI컴포넌트들(JButton,JLabel,JFrame,JTextField 등등)*/

public class PaintApp extends JFrame{
	//도화지의 의미로,다른 일반 컴포넌트와는 달리,이 컴포넌트는 아무것도 그려져 있지 않은 상태이므로,개발자가 적극 나서서
	//직접 그림을 그리기에 딱 좋은 컴포넌트...
	Canvas can;
	
	public PaintApp() {
		can = new XCanvas();
		can.setBackground(Color.YELLOW);
		
		add(can);
		
		setSize(700,600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new PaintApp();

	}

}

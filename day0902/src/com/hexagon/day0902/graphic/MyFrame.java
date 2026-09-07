package com.hexagon.day0902.graphic;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyButton mt;
	JButton bt;
	Canvas can;
	
	public MyFrame() {
		mt = new MyButton("나의 버튼");
		bt=new JButton("버튼");
		
		//캔버스 paint()메서드를 재정의하기 위해 굳이.java 파일을 만들 필요가 없는 수준일 경우
		//개발자는 현재 클래스내에 또 다른 클래스코드를 넣을수 있는데(내부클래스),이때 클래스 명이
		//존재하지 않으므로 익명이라는 말이
		can= new Canvas(){

			
			//도화지에 그림을 그려보자!!
			public void paint(Graphics g) {
				g.drawOval(x, 100, 200, 200);
			}
		};
		
		bt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				System.out.println("나 눌렀어");
				x=x+10;
				//x값을 증가시킨후 사용자가 윈도우창을 만질때,윈도우가 다시 그려지므로 워느이 위치가 변할 수 있다..
				//하지만,사용자들이 버튼을 누른후 계속 윈도우 창을 만져야 하므로
				can.repaint();//캔버스를 다시 그려줘!!(새로고침)
			}
		});
		
		
		//버튼과 리스너와의 연결
		
		can.setPreferredSize(new Dimension(590,450));
		
		can.setBackground(Color.YELLOW);
		
		setLayout(new FlowLayout());
		add(mt);
		add(bt);
		add(can);
		
		setSize(600,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
				
				
	}
	public static void main(String[] args) {
		new MyFrame();
	}
}

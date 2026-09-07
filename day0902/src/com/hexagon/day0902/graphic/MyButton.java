package com.hexagon.day0902.graphic;

import java.awt.Graphics;

import javax.swing.JButton;

//우리가 JFrame 상속받듯,JBu
public class MyButton extends JButton{

	public MyButton(String title){
		super(title);
		
	}
	public void paint(Graphics g) {
		System.out.println("저 그려졌어요");
		//프로그래밍 언어에서의 팔레트는 색상만 관여하는 게 아니라,
		//도형,심지어 텍스트까지도 관여함..
		g.drawLine(0, 0, 30, 15);//버튼에 선을 그리자
	
	}
	
}

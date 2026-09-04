package com.hexagon.day0902.graphic;

import java.awt.Graphics;

/*
 * java의 GUI 컴포넌트들은 개발자가 그림을 뺏어서 그릴수 있다!
 * 하지만,뺏어 그려서 이득을 보는 경우가 있고,없는 경우가 있다...
 * 
 * 1)뺏지 말아야할 컴포넌트들..
 * 	JButton,JTextFleld,...뺏지말자
 * 
 * 2)적극 직접 그림을 그려야할 컴포넌트
 * 	Canvas,JPanel,JFrame...
 * */
public class XCanvas {

	
	//도화지에 그림을 그려보자!!
	public void paint(Graphics g) {
		g.drawOval(100, 100, 200, 200);
	}
}

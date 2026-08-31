package com.hexagon.day0831.graphic;

import java.awt.Canvas;

//Canvas의 paint 메서드를 우리가 업데이트 하기위해 상속받자
public class XCanvas extends Canvas{

	
	public void paint(Graphics g) {
		System.out.println("내가 그림을 뺏어서 그렸어");
	}
}

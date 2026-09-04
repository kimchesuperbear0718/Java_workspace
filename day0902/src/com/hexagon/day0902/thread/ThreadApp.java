package com.hexagon.day0902.thread;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ThreadApp extends JFrame {
	JButton bt;
	Canvas can;
	Thread t1, t2; // 쓰레드 2개를 선언(서로 독립적으로 움직일 예정이므로 쓰레드로 처리)

	int x1, x2;

	public ThreadApp() {
		bt = new JButton("Start");
		// 캔버스에 그림 그리는 코드가 재사용성이 없을 경우, .java 클래스를 굳이 정의하지 맣ㄹ고, 여기서 작성해버리자
		// 클래스안에 또 다른 클래스 코드가 온다고 하여 내부클래스+익명 = 내부익명클래스!! (사용빈도가 아주 높다... 이벤트 구현 등 재사용성이
		// 없는 클래스 코드에서)
		// 자바의 버전이 발전하면서 함수기반 언어에서 차용한 (js-화살표함수가 java에서는 람다(Lambda)로 도입)
		can = new Canvas() {
			// 캔버스가 스스로 그려지는 그림 그리는 행동을 뻇어서 내가 그릴 것임!!
			public void paint(Graphics g) {
				// 그림을 그리기 전에 페인트 통을 핑크색으로 교체
				g.setColor(Color.PINK);

				// 원을 그리자 (지름, 가로, 세로 모두 150)
				g.fillOval(x1, 200, 150, 150);
				// 사각형을 그리자 (지름, 가로, 세로 100)
				g.fillRect(x2, 500, 100, 100);
			}
		};

		// 쓰레드 2개를 생성해놓자!!
		t1 = new Thread() {
			public void run() {
				while (true) {
					// 원을 1/1000 초 간격으로 이동
					x1 += 5;
					
					// while 문이 너무 빠르므로, 그래픽처리가 쫒아가지 못함
					// 따라서 속도를 늦출 필요가 있다..
					try {
						can.repaint();
						Thread.sleep(100); // non-runnable로 갔다가 100/1000 초 뒤에 다시 복귀
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		t2 = new Thread() {
			public void run() {
				while (true) {
					// 사각형을 10/1000 초 간격으로 이동
					x2 += 5;
					try {
						can.repaint();
						Thread.sleep(10); // 10/1000초 뒤에 다시 복귀
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};

		can.setPreferredSize(new Dimension(980, 750));
		can.setBackground(Color.YELLOW);

		// 화면에 부착
		setLayout(new FlowLayout());
		add(bt);
		add(can);

		// 버튼과 리스너 부착
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 생성된 쓰레드 t1,t2를 jvm 에게 맡기자, Runnable 영역으로 밀어넣자!!
				t1.start(); // 이 시점에 메인 실행부는 이 쓰레드가 업무를 완료할때까지 기다리지 않으며 바로 다음 라인으로 가버린다...(비동기적 수행)
				t2.start(); // 이 시점에 메인 실행부는 이 쓰레드가 업무를 완료할때까지 기다리지 않으며 바로 다음 라인으로 가버린다...(비동기적 수행)
			}
		});

		setSize(1000, 800); // 윈도우 크기
		setVisible(true); // 윈도우 보이게
		setDefaultCloseOperation(EXIT_ON_CLOSE); // 윈도우 닫기 버튼 클릭시 프로세스 종료

	}

	public static void main(String[] args) {
		new ThreadApp();
	}

}
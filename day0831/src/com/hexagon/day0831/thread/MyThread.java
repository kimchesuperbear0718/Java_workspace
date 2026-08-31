package com.hexagon.day0831.thread;

//개발시 아주 필수가 되는 api는 java.lang...String,Thread..
//이 클래스를 쓰레드로 정의함..
public class MyThread extends Thread {
	String str;
	int interval;

	public MyThread(String str,int interval) {
		this.str = str;
		this.interval=interval;
	}

	public void run() {
		while (true) {
			System.out.println(str);
			// 그냥 while문만 사용하면 너무나 실행속도가 빠르므로 시스템에 부하가
			// 걸린다..따라서 runnable 상태에서 잠시 non-runnable 상태로
			// 빠져나갔다가 복귀시키는 방법으로 실행해보자
			try {
				Thread.sleep(interval);// 1초 밖으로 빠져나갔다가 다시 복귀해!!!
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

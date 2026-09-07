package com.hexagon.day0831.exception;

/*
 * 일상생활에서 프로그램에서 발생하는 문제를 에러라고 표현하지만,
 * java 분야에서는 개념을 분리햐여 처리한다.
 * 즉 java에서는 개발자가 해결할 수 없는 문제는 Error라고 표현하며,, 프로그래밍 언어적으로 다루지 않음
 * 
 * 1.에러 - 개발자가 해결할 수 업는 시스템문제,부가할력적 문제 등의 외부 문제에 의해 발생되는 프로그램적 문제
 * 			ex)네트워크 환경의 문제,하드웨어 이상등...
 * 
 * 2.예외-개발자가 프로그래밍 적으로 해결할 수 있는 문제
 * 
 * 3.예외 API 계보
 * Throwable (인터페이스)java 예외의
 * 
 * 4.예외의 유형
 * 1)강요하는 예외(Cheaked Exception)
 * -이미 java 코드를 작성하는 컴파일 시점에 컴파일러에 의해 예외 처리를 강요하는것
 * -Exception 클래스의 하위 클래스들
 * 
 * 2)강요하지 않는 예외(Unchecked Exception)
 * 	- 컴파일러 강요하지 않으므로,예외를 처리할지 말지 여부를 개발자가 결정함
 * 	- RuntimeException 클래스의 하위 클래스들
 * */

public class Text {

	public static void main(String[] args) {
		try{
			int[] arr = new int[3];
			
			arr[0]=23;
			arr[1]=5;
			arr[2]=8;
			arr[3]=9;//이 부분 문제가 발생
			
			System.out.println("실행완료");
		//try문에서 코드 수행중 혹여나 예외가 발생할경우,프로그램이 비정상 종료되지 않도록 실행부로 하여금 catch문으로 진입을 하게 됨
		//이때 개발자는 예외의 원인을 안내 메세지를 보여주고 사용자가 겪게 되는 원인 없는 비정상 종료를 방지해야함..
		}catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();//예외의 원인을 시스템 로그에 stack 구조로 추적하여 출력(사용자들이 아닌 개발자 또는 시스템관리자에게 보라고)
			System.out.println("배열의 크기를 벗어났습니다.크기를 확인해 주세요");//사용자들에게 보여줄 메시지..
		}
		
	}
}

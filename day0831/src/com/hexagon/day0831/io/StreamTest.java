package com.hexagon.day0831.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 1) Stream 이란?
 * - 원래 영어 단어의 물줄기,지류 등을 의미
 * -컴퓨터 분야에서는 물이 아닌 그 대상이 데이터임
 * 즉 데이터가 흘러가는 모습이 마치 물처럼 보인다고 하여 stream이라 표현함
 * 
 * 2)Stream 특징 
 * -방향성이 있음
 * 입력 : 실행중인 프로그램으로 데이터가 들어가는 모습 (input) 
 * 출력 : 실행중인 프로그램에서 데이터가 나가는 모습 (output)
 * 		따라서 입출력을 가리켜 (IO)라 부름
 * 
 * 3)stream은 java.io 패키지에서 지원함
 * -java.io에서는 File을 대상으로 입력 스트림을 FileINPUTStream 이라함
 * -java.io에서는 File을 대상으로 출력 스트림을 FileoutStream이라 함 
 * */

//특정 경로에 있는 파일을 읽어마셔,원하는 다른결로로 내뱉기(OUTPUT) -(복사)
public class StreamTest {
	FileInputStream fls;// 파일을 대상으로 한 입력 스트림 클래스 has a로 보유..
	FileOutputStream fos;//파일을 대상으로 한 출력스트림 클래스 has a 로 보유..

	public StreamTest() {
		String path = "C:/study_workspace/java_workspace/day0831/data/5.webp";
		String target="C:/study_workspace/java_workspace/day0831/data/5_copy.webp";
		// 아래의 코드는 현재 컴파일 에러가 난다,이유는 문법상의 문제가 아니라,java에서 개발자로 하여금 예외를 처리하도록
		// 이미지를 대상으로 스트림을 생성(즉 빨대를 꽂음)
		// 강요하는 예외처리는 무언가 필수적이거나,중요할때 java에서 컴파일러 차원에서 코드 작성 시점부터
		// 예외처리를 강제하는 경우 적용..
		try {
			fls = new FileInputStream(path);
			fos= new FileOutputStream(target);//생성할 파일의 경로,자동으로 빈파일을 만들어내며,당연히 empty상태임
			int data = -1;

			while (true) {
				data = fls.read();
				if (data == -1)
					break;
				fos.write(data);
				System.out.print(data);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일이 존재하지 않습니다.파일을 확인해 주세요");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("데이터를 읽는 중 문제가 발생했습니다");
		} finally {
			// 개발자가 Finally를 명시하면 try문이건, catch문이건 그 블럭 수행시 반드시 finally로 진입하게 되어있다.
			// 따라서 finally의 용도는 DB,stream 사용시 자원을 해제할때 많이 사용된..

			try {
				if(fls !=null) {
					fos.close();
				}
				if(fos !=null) {
					fos.close();
				}
			}catch (IOException e) {
				e.printStackTrace();
				
			} 
		}
	}

	public static void main(String[] args) {
		new StreamTest();
	}

}

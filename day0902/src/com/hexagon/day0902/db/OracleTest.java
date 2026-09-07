package com.hexagon.day0902.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleTest {

	public static void main(String[] args) {
		/*
		 * [JDBC 연동 순서] 1.드라이버 로드 2.접속 3.원하는 쿼리실행 4.접속 해제 및 지원 반납
		 */
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");// 드라이버 로드
			System.out.println("드라이버 로드 성공");

			Connection con= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe",
					System.getenv("ORACLE_USER"), System.getenv("ORACLE_PASSWORD"));
			
			if(con !=null) {
				System.out.println("오라클 접속 성공");
			}else {
				System.out.println("오라클 접속 실패");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버를 찾을 수 없습니다");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}

package com.hexagon.day0902.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mysql.cj.xdevapi.PreparableStatement;

/*
 * 
 * [데이터베이스 제품의 종류 - DBMS]
 * 1.Oracle - 라이센스에 따라 저가형도 있지만 수억원대..
 * 2.mysql - 중소 규모의 DB제품 (유,무료(Community 버전)공존)
 * 3.MSSQL - MS에서 개발한 제품(리눅스 계열보다는 윈도우 계열과 친함)
 * 4.PostgreSQL..기타 등등..
 * 
 * Java언어에서도 DBMS에 접속하고 제어할 수 있는데, 이 기능들은 java.sql 패키지에서 지원함
 * 이와 같이 java 기술로 db를 제어하는 기술을 가리켜 JDBC(Java Database Connectivity)
 * 
 * 
 * [드라이버란?]
 * java에서 DB를 제어하려면,해당 DBMS에서 구현해놓은 jdbc 구현체를 벤더시로부터 다운로드 받아 우리의 환경변수에 추가해야함
 * 하지만 이클립스와 같은 통합된 개발환경(IED)에서 개발할때는 환경 변수에 등록하는 대신 툴내의 user libray 로 등록해야함 
 * 하지만 개발이 끝나면?
 * */

public class DBTest {

	public static void main(String[] args) {
		// MySQL에 접속해보자!!

		// 멤버변수가 아닌 경우 개발자에 의해 반드시 초기값을 처리해야함..
		PreparedStatement pstmt = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로드");

			// 아래의 코드에 의해 접속이 성공되면,그 접속 정보를 가진 객체가 반환되는데,이 객체는 바로 Connection 인터페이스이다!!
			Connection con = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mydb?serverTimezone=Asia/Seoul&characterEncoding=UTF-8",
					System.getenv("MYSQL_USER"), System.getenv("MYSQL_PASSWORD"));
			if (con != null) {
				System.out.println("접속 성공");
			} else {
				System.out.println("접속 실패");
			}

			// 접속 성공되었으므로 퀴리문을 날려보자
			// 회원가입을 해보자!!
			// jdbc에서 퀴리문을 담당하는 객체는 PreparedStatement 인터페이스 이다!!
			// 인터페이스는 개발자가 직접 new 할수 없기 때문에 2가지 방법을 고민해야 함
			// 방법1)자식 클래스를 정의하며 자식을 new
			String sql = "insert into member2(login_id,pass,name,point) values('ironman','1111','stark','10000')";

			PreparedStatement pstmt = con.prepareStatement(sql);

			int result = pstmt.executeUpdate();
			if (result == 1) {
				System.out.println("레코드 1건 등록 성공");
			} else {
				System.out.println("실패");
			}
			// 개발자는 접속 결과 정보인 Connection이 메모리에 올라왔는지 여부로 접속 성공 여부를 따져 볼수 있다..
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 사용한 데이터베이스 관련한 객체들을 반납!!
			// 접속대기

			try {
				if (pstmt != null) {
					pstmt.close();
				}

				if (con != null) {
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}

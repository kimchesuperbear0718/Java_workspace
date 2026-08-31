package com.hexagon.day0828.gui;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/*로그인폼을 정의
  Java에서의 객체와 객체 간 관계는 단 2가지 유형 밖에 없다
  
  1) is a (상속관계) - 서로 같은 자료형으로 인정
  2) has a (포함관계) - 하나의 물체는 여러 객체들로 구성되어 있으며, 이때 구성물체 간에는 포함관계가 성립 
 */
public class LoginForm extends JFrame implements ActionListener, KeyListener {
	// has a 관계는 특정 클래스가 보유한 멤버변수의 자료형이 객체형인 경우 인정됨
	int x = 3; // int 는 객체자료형이 아닌 기본자료형이므로, 객체간 관계인 has a 관계로 보지 않음
	JLabel la_id;
	JLabel la_password;
	JTextField t_id; // id 입력 텍스트필드
	JPasswordField t_pass;
	JButton bt_login, bt_register;

	// 나의 크기는 300x160이다!!
	public LoginForm() {
		// has a 관계로 보유한 객체들을 메모리에 생성 타임에 올려보자!
		la_id = new JLabel("ID");
		la_password = new JLabel("Password");

		t_id = new JTextField(10); // 10자 넣을 크기로 생성(주의 - 10자 이상 들어갈 수있음)
		t_pass = new JPasswordField(10);

		bt_login = new JButton("Login");
		bt_register = new JButton("Join");

		// 부착 전에 레이아웃을 결정짓는다(우리의 경우 FlowLayout 으로..)
		// 내가 프레임이므로 this 사용가능
		// FlowLayout flow=new FlowLayout();
		this.setLayout(new FlowLayout()); // new 로만 코드를 작성한 이유? 이 라인 이후로 FlowLayout을
											// 제어할 일이 없으므로, 굳이 변수로 받아서 처리할 필요가없었기 때문..
		// UI컴포넌트의 크기 조정
		Dimension d = new Dimension(120, 30); // 크기를 표현한 객체(처음본 객체의 경우 메모리에 올리는 법을 조사해본다)

		la_id.setPreferredSize(d);
		t_id.setPreferredSize(d);
		la_password.setPreferredSize(d);
		t_pass.setPreferredSize(d);

		// UI 컴포넌트들을 프레임에 부착
		this.add(la_id);
		this.add(t_id);

		this.add(la_password);
		this.add(t_pass);

		add(bt_login);
		add(bt_register);

		// 리스너의 메서드가 동작하려면, 반드시 어떤 UI 컴포넌트와 연결할지 결정해야 한다..
		// 여기서는 Login 버튼에 연결해보자~~
		bt_login.addActionListener(this); // 로그인 버튼을 리스너와 연결
		bt_register.addActionListener(this); // 회원가입 버튼도 리스너와 연결하자

		// 텍스트 필드와 Key리스너와의 연결
		t_id.addKeyListener(this); // 현재 클래스에서 KeyListener 를 직접 상속받았기 때문에 "내가 곧 Key리스너" 이므로, 나의 인스턴스 주소값인
									// this를 대입!!!

		// 현재 클래스는 JFrame의 자식이므로, JFrame이 보유한 메서드를 내것처럼 사용할 수 있다.
		this.setSize(300, 160); // 여기서의 this는 생략이 가능하다.
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new LoginForm();
	}

	// 우리가 상속받은 ActionListener는 인터페이스 이므로, 불완전한 메서드인 추상메서드를 가진 자료형이다..
	// 따라서 우리는 이 클래스에서 반드시 구현할 의무를 가진다..(구현 강제 받음)
	// 사용자가 일으킨 이벤트 정보는 ActionEvent 객체안에 모두 들어있다..따라서 어떤 버튼이 눌렸는지에 대한 정보 또한 포함되어
	// 있다..
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(e);

		// 결국 e에는 어떤 컴포넌트가 이벤트를 발생시켰는지 정보가 들어있으므로, 조건문으로 구분을 해야 함
		Object obj = e.getSource(); // 이벤트를 일으킨 주체가 JButto 이기는 하나 Object로도 가리킬수 있으므로 이 코드는 올바른 코드임.

		// 눌려진 버튼 주소값을 가진 obj가 bt_login 이라면...
		if (obj == bt_login) {
			System.out.println("로그인 할래?");
		}

		// 눌려진 버튼 주소값을 가진 obj가 bt_register 이라면...
		if (obj == bt_register) {
			System.out.println("가입 할래?");
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		System.out.println("키 눌렀어?");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("키 눌렀다 떼었어?");

	}

}
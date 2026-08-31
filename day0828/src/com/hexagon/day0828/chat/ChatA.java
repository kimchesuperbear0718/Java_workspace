package com.hexagon.day0828.chat;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatA extends JFrame implements ActionListener,KeyListener{
    
    JButton bt_open; //대화 상대창 띄우는 버튼
    JTextArea area; //대화 로그가 쌓이는 영역
    JTextField t_input; //대화 입력 창
    
    public ChatA() {
    	super("ChatA");//부모의 생성자는 물려받지 않는다..
        bt_open = new JButton("Open");
        area = new JTextArea();
        t_input = new JTextField();
        
        //배치관리자 설정
        setLayout(new FlowLayout());
        
        //UI컴포넌트들에 대한 디자인 속성 적용 
        area.setPreferredSize(new Dimension(270, 290));
        t_input.setPreferredSize(new Dimension(270, 25));
        //윈도우에 UI컴포넌트 들 부착
        add(bt_open);
        add(area);
        add(t_input);
        
        //버튼과 리스너와의 연결!!!
        bt_open.addActionListener(this);
        t_input.addKeyListener(this);
        
        //윈도우 설정
        setSize(300,400);
        setVisible(true);
        
        //swing 의 윈도우창 닫기 버튼은 프로그램을 종료하는 버튼이 아니라, 사실 윈도우창의. setVisible(false) 하는 것 뿐이다.
        //따라서 윈도우창 닫기버튼 누를때, 프로세스(실행중인 프로그램)를 완전히 죽이려면 아래의 메서드를 이용하자 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("대화 친구 띄울꺼야!!");        
        //ChatB를 띄우기!!!
        new ChatB();
    }
    @Override
    public void keyTyped(KeyEvent e) {
    	
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
    	
    }
    
    @Override
    public void keyReleased(KeyEvent e) {
    	//아스키 코드 중 Enter 키에 대해서만 반응을 보이자!!
    	int key = e.getExtendedKeyCode();
    	
    	if(key==KeyEvent.VK_ENTER);{
    		//나의 area 값 대입
    		//chatB의 area 값 대입
    		//ex)chatB.area.메서드();
    	}
    }
    
    public static void main(String[] args) {
        new ChatA();
    }


}
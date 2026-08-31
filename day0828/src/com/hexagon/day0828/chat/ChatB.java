package com.hexagon.day0828.chat;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatB extends JFrame{
    
    JTextArea area; //대화 로그가 쌓이는 영역
    JTextField t_input; //대화 입력 창
    
    public ChatB() {
        area = new JTextArea();
        t_input = new JTextField();
        
        //배치관리자 설정
        setLayout(new FlowLayout());
        
        //UI컴포넌트들에 대한 디자인 속성 적용 
        area.setPreferredSize(new Dimension(270, 330));
        t_input.setPreferredSize(new Dimension(270, 25));
        
        //윈도우에 UI컴포넌트 들 부착
        add(area);
        add(t_input);
        
        //윈도우 설정
        setSize(300,400);
        setVisible(true);
    }
    
}
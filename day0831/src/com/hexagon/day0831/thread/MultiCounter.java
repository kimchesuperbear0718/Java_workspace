package com.hexagon.day0831.thread;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

public class MultiCounter extends JFrame implements ActionListener{
    JButton bt;
    JLabel la1;
    JLabel la2;
    
    public MultiCounter() {
        bt = new JButton("카운터 시작");
        la1 = new JLabel("0");
        la2 = new JLabel("0");
        
        int n1;//프로그램이 가동되는 동안 그 값이 누적되기 위해,지역변수가 아닌 멤버 변수로 선언
        		//멤버변수에 한해서는 개발자가 초기화하지 않으면,컴파일러에 의해 자동 초기화된..(단 관여는 최소한의 관여)
        		//여기서는 int형 이므로 0으로 자동 초기화
        
        
        //배치방법 결정 
        setLayout(new FlowLayout());
        
        //스타일 적용
        bt.setPreferredSize(new Dimension(350,30));
        Dimension d = new Dimension(180, 200);
        la1.setPreferredSize(d);
        la2.setPreferredSize(d);
        
        //라벨에 경계선 부여 
        la1.setBorder( new LineBorder(Color.RED));
        la2.setBorder( new LineBorder(Color.RED));
        
        la1.setFont(new Font("verdana", Font.BOLD, 80));
        la2.setFont(new Font("verdana", Font.BOLD, 80));
        
        //부착 
        add(bt);
        add(la1);
        add(la2);
        
        //버튼과 리스너 연결
        bt.addActionListener(this);
        
        //윈도우 설정 
        setSize(400,300);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e) {
    	//1씩 증가한 결과를 라벨에 출력해보자
    	n1++;
    	
    	//라벨에 텍스트 넣기
    	//java의 기본 자료형을 객체로 바꿀수 있나? int형이 3을 객체형인"3"으로...
    	//자바의 모든 기본 자료형마다 1:1로 대응되는 wrapper클래스가 지원된다...
    	//int 형을 객체형으로 변경하려면?integer
    	//byte-->Byte,short-->Short,long-->Long
    	
    	//collection framework 이란?java언어에서 오직 객체만을 모아서 처리할때 유용한 api를 지정함
    	//java에서 객체가 모여있는 모습은 크게 2가지로 분류 - 순서O,순서X
    	//1)순서있는 집합 - 배열(크기가 결정되어있고,객체를 섞어서 넣을 수 없음) int[]arr = new int[7];
    	//     			-List 계열 - ArrayList,Vector,Stack...
    	
    	//2)순서없는 집합-Set
    	//				Map(key-value)
    	//ex)자바의 컬랙션 프레임웍인 LIST에 숫자를 넣어보자!!!
    	
    	List list = new ArrayList();
    	list.add(1);//원칙상 1은 기본자료형이므로,컬랙션에 직접 넣을 수 없고 반드시 객체화시켜서 넣어야 하지만,개발자에게 편의를 제공하기위해
    				//sun측에서 내부적으로 1을 객체화 시켜버림..auto-boxing(기본 자료형을 객체자료형으로 자동 변환)
    				//즉 int형을 integer로 변경
    	//Integer it=new Integer(2);
    	//list.add(it);
    	
    	la1.setText(Integer.toString(n1));
    	
    	
    	//la1.setText(n1);
    }
    
    public static void main(String[] args) {
        new MultiCounter();
    }


}
package com.hexagon.day0826.tester;

import com.hexagon.day0826.hardware.GallerxyA;
import com.hexagon.day0826.hardware.GallerxyB;

/*
 * 지금부터 IPhoneA,B를 테스트해본다.
 * */
public class Test {
    // 아래의 멤버변수는 개발자가 그 값을 할당하지 않았으므로, 즉 초기화 하지 않았으므로
    // 멤버변수이므로 컴파일러가 최소한의 관여를 하게 되는데, 객체자료형의 경우엔 null 로 초기화된다..
    // 즉 아무런 인스턴스도 가리키지 않고 있는 상태이다..
//    IPhoneA i1=new IPhoneA();
//    IPhoneB i2=new IPhoneB();
    
    public static final int x=3;//final 로 변수의 값을 고정시킬 수 있음..
    
    public Test() {
    	//x=5; 상수는 변하게 할 수 없으므로,...
    }
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
    	GallerxyA g1 = new GallerxyA();
    	GallerxyB g2 = new GallerxyB();
        
        // 메모리에 올라온 두 스마트폰의 성능을 테스트해보자 
        
        // 어차피 스마트폰의 전화 기능은 동일함에도 불구하고, 이 통화메서드의 명칭이 틀리기 때문에,
        // 만일 제품이 상당히 많을 경우 각 제품마다 메서드명을 사전에 미리 조사하고, 각 제품마다 틀린 메서드를 호출해야 함..
        // 애플리케이션 개발 시 유지보수성이 떨어짐...
        g1.calling();
        g2.calling();
        
        //Phone 에는 sound()가 없기 때문에 downcasting 으로 내려와서 호출
        GallerxyA a = (GallerxyA)g1;
        a.sound();
        
        //인터페이스를 구현한 객체는 해당 인터페이스와 같은 종류의 자료형으로 인정된다.
        //따라서 is a 관계가 성립함
        MusicPlayer mp = new GallerxyA();
        mp.sound();
        
    }

}
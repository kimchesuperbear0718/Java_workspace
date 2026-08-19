//이 클래스는 animal 패키지에 들어있음을 선언!!!
package animal;

//패키지에 넣은 클래스는 다른 외부 패키지에서 안보이기 때문에,
//public으로 저장해야한다
//아래의 클래스를 javac 명령어로 컴파일 할때, 아무런 옵션을 주지 않으면
//class 파일이 같은 디렉토리에 생성되어 버린다...(절대 해서는 안됨)
//실무에서는 .java .class는 같은 디렉토리에 두지 않고 분리시켜서 관리함
//해결책? javac 명령어의 옵션중 컴파일 결과 파일의 위치를 지정할 수 있는
//		옵션이 있다... 예)

//개발자가 맴버변수에 아무런 접근
//제한자를 명시하지 않으면 기본
//접근제한자인 default 접근제한자
//가 적용된다..
//효과)같은 패키지에 있는 클래스만
//접근할 수 있다...
public class Duck{
	String name="집오리";
	int age=3;
	String color="white";
	
	public String getName(){
		return name;
}      
package String;

//String 클래스와 같이 개발 시 그 사용빈도 압도적으로 높은 언어의 필수적 클래스 들은
//java.lang 패키지에 들어 있으며, 이패키지는 개발자가

public class StringTest {

	public static void main(String[] args) {
		/*애플리케이션을 개발할때 개발자가 모든 것을 일일이 다 작성하는가?
		 * 예를 들어 사람은 문자 자체 보다는 문자열을 훨씬 더 많이 사용한다..
		 * 하지만 대화내용을 처리하기위해 char형 배열을 쓴다면 개발시 너무나 많은
		 * 시간과 노력이 필요하다..
		 * 해결책?이미sun에서는 char배열을 사용하지 않도록 문자열이라는 클래스를 지원한다..
		 * String(클래스 였다..)
		 * */
		String s="오늘 한게임, 할래?";//String의 맨앞에 오는 S가 대문자라는 것은
		//바로 이 자료형이 객체형이라는 것이 증명된것이다..
		//String 은 누군가에 의해 정의된 것이고, 우리가 만들지 않았기 때문에, 이String
		//정의한 개발자가 반드시, 사용설명서(Application Programming Interface)를
		//만들었을 것이다.. 그렇다면 이 설명서는 어디??
		//보통 제작회사인 벤더사에서 http문서를 제공해줌..
		//검색어에 java 8 api document
		String[]str=s.split(",");
		
		System.out.println("분리된 결과 배열의 수는 "+str.length);
		System.out.println(str[0]);
		System.out.println(str[1]);
		
		String n="korea";
		
		//korea 를 대상으로 첫번째 k만을 추출하는 메서드를 String api 를 통해
		//찾아서 사용해보시요..즉 화면에 k만 골라서 출력하기!!
		//힌트)메서드명이 특정 문자열내에서 몇번째를 추출한다는 의미를 갖고 있음..
		
		//모든 문자열을 대상으로 반복문으로 출력하려면?
		for(int i=0;i<n.length();i++) {
			char c = n.charAt(i);
			System.out.println(i+"번째 문자는"+c);
		}
		
		//korea 라는 문자열을 대문자로 변환하여 출력 KOREA로...
		String up =n.toUpperCase();
		System.out.println(up);
		
		//char c='이';
		//char[] arr = new char[10];
	}

}

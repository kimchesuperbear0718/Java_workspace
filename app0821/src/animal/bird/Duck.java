/*현실의 오리를 정의한다.*/
package animal.bird;

//외부의 클래스들이 이 클래스를 사용할수 있도록 접근제한을 풀어주자
public class Duck extends Bird{
					/* extends 는 다른 말로 is a 로 이해할 수 있다.
						공식용어..
						따라서"오리는 새이다"라는 현실의 개념을 extends로도
						표현할 수 있다..
						같은*/
	public void quack(){
		System.out.println("꽥꽥대요");
	}
}
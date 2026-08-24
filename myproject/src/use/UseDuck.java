/*지금까지는 모든 클래스를 하나의 디렉토리에 몰아서 위치 시켰기 때문에
클래스들간의 패키지 관계를 생각할 필요가 없었다...
하지만 지금부터는 현재 클래스와는 전혀 다른 패키지에 위치한 다른
접근하고 사용해보자!!
*/
package use;

//나와는 다른 경로에 있는 파일을 명시할때 사용하는 키워드
import animal.Duck;

//Duck의 경우 쓰임을 당하므로 public으로 클래스를 공개해야 했다
//하지만,아래의 클래스를 Duck을 쓰는 입장이므로, 공개할 필요가 없다..
//패키지로 선언된 클래스를 실행하려면 아래의 옵션을 붙여야 함
//java use.UseDuck 즉 패키지명을 .찍고 앞에 명시해야 함
class UseDuck{ 
	public static void main(String[] args){
		//문법상의 문제가 아니라,현재 Duck이 같은 use 패키지에 없다!!!
		Duck d = new Duck();
		System.out.println("오리 이름은 "+d.getName());
	}
}	
	

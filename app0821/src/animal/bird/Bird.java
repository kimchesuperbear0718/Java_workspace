package animal.bird;

/*이 클래스의 존재 이유?
	- 일반적인 새들이 갖는 공통 기능 및 특징을 보유할 수 있는
		새들의 최상위 객체를 정의
	- 공통코드를 이 클래스에 저장해 놓으면 ,추후 자식 클래스 작성 시
		동일한 코드를 작성할 필요가 없으므로,즉 코드 중복을 피할 수 있음
	- 코드 중복이 나쁜이유
		유지보수성이 현저히 떨어지므로...
	-유지보수성이 떨어지면 안좋은 이유
		1)퇴근이 늦어진다 (개발자 중심)
		2)비용이 발생 (기업주 입장)
		*/
		public class Bird{
			boolean hasNib=true;
	
			public void eat(){
				System.out.print("새가 먹이를 먹어요")
		}
			public void fly(){
				System.out.println("나는날ㅇㅇ아여ㅛ");
			}
		}
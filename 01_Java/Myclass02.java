class Myclass02 {
	public static void main(String[] args) {

	int gyudonPrice = 500; // 실수로 500엔이 된 규동 가격 상자
	int beerPrice = 700; //실수로 700엔이 된 맥주 가격 상자
	int tmp = 0; // 값을 잠시 담아둘 빈 상자



	System.out.println("[잘못된 메뉴판]");
	System.out.println("규동 가격: " + gyudonPrice + " 엔 / 맥주 가격: " + beerPrice + "엔");
	System.out.println("---------------------------------------------");


	tmp= gyudonPrice;
	

	gyudonPrice = beerPrice;

	beerPrice = tmp;


	System.out.println("[복구된 정상 메뉴판]");
	System.out.println("규동 가격: "+ gyudonPrice + " 엔 / 맥주 가격: " + beerPrice + "엔");

	}		

}



	
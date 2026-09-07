package fruit;

public class Apple {

private String name = "사과";

private int price = 100;

public Apple() {
}

public Apple(String name, int price) {
	this.name = name;
	this.price = price;
}

public void setName(String name) {
	this.name = name;
}

public void setPrice(int price) {
	this.price = price;
}

public String getName() {
	return  name;
}

public int getPrice() {
	return  price;

}

}
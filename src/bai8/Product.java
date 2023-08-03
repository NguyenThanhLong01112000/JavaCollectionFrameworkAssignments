package bai8;

public class Product {
	private String code;
	private String name;
	private int price;
	private int quantity;

	public Product(String code, String name, int price, int quantity) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public void showProductInfo() {
		System.out.println(code + " " + name + " " + price + " " + quantity);
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public void ChangeProductInfo(String code, String name, int price, int quantity) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

}

package ex1;

public class Product {
	
	
	
	
	public String pName;
	public int price;
	public String brand;

	
	public Product() {} 
	
	public Product(String pName, int price, String brand) {
		this.pName = pName;
		this.price = price;
		this.brand = brand;
		
	}
	
	public void information() {
		System.out.println("이름 : " + pName + "\n가격 : " + price + "\n브랜드 : " + brand);
	}
	
	
	
	
	
	

}

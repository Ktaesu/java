package test240711.object2;

public class TV {
	private String company;
	private int year;
	private int inch;
	private int price;
	
	public TV(String company, int year, int inch, int price) {
		super();
		this.company = company;
		this.year = year;
		this.inch = inch;
		this.price = price;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	public void show() {
		System.out.printf("%s에서 만든 %d년형 %d인치 TV 가격 : %d\n", this.company, this.year, this.inch, this.price);
	}
}



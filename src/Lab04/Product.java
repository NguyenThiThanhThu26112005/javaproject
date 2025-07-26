package Lab04;

public class Product {
	private String name;
	private double price;
	private double tax;

	public Product() {

	}

	public Product(String name, double price, double tax) {
		this.name = name;
		this.price = price;
		this.tax = tax;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;

	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;

	}

	public void setTax(double tax) {
		this.tax = tax;

	}

	public double getTax() {
		return tax;
	}

	public Product nhapThongTin(String name, double price, double tax) {
		Product pr = new Product(name, price, tax);
		return pr;
	}

	public void xuatThongTin(Product pr) {
		System.out.println("Ten la: " + pr.getName());
		System.out.println("Gia la: " + pr.getPrice());
		System.out.println("Thue la: " + pr.getTax());
	}

	public double getTaxPrice(double price, double tax) {
		return price * tax;
	}

}

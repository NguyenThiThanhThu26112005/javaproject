package Lab04;

public class Bai2 {
	public static void main(String[] args) {
		System.out.println("run video 30");
		Product pr1 = new Product();
		pr1.nhapThongTin("Thanh Thu", 2000000, 0.1);

		Product test = new Product();
		Product pr2 = test.nhapThongTin("Thanh Lam", 100000, 0.3);
		test.xuatThongTin(pr2);
		double tienThue = test.getTaxPrice(pr2.getPrice(), pr2.getTax());
		System.out.println("Tien thue = " + tienThue);
	}
}

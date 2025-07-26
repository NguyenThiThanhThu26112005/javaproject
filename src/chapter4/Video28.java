package chapter4;

public class Video28 {
	public static void main(String[] args) {
		System.out.println("run video 28");

		System.out.println("run video 26");
		Student st1 = new Student();

		Student st2 = new Student("Thanh Thu", 20);
		st2.setName("Thanh Thu new setname");
		System.out.println("Check obj:  " + st2.getName() + " and age " + st2.getAge());
	}
}

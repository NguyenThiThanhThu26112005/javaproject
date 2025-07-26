package chapter4;

public class Student {

	// class attribute
	private String name;
	private int age;
	private String address;

	public Student() {

	}

	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	public String getName() {
//		return "Hoi voi " + this.name;
//	}
//
//	// class method
//	void learnJava() {
//		System.out.println("learn Java with Youtube ");
//	}
//
//	// function overloading
//	void learnJava(int a) {
//		System.out.println("learn Java with Youtube ");
//	}
//
//	public int getAge() {
//		return age;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
}

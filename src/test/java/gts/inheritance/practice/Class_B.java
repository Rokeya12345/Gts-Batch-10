package gts.inheritance.practice;

public class Class_B extends Class_A {

	public static void main(String[] args) {
		Class_B obj = new Class_B();
		obj.getCompany();
		obj.getBusiness();
	}

	public void getHome() {
		System.out.println("I am from class B");
	}

	public void getBook() {
		System.out.println("I am from class B");
	}

}

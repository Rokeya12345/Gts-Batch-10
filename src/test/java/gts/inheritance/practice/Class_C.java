package gts.inheritance.practice;

public class Class_C extends Class_B {

	public static void main(String[] args) {

		Class_C obj = new Class_C();
		obj.getHome();
		obj.getBook();
		obj.getCompany();
		obj.getBusiness();
	}

	public void getPen() {
		System.out.println("I am from class C");

	}

	public void getDesk() {
		System.out.println("I am from class C");

	}
}

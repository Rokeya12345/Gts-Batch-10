package gts.abstraction.practice;

public class AbstractClassExecute extends AbstractClassA {

	@Override
	public void getSalary() {
		System.out.println("This is a Abstract method calling from Abstract class ");
	}

	public static void main(String[] args) {
		AbstractClassExecute obj = new AbstractClassExecute();
		obj.getSalary();
		obj.getEmpInfo();

	}

}

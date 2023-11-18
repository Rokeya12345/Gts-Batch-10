package gts.encapsulation.practice;

public class EncapsulationClassA {
	
	public static void main(String[] args) {
		
		EncapsulationClassA encapsulationClassA = new EncapsulationClassA();
		encapsulationClassA.getGetJobTitle();
		encapsulationClassA.getWeeklySalary();
	}
	
	private String getJobTitle = "QA Engineer";
	private int weeklySalary = 2000;
	
	public String getGetJobTitle() {
		System.out.println(getJobTitle);
		return getJobTitle;
	}
	private int getWeeklySalary() {
		System.out.println(weeklySalary);
		return weeklySalary;
	}

}

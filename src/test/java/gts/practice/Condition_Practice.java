package gts.practice;

public class Condition_Practice {
	public static void main(String[] args) {
	// between 90-100, Your grade is A
	// between 80-89, Your grade is B
	// between 70-79, Your grade is C
	// between 60-69, Your grade is D
	// less than 60 , Your grade is F
		
		int grade= 20;
		
		if(grade>=90 && grade<=100) {
			System.out.println("Your grade is :" + "A");
		}
		else if(grade>=80 && grade<=89) {
			System.out.println("Your grade is :" + "B");
		}
		else if(grade>=70 && grade<=79) {
			System.out.println("Your grade is :" + "C");
		}
		else if(grade>=60 && grade<=69) {
			System.out.println("Your grade is :" + "D");
		}
		
		else if (grade<60) {
			System.out.println("Your grade is :" + "F");
		}
		else {
			System.out.println("Error, cannot identify yoiur grade");
		}
	}

}

package gts.practice;

public class Travel_Condition {
	public static void main(String[] args) {
		
		// Commute to Manhattan
		// When you have Car you can go to Manhattan
		// When you call Uber you can go to Manhattan
		// When you take Subway you can go to Manhattan
		// When you take Bus you can go to Manhattan
		// other wise you stay home
		
		String transportation  = "Car";
		
		if(transportation=="Car") {
			System.out.println("you can go to Manhattan, it will take 20 min");
		}
		else if(transportation=="Uber") {
			System.out.println("you can go to Manhattan, it will take 30 min");
		}
		else if(transportation=="Subway") {
			System.out.println("you can go to Manhattan, it will take 40 min");
		}
		else if(transportation=="Bus") {
			System.out.println("you can go to Manhattan, it will take 40 min");
		}
		else  {
			System.out.println("Just stay home and relax");
		}
		
		
	}

}

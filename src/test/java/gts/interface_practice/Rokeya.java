package gts.interface_practice;

public class Rokeya implements Identification,Vehicle{

	public void getCar() {
		System.out.println("This is my Honda car ");
		}
	public void getModel() {
		System.out.println("My car model is Accord");	
		}
	public void getInsurance() {
		System.out.println("Insurance name is Journal");
		}
	
	public static void main(String[] args) {
		Rokeya RokeyaCar = new Rokeya();
		RokeyaCar.getCar();
		RokeyaCar.getModel();
		RokeyaCar.getInsurance();
		
		System.out.println();
		
		Rokeya RokeyaInfo = new Rokeya();
		RokeyaInfo.getName();
		RokeyaInfo .getAddress();
		RokeyaInfo .getNumber();
		
	}
	
	public void getName() {
		System.out.println("My name is Rokeya");
	}
	public void getAddress() {
		System.out.println("My address abc st");
	}
	public void getNumber() {
		System.out.println("My number is 485-452-0112");
	}
		
}

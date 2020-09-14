package week11;

public class constructor {
	
	int age=5;
	String breed="Persian";
	String size;
	
	public constructor(){
		System.out.println("My Cat is Age "+age);
		System.out.println("My Cat is Breed "+breed);
	}
	
	void mathod1(){
		System.out.println("My Cat is Size "+size);
	}
	void mathod2() {
		
	}
	public static void main(String[]arge) {
		String size="big";
		constructor cat1 = new constructor();
		constructor cat2 = new constructor();
		cat2.size="small";
		cat2.mathod1();
		
	}
}

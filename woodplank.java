package week11;

public class woodplank {
	String Name;
	int Number1;
	int Number2;
	
	
	public woodplank() {
		super();
		System.out.println("Crafting");	
		}
	public woodplank(int num1, int num2,String name) {
		this.Number1=num1;
		this.Number2=num2;
		this.Name = name;
	}
	
	public static void main(String[]arge) {
		woodplank ct1 = new woodplank(2,4, "workbench");
		woodplank ct2 = new woodplank();
		System.out.println("use woodplank "+ct1.Number1 +" x "+ct1.Number1);
		System.out.println("use woodplank "+ct1.Number2);
		System.out.println("have "+ct1.Name);
		
	}
}

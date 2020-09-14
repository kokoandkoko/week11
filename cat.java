package week11;

public class cat {
	String breed;
	String size;
	String color;
	String name;
	int age;
	
	void print() {
		System.out.println("Breed is: " + breed);
		System.out.println("size is: "+ size);
		//System.out.println("color is: "+ color);
		//System.out.println("size is: "+ age);
	}
	
	void name() {
		System.out.println("My Cat is: "+ name);
	}
	
	public static void main(String[]arge) {
		
		cat Cat1 = new cat();
		cat Cat2 = new cat();
		Cat1.name="jojo";
		Cat1.name();
		Cat1.breed="Prersian";
		Cat1.size="small";
		Cat1.color="black";
		Cat1.age=2;
		Cat1.print();
		Cat2.name="dio";
		Cat2.name();
		Cat2.breed="Prersian";
		Cat2.size="fat";
		Cat2.print();
		
	} 
}

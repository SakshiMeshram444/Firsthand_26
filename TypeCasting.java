package firsthand_26;

public class TypeCasting {
public static void main(String args[]) {
	
	//automatic/widening
	byte age = 30; //byte
	int new_age = age; //bigger container
	System.out.println(new_age); //30
	
	//manual / narrowing
	int salary = 40000;
	short new_salary = (short) salary;
	System.out.println(new_salary); //40000
	
	
	float percentage = 77.8f;
	int new_percentage = (int) percentage;
	System.out.println(new_percentage); //77
}
}

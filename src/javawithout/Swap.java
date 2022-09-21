package javawithout;

public class Swap {   
	public static void main(String[] args) {  
		
	float first = 5.0f, second = 8.5f;
	System.out.println("--Before swap the numbers--");
	System.out.println("First number = " + first);       
	System.out.println("Second number = " + second);        
	first = first - second;       
	second = first + second;       
	first = second - first;        
	System.out.println("--After swap the numbers--");      
	System.out.println("First number = " + first);
System.out.println("Second number = " + second);
}
	}

package javawithout;

public class Gcd {

	public static void main(String[] args){ 
		int input_1 , input_2 , gcd ;     
		input_1 = 12;       input_2 = 18;  
		gcd = 1;       
		System.out.print("The first number is " + input_1);   
		System.out.print("\nThe second number is " + input_2);   
		for(int i = 1; i <= input_1 && i <= input_2; i++){
			if(input_1%i==0 && input_2%i==0)  
				gcd = i;  
			}       
		System.out.printf("\nThe GCD of %d and %d is: %d", input_1, input_2, gcd);  
		}
}


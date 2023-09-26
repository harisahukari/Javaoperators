package operators;

public class Incrementdecrement {

	public static void main(String[] args) {
		int a = 12;
		int b = 9;
		
		// increment operator
		a = ++a; //pre increment
		System.out.println(" pre increment:" + a);
		a = a++; //post increment
		System.out.println(" post increment:" + a);
		
		//decrement operator
		b = --b; //pre decrement
		System.out.println(" pre decrement:" + b);
		b = b--;  //post decrement
		System.out.println(" post decrement:" + b);
		
		

	}

}

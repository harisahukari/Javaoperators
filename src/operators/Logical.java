package operators;

public class Logical {

	public static void main(String[] args) {
		int i = 10;
		int j = 15;
		int k = 20;
		// && operator
		System.out.println((i<j) && (i<k));
		System.out.println((i<j) && (i>k));
		
		// || operator
		System.out.println((i<j) || (i<k));
		System.out.println((i>j) || (j<k));
		System.out.println((i>j) || (j>k));
		
		// ! operator
		System.out.println(!(i==j));
		System.out.println((i>j));
	}
}
	

	



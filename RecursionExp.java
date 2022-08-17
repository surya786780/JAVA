// factorial using recursive

import java.util.*;

class Recursions{
	int calFact(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return (n * calFact(n-1));
		}
	}
}
public class RecursionExp {

	public static void main(String[] args) {
		
		Recursions result = new Recursions();
		Scanner s = new Scanner(System.in);
		int fact = s.nextInt();
		int res = result.calFact(fact);
		s.close();
		System.out.println("Factorial of "+fact+" is "+res);
	}

}

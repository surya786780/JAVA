class Calc{
	int i;
	int j;
	double k;
	double l;
}	
class C1 extends Calc{
	public float add(int i,int j) {
		return i+j;
		}}
class C2 extends C1{		
	public float sub(int i,int j) {
			return i-j;		
}}
class C3 extends C2{
	public float mul(int i,int j) {
		return i*j;
		}
}
class C4 extends C3{
	public double div(double k,double l) {	
		try {
				l=0;
			}
			catch(ArithmeticException e) {
				System.out.println(e+"ArithmeticException");
			}
		
		return k/l;
	}			
}

public class Inheritance {
	public static void main(String args[])
	{
		C4 obj=new C4();
		System.out.println(obj.add(11, 12));
		System.out.println(obj.sub(20, 12));
		System.out.println(obj.mul(10, 10));
		System.out.println(obj.div(12, 2));
	}
}


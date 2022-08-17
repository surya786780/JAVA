package first;

class one{
	
	public static int o(int a) {
		System.out.println("another class");
		System.out.println("1");
		 a = a*a;
		return a;
	}
	public static int n(int a) {
		System.out.println("2");
		a = a*a;
		return a;
	}
	
}
public class charcheck {
	int ab=10;
	public charcheck() {
		ab=222;
	}
	public void sk() {
		System.out.println("public method");
	}
	
	static void ks() {
		System.out.println("static method");
	}


			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
//				for(int i=1;i<=50;i++) {
//					if(i==3 || i==5 || i%10==3 || i%10==5) {
//						continue;
//					}
//					else {
//						System.out.print(i+" ");
//					}
//				}
				charcheck pub = new charcheck();
				pub.sk();
				System.out.println(pub.ab);
				ks();
				int a=5;
				// another class
				one o1 = new one();
				a=o1.o(a);
				System.out.println(a);
				int b=o1.n(a);
				System.out.println(b);
			}
}

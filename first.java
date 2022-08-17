package first;
import java.util.Scanner;

public class first {
	public static void main(String args[])
	{
		//int short float double
		
		/**int i=500; 			//4 byte -> 32 bits -> (range  -2,147,483,648 to 2,147,483,647 )
		short s= 8;			//alter for int 2 byte -> 16 bits  (range   -32768 to 32767 )
		byte b=5;			 // alter for int and byte 1byte-> 8->bits -> (range -128 to 127 )
		long l=500000000l; 	// 8 bytes -> 64 bits
		
		float f=3.45f; 		// if use float use the f last of the num  4byte->32 bits
		double d=4.4; 		//in java double datatype is default--> 8 bytes -> 64 bits
		
		double d1=5;		 //implicit conversion o/p is 5.0
		int k=(int)5.7; 	//explicit conversion o/p is 5
		System.out.println(k);
		
		char c='a';
		c=65; //we use char as a integer these in cnvert into ascii value op is A
		System.out.println(c);**/
		
//		int a=93,b=44,c=80;
//		if (a>b&&a>c)
//		{
//		System.out.println(a);
//		}
//		else if (b>c)
//		{
//			System.out.println(b);
//		}
//		else
//		{
//			System.out.println(c);
//		}
//		int d=a+b+c;
//		System.out.println("total mark is " +d);
//		double e=d/3;
//		System.out.println("average is "+e);
	
//		for (int i=1;i<5;i++) {
//			for (int j=1;j<5;j++) {
//				if(i==2 && j==4 || i==3 && j>2 || i==4 && j>1) {
//					System.out.print("N ");
//				}
//				else {
//					System.out.print("Y ");
//				}
//			}
//			System.out.println();
//		}
		
		
		Scanner s=new Scanner(System.in);
		Scanner v=new Scanner(System.in);
		System.out.println("Age,Name:");
		int a=s.nextInt();
		String b=v.nextLine();
		System.out.println("Age: "+a);
		System.out.println("Name :"+b);
	}
}







import java.util.Scanner;

public class Patterns {
	public static void pyramid(int a) {
		
		//pyramid type patterns
		int i,j,k;
		int b=1;
		for (i=1;i<=a;i++) 
		{
			for (j=a;j>i;j--) 
			{
				System.out.print(" ");
				}
//			for (k=1;k<=b;k++) {
//				System.out.print(Math.abs(k-i));
//				System.out.print("*");
//				System.out.print(k);
//				System.out.print(b);
//				System.out.printf("%c",i+64);		//for alphabet pattern	
//				System.out.printf("%c",k+64);
//				System.out.printf("%c",b+64);
				
//				for(k=i-1;k>=-(i-1);k--) {
//				System.out.printf("%c",i-Math.abs(k)+64);
			
//				for (k=b;k>=1;k--) {
//					System.out.printf("%c",k+64);
				
//				for(k=i-1;k>=-(i-1);k--) {
//					System.out.print(i-Math.abs(k));
			
				for (k=b;k>=1;k--) {
					System.out.print(k);
			}
			b+=2;
			System.out.println();
			
			
//			
		
		// X - character type patterns
//		char b[]=a.toCharArray();
//		int r,c;
//		for (r=0;r<a.length();r++) {
//			for (c=0;c<a.length();c++) {
//				if (r==c || r+c == a.length()-1) {
////					System.out.print(b[r]);
//					System.out.print(b[c]);
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
		
		// X - integer type patterns
//		int r,c;
//		for (r=0;r<a;r++) {
//			for (c=0;c<a;c++) {
//				if (r==c || r+c == a-1) {
////					System.out.print(a);
////					System.out.print(r+1);
//						System.out.print(c+1);
////					System.out.print("*");
//					
//				}
//				else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}
		
		
//		***********    PHOTO FRAME PATTERN   ***********
		
//		int r,c;
//		for (r=0;r<a;r++) {
//			for (c=0;c<a;c++) {
//				if (r==0 || c == a-1 || r==a-1 || c==0) {
////					System.out.print(a+" ");
////					System.out.print(r+1+" ");
//					System.out.print(c+1+" ");
////					System.out.print("* ");
//					
//				}
//				else {
//					System.out.print("  ");
//				}
//				
//			}
//			System.out.println();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//		for char pattern
//		String a = sc.nextLine();
		
//		for integer pattern
		int a = sc.nextInt();
		
		sc.close();
		pyramid(a);
	}
}
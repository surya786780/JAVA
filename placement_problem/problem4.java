import java.util.Scanner;

public class problem4 {
	
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
//		---------------1st--------------------
//		fibonacci series
//		int limit=scan.nextInt();
//		int a=0;
//		int b=1;
//		System.out.print(a+" "+b+" ");
//		for(int fib=2;fib<limit;fib++) {
//			int c=a+b;
//			System.out.print(c+" ");
//			a=b;b=c;
//		}
//		----------------2nd---------------------
//		recursion using factorial
//		System.out.println("Enter a number to print factorial");
//		int user=scan.nextInt();
//		int a = fact(user);
//		System.out.println(a);
//		
//	}
//	static int sum=1;
//	public static int fact(int num) {
//		int res=0;
//		if(num>1) {
//			sum*=num;
//			fact(num-1);
//		}
//		res+=sum;
//		return res;
//}	
		
//		----------------3rd---------------------
//		sum of n even numbers
//		int num=scan.nextInt();
//		int even=0;
//		for (int i=0;i<=num;i++) {
//			if(i%2==0) {
//				even+=i;
//			}
//		}
//		System.out.println(even);
//		----------------4th---------------------	
//		ascending order (bubble sort alg i am using here)

//		int asc[]= {8,4,5,2,6,7};
//		for(int i=asc.length-1;i>=0;i--) {
//			for(int j=0;j<i;j++) {
//				if(asc[j]>asc[j+1]) {
//					int temp=asc[j];
//					asc[j]=asc[j+1];
//					asc[j+1]=temp;
//					}
//				}
//		}
//		for(int k:asc) {
//		System.out.print(k+" ");
//		}
////	descending order----------------------	
//		int dsc[]= {8,4,5,2,6,7};
//		for(int i=dsc.length-1;i>=0;i--) {
//			for(int j=0;j<i;j++) {
//				if(dsc[j]<dsc[j+1]) {
//					int temp=dsc[j];
//					dsc[j]=dsc[j+1];
//					dsc[j+1]=temp;
//					}
//				}
//		}
//		System.out.println();
//		for(int k:dsc) {
//		System.out.print(k+" ");
//		}
//		----------------5th---------------------
//	matrix addition
		int arr[][]= {{0,1,1},{1,1,2},{2,4,5}};
		int arr2[][]= {{1,1,2},{3,4,4},{5,4,4}};
		int res[][]=new int[arr.length][arr2.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr2.length;j++) {
				res[i][j]=arr[i][j]+arr2[i][j];
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
		scan.close();
	}
}

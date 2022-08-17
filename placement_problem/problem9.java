//import java.util.Arrays;
import java.util.Scanner;

public class problem9 {

	public static void main(String[] args) {
		
//	---------1.program to check if two arrays are equal or not---------
//		int arr[] = {7,7,1};
//		int arr1[]= {1,7,7};
//		int res=0;
//		if(arr.length==arr1.length)
//		for (int i=0;i<arr.length;i++) {
//			if(arr[i]==arr1[i]) {
//					res+=1;
//				}
//		}
//		if(res==arr1.length) {
//			System.out.println(Arrays.toString(arr) +" is Equal to "+Arrays.toString(arr1)); 
//			System.out.println("YES");
//		}
//		else {
//			System.out.println(Arrays.toString(arr) +" is Not Equal to "+Arrays.toString(arr1));
//			System.out.println("NO");
//		}
	
//	----------2.print prime number from given limit---------------------
	Scanner sc = new Scanner(System.in);
	int num1=sc.nextInt();
	int num2=sc.nextInt();
	sc.close();
	boolean b=false;

	if(num2==0 || num2==1 || num2==2 || num2==3) {
		for(int num=num1;num<=num2;num++) {
		System.out.print(num+" ");
	}
	}
	else {
		if (num2>=4) {
		for(int p=num1;p<=num2;p++) {
			for(int prime=2;prime<=Math.abs(num2/2);prime++) {
				if(p!=prime) {
			if(p%prime!=0) {
				b=true;
			}
			else {
				b=false;
				break;
			}
		}
	}
			if(b) {
				System.out.print(p+" ");
			}
			
		}
		}
	}
	
	}
}














package first;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {
//	int a=1,b=2,c=3;
	
	public static int[] arrays(int a1[]) {
//		Scanner s = new Scanner(System.in);
		System.out.println(Arrays.toString(a1));
//		s.close();
		for(int i=0;i<a1.length;i++) {
			System.out.println(i+" -> "+ (a1[i] *= 2)); 
		}
		return a1;
	}
	public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int arr[]= {4,5,6,3,2};
			int a[]=arrays(arr);
			for (int i = 0; i < a.length; i++) {//for loop to print the array  
				System.out.print( a[i]+ " ");     
				} 	
				System.out.println("sorted array is ");
//			arrays ar = new arrays(); // call method using object
//			//System.out.println(ar.c);
//			int b[]=ar.arrays(arr);
//			for (int i = 0; i < b.length; i++) {//for loop to print the array  
//				System.out.print( b[i]+1+ " ");     
//				} 
			
//			int arr1[]= new int[5];
//			for(int i=0;i<arr1.length;i++) {
//				int a = s.nextInt();
//				arr1[i]=a;
//			}
//			System.out.println(Arrays.toString(arr1));
			// insert ele
//			System.out.println("position to insert array..");
//			int pos = s.nextInt();
			//System.out.println("Value : ");
			//int val = s.nextInt();
			
//			for(int i=arr1.length-1;i>pos-1;i--) {
//				arr1[i]=arr1[i-1];
//				System.out.println(arr1[i]);
//			}
//			arr1[pos-1]=val;
			
			// delete ele 
//			System.out.println("position to delete array..");
//			int pos = s.nextInt();
//			int size = arr1.length;
//			for(int i=pos-1;i<size-1;i++) {
//				arr1[i]=arr1[i+1];
//				//System.out.println(arr1[i]);
//			}
//			size--;
//				
//			for(int i=0;i<size;i++) {
//				System.out.print(arr1[i]+" ");
//			}
			
			
			}
	}















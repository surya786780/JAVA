import java.util.*;
public class problem10 {

	public static int output1;
	public static int output2;
	public static void main(String[] args) 
		{
			int arr[]= new int[] {8,-10,3,-15};
			findOriginalFirstAndSum(arr);
		}
	public static void findOriginalFirstAndSum(int input1[]) {
		System.out.println("Original array = "+Arrays.toString(input1));
			
//			sum of original array
			int Add=0;
			for(int sum=0;sum<input1.length;sum++) {
				Add+=input1[sum];
		}
			
//			Encoded array
			int arr2[]=new int[input1.length] ;
			for(int sub=0;sub<input1.length;sub++) {
				if(input1.length-1==sub) {
					arr2[input1.length-1]=input1[input1.length-1];
				}
				else
				{
				int Sub=input1[sub+1]-input1[sub];
				arr2[sub]=Sub;
				}
			}
//		outputs
			System.out.println("Encoded array = "+Arrays.toString(arr2));
			output1=input1[0];
			System.out.println("First number in the original array = "+output1);
			output2=Add;
			System.out.println("Sum of all numbers in original array = "+output2);
		}
}

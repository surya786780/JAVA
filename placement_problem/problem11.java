import java.util.*;

public class problem11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
//	Check the frequency of the number
//		int input = sc.nextInt();
//		String s= Integer.toString(input);
//		char c = s.charAt(0);
//		char a = s.charAt(s.length()-1);
//		int first = Character.getNumericValue(c);
//		int sec = Character.getNumericValue(a);
//		String str="";
//		for(int i=first;i<=sec;++i) {
//			str += Integer.toString(i);
//		}
////		System.out.println(str);
//		if(str.contentEquals(s)) {
//			System.out.println("YES");
//		}
//		else {
//			System.out.println("NO");
//		}
//	print even before odd	
		System.out.print("Enter Length of the array ");
		int len = sc.nextInt();
		int arr[]=new int [len];
		for (int i=0;i<len;i++) {
			int input=sc.nextInt();
			arr[i]=input;
		} 
		List <Integer> arr1 = new ArrayList<>();
		List <Integer> arr2 = new ArrayList<>();
		for(int j=0;j<len;j++) {
			if(arr[j]%2==0) {
				arr1.add(arr[j]);
				}
			else {
				arr2.add(arr[j]);
			}
		}
		List <Integer> arr3 = new ArrayList<>();
		arr3.addAll(arr1);		//add all element from list arr1 to arr3
		arr3.addAll(arr2);
		System.out.println(arr3);
		sc.close();
	}

}
















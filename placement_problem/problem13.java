import java.util.*;

public class problem13 {
	public static int findKeyUsingLeastFrequentlyOccurringDigits(int input1,int input2,int input3,int input4){
		int result=0;
		String str = Integer.toString(input1);
		String str1 = Integer.toString(input2);
		String str2 = Integer.toString(input3);
		String str3 = Integer.toString(input4);
		List<String> list = new ArrayList<>();
		list.add(str);
		list.add(str1);
		list.add(str2);
		list.add(str3);
		
		int n1=0;int n2=0;int n3=0;int n4=0;int n5=0;int n6=0;int n7=0;int n8=0;int n9=0;int n0=0;
		for(int i=0;i<list.size();i++) {
			String s = list.get(i);
			for(int j=0;j<s.length();j++) {
				char c = s.charAt(j);
				switch(c) {
				case '1':
					n1+=1;
					break;
				case '2':
					n2+=1;
					break;
				case '3':
					n3+=1;
					break;
				case '4':
					n4+=1;
					break;
				case '5':
					n5+=1;
					break;
				case '6':
					n6+=1;
					break;
				case '7':
					n7+=1;
					break;
				case '8':
					n8+=1;
					break;
				case '9':
					n9+=1;
					break;
				case '0':
					n0+=1;
					break;
				}
			}
		}
		List <Integer> list1 = new ArrayList<>();
		list1.add(n0);
		list1.add(n1);
		list1.add(n2);
		list1.add(n3);
		list1.add(n4);
		list1.add(n5);
		list1.add(n6);
		list1.add(n7);
		list1.add(n8);
		list1.add(n9);
			
//		System.out.println(list1);
		
		List <Integer> list2 = new ArrayList<>();
		for(int k=0;k<list1.size();k++) {
			if(list1.get(k)==1) {
				list2.add(k);
			}
		}
		
		if(list2.size()>1) {
			for(int l=0;l<list2.size();l++) {
			result+=list2.get(l);
			}
		}
		else {
			result=list2.get(0);
		}
//		System.out.println(list2);
		
		return result;
		
	}
	public static void main(String[] args) {
		
		int input = findKeyUsingLeastFrequentlyOccurringDigits(1236,262,666,121);
		int input1 = findKeyUsingLeastFrequentlyOccurringDigits(1237,202,666,140);
		System.out.println("Sum of all Least Frequency Occuring Digits = "+input);
		System.out.println("Sum of all Least Frequency Occuring Digits = "+input1);
	}
}







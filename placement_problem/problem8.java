import java.util.*;
public class problem8 {
	public static void MostFrequentDigit(int input1,int input2,int input3,int input4) {
		
		String str1 = Integer.toString(input1);
		String str2 = Integer.toString(input2);
		String str3 = Integer.toString(input3);
		String str4 = Integer.toString(input4);
		List <String> list=new ArrayList<>();
		list.add(str1);
		list.add(str2);
		list.add(str3);
		list.add(str4);
		int a1=0; int b=0;int c=0;int d=0;int e=0;int f=0;int g=0;int h=0;int i1=0;int j1=0;
		for(int i=0;i<list.size();i++) {
			
//		System.out.println(list.get(i));
		String a = list.get(i);
		for(int j=0;j<a.length();j++) {
//			System.out.print(a.charAt(j)+" ");
			if(a.charAt(j)=='0') {
				a1+=1;
			}
			else if(a.charAt(j)=='1') {
				b+=1;
			}
			else if(a.charAt(j)=='2') {
				c+=1;
			}
			else if(a.charAt(j)=='3') {
				d+=1;
			}
			else if(a.charAt(j)=='4') {
				e+=1;
			}
			else if(a.charAt(j)=='5') {
				f+=1;
			}
			else if(a.charAt(j)=='6') {
				g+=1;
			}
			else if(a.charAt(j)=='7') {
				h+=1;
			}
			else if(a.charAt(j)=='8') {
				i1+=1;
			}
			else {
				j1+=1;
			}
			}
		}
		List <Integer> list1=new ArrayList<>();
		list1.add(a1);
		list1.add(b);
		list1.add(c);
		list1.add(d);
		list1.add(e);
		list1.add(f);
		list1.add(g);
		list1.add(h);
		list1.add(i1);
		list1.add(j1);
//		System.out.println("\n"+"---------------------");
//		for(int z=0;z<list1.size();z++) {
//			System.out.println(z+" -> "+list1.get(z)+" ");
//		}
//		System.out.println("\n"+"-------------------");
		List <Integer> list2=new ArrayList<>();
		int w = Collections.max(list1);
//		System.out.println(list1.indexOf(w));
		for(int y=0;y<list1.size();y++) {
			if(list1.get(y)==w) {
				list2.add(y);
			}	
		}
//		for(int z:list2) {
//			System.out.print(z+" ");
//		}
//		System.out.println("\n"+"-------------------");
		System.out.println("RESULT -> "+Collections.max(list2));
		System.out.println("-------------------");
	}
	public static void main(String[] args) {
		MostFrequentDigit(123,234,345,673);
		MostFrequentDigit(123,456,345,5043);
		MostFrequentDigit(1203,7624,2046,1052);
		MostFrequentDigit(1203,7624,2046,1002);
		
	}
}






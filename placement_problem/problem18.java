import java.util.*;
public class problem18 {
	
	public static void main(String[] args) {


//		String input1="Fi_er";
//		String input2="Fever:filer:Filter:Fixer:Fiber:fibre:offer:tailor";
//		String[] s = input2.split(":");
//		List<String> l2 = new ArrayList<String>();
//		for(String i:s) {
//		l2.add(i.toUpperCase());
//		}
//		String s1 = input1.toUpperCase();
//		System.out.println("s1"+s1);
//		System.out.println("l2"+l2);
//		
//		int num=0;
//		for(int i=0;i<s1.length();i++) {
//			if(s1.charAt(i)=='_') {
//				num=i;
//			}
//		}
//		String s2="";
//		List<String> l3 = new ArrayList<String>();
//		for(int i=0;i<l2.size();i++) {
//		if(input1.length()==l2.get(i).length()) {
//		l3.add(l2.get(i));
//		}
//		}
//		System.out.println("l3"+l3);
//		
//		String s3=s1.replace('_', ' ');
//		System.out.println(s3+" s3");
//		List<String> l5 = new ArrayList<>();
//		for(int i=0;i<l3.size();i++) {
//			l5.add(s3);
//		}
//		System.out.println(l5);
//		List<String> l4 = new ArrayList<>();
//		String s4="";
//		for(int i=0;i<l3.size();i++) {
//			for(int j=0;j<l3.get(i).length();j++) {
//				if(j==num) {
//					s4+=" ";
//				}
//				else {
//			s4+=l3.get(i).charAt(j); 
//			}}l4.add(s4);
//				s4="";
//		}
//		System.out.println("l4"+l4);
//		boolean b = true;
//		for(int i=0;i<l4.size();i++) {
//			if(l5.get(i)==l4.get(i)) {
//				b=true;
//		}
//			else {
//				b=false;
//			}
//			if(b==true) {
//				System.out.println("1");
//			}
//		
//	}
//		int num=2;
//		for(int j=0;j<6;j++) {
//		for(int i=0;i<5;i++) {
//			if(i!=num) {
//				System.out.print(i+" ");
//			}
//		}
//		System.out.println();}
		
		

		// System.out.println(input1);
		// System.out.println(input2);
		String input1="Fi_er";
		String input2="Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer";
		String input3 = input1.toUpperCase();
		String[] s1 = input2.split(":");
		List<String> l1 = new ArrayList<>();
		for(String i:s1){
			l1.add(i);
		}
		List<String> l2 = new ArrayList<>();
		for(int i=0;i<l1.size();i++){
		if(input1.length()==l1.get(i).length()){
			l2.add(l1.get(i).toUpperCase());
		}
		}
		// System.out.println(l2);
		
		// System.out.println(input3);
		int num=0;
		for(int i=0;i<input3.length();i++){
			if(input3.charAt(i)=='_'){
				num=i;
				break;
			}
		}
		// System.out.println(num);
		// String s3=input3.replace('_', ' ');
		int num1=0;
		List<Integer> ll = new ArrayList<>();
		for(int i=0;i<l2.size();i++){
			for(int j=0;j<l2.get(i).length();j++){
				if(j!=num){
					// System.out.print(j+" ");
				if(input3.charAt(j)==l2.get(i).charAt(j)){
						num1+=1;
						// System.out.println(num1);
				}
			}}	
				ll.add(num1);
				num1=0;
			
		}
//		System.out.println(ll);
		int num2=0;
		for(int i=0;i<l2.size();i++){
				if(ll.get(i)==input1.length()-1){
					System.out.print(l2.get(i)+":");
					num2+=1;
				}
	}
		if(num2==0){
			System.out.print("ERROR-009");
		}
		
	

		
		
	}}


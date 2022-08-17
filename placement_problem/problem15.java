import java.util.*;
public class problem15 {
	public static int output2;

	public static void decodeString(int input1){

		String str = Integer.toString(input1);

		HashMap<Integer,Character> alpha = new HashMap<>();

		char c = 96;
		for(int j=1;j<=26;j++) {
			c+=j;
			alpha.put(j, c);
			c=96;
		}
//		System.out.println(alpha);
		//		
		////		iteration 1
				
				for(int i=0;i<str.length();i++) {
					char ch = str.charAt(i);
					int num = Character.getNumericValue(ch);
					if(alpha.containsKey(num)) {
						char chr = alpha.get(num);
						System.out.print(chr);
					}
				}
				System.out.println();

		//		iteration 2

				for(int j=0;j<str.length()-1;j++) {
					char c1 = str.charAt(j);
					char c2 = str.charAt(j+1);
					String st="";
					st+=c1;
					st+=c2;
		//			System.out.println(st);
					int num = Integer.parseInt(st);
					if(alpha.containsKey(num)) {
						char s1 = alpha.get(num);
						System.out.print(s1+"");
					}
					else {
						int num1 = Character.getNumericValue(c1)+Character.getNumericValue(c2);
							if(alpha.containsKey(num1)) {
							char s2 = alpha.get(num1);
							System.out.print(s2+"");
						}
					}
				}

				System.out.println();
		//		iteration 3


		for(int k=0;k<str.length()-1;k++) {
			if(k!=0 && k%2!=0) {
				for(int l=0;l<str.length();l++) {
					if(k==l) {
						char c1 = str.charAt(l);
						char c2 = str.charAt(l+1);
						String st="";
						st+=c1;
						st+=c2;
						int num = Integer.parseInt(st);
						if(alpha.containsKey(num)) {
							char s1 = alpha.get(num);
							System.out.print(Character.toUpperCase(s1));
						}
						else {
							int num1 = Character.getNumericValue(c1)+Character.getNumericValue(c2);
							if(alpha.containsKey(num1)) {
								char s2 = alpha.get(num1);
								System.out.print(Character.toUpperCase(s2));
							}
						}
						l+=1;
					}
					else{
						char ch = str.charAt(l);
						int num = Character.getNumericValue(ch);
						if(alpha.containsKey(num)) {
							char chr = alpha.get(num);
							System.out.print(Character.toUpperCase(chr));
						}
					}
				}}
			
			else {
				for(int l=0;l<str.length();l++) {
					if(k==l) {
						char c1 = str.charAt(l);
						char c2 = str.charAt(l+1);
						String st="";
						st+=c1;
						st+=c2;
						int num = Integer.parseInt(st);
						if(alpha.containsKey(num)) {
							char s1 = alpha.get(num);
							System.out.print(s1);
						}
						else {
							int num1 = Character.getNumericValue(c1)+Character.getNumericValue(c2);
							if(alpha.containsKey(num1)) {
								char s2 = alpha.get(num1);
								System.out.print(s2);
							}
						}
						l+=1;
					}
					else{
						char ch = str.charAt(l);
						int num = Character.getNumericValue(ch);
						if(alpha.containsKey(num)) {
							char chr = alpha.get(num);
							System.out.print(chr);
						}
					}
				}
			}
		}
		System.out.println();
	}

			public static void main(String[] args) {

				decodeString(9145298);
				decodeString(123);

			}
		}

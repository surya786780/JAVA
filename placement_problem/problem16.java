import java.util.*;
public class problem16 {	
	public static String output1; 
	public static void reverseWordsAndCase(String sentence, int caseOption) {  
		switch(caseOption) {
			case 0:
				List<String> list = new ArrayList<>();
				String[] str = sentence.split(" ");
				for(int i=0;i<str.length;i++) {
				list.add(str[i]);
				}
//				System.out.println(list);
				String str1="";
				List<String> list1 = new ArrayList<>();
				for(int j=0;j<list.size();j++) {
					for(int k=list.get(j).length();k>0;k--) {
						str1+=list.get(j).charAt(k-1);
						}
					list1.add(str1);
					str1="";
				}
				for(int i=0;i<list1.size();i++) {
				System.out.print(list1.get(i)+" ");
				}
				System.out.println();
				break;
				
			case 1:
				List<String> list2 = new ArrayList<>();
				String[] strr = sentence.split(" ");
				for(int i=0;i<strr.length;i++) {
				list2.add(strr[i]);
				}
//				System.out.println(list2);
				String s1="";
				for(int i=0;i<list2.size();i++) {
					s1+=list2.get(i);
				}
//				System.out.println(sentence);
				
				String str2="";
				List<String> list3 = new ArrayList<>();
				for(int j=0;j<list2.size();j++) {
					for(int k=list2.get(j).length();k>0;k--) {
						str2+=list2.get(j).charAt(k-1);
						}
					list3.add(str2);
					str2="";
				}
				String str3="";
				for(String i:list3) {
				str3+=i+" ";
				}
				
				String str4="";
				for(int i=0;i<sentence.length();i++) {
					if(Character.isUpperCase(sentence.charAt(i))) {
						str4+=Character.toUpperCase(str3.charAt(i));
					}
					else {
						str4+=Character.toLowerCase(str3.charAt(i));
					}
				}
				System.out.println(str4);
				break;
				
				case 2:
					List<String> list4 = new ArrayList<>();
					String[] strr1 = sentence.split(" ");
					for(int i=0;i<strr1.length;i++) {
					list4.add(strr1[i]);
					}
//					System.out.println(list4);
					String s5="";
					for(int i=0;i<list4.size();i++) {
						s5+=list4.get(i);
					}
//					System.out.println(sentence);
					
					String str5="";
					List<String> list5 = new ArrayList<>();
					for(int j=0;j<list4.size();j++) {
						for(int k=list4.get(j).length();k>0;k--) {
							str5+=list4.get(j).charAt(k-1);
							}
						list5.add(str5);
						str5="";
					}
					String str6="";
					for(String i:list5) {
					str6+=i+" ";
					}
					
					String str7="";
					for(int i=0;i<str6.length();i++) {
						if(Character.isUpperCase(str6.charAt(i))) {
							str7+=Character.toLowerCase(str6.charAt(i));
						}
						else {
							str7+=Character.toUpperCase(str6.charAt(i));
						}
					}
					System.out.println(str7);
					break;
				}
		} 

		public static void main(String[] args) {
			reverseWordsAndCase("Wipro Technologies BangaLore", 0);
			reverseWordsAndCase("Wipro Technologies, BangaLore", 0);
			reverseWordsAndCase("Wipro TechNologies BangaLore", 1);
			reverseWordsAndCase("Wipro Technologies, BangaLore", 1);
			reverseWordsAndCase("Wipro Technologies, BangaLore", 2);
			reverseWordsAndCase("The day is Good and Dry.", 2);
			reverseWordsAndCase("Prudential World CUP was held in 1983",2);
			reverseWordsAndCase("17%89 was the Code!!",2);
		}

}

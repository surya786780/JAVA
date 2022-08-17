import java.util.*;
public class problem14 {
	public static String output1;
	public static void main(String[] args) {

		List <String> Main = new ArrayList<>();
		Main.add("v2aLi5D@p9asp^");
		Main.add("IsThisValidPassword1234$*");
		Main.add("IsThisValidPassword1234$*1");
		Main.add("Password");
		Main.add("IsThisValidPasssord1234$*@");
		
		for(int run=0;run<Main.size();run++) {
			System.out.println(Main.get(run));
			boolean output = userMethod(Main.get(run));
			if(output) {
				System.out.println("Valid");
				System.out.println("----------------------------");
				}else {
					System.out.println("Invalid");
					System.out.println("----------------------------");
				}
		}
	}
	
	public static boolean userMethod(String input1) {
		
//		System.out.println(input1);
		
		List<Character> alpha = new ArrayList<>();
		for(char c='a';c<='z';c++) {
			alpha.add(c);
		}
		for(char C='A';C<='Z';C++) {
			alpha.add(C);
		}
//		System.out.println(alpha);
		
		List<Character> number = new ArrayList<>();
		for(char i='0';i<='9';i++) {
			number.add(i);
		}
//		System.out.println(number);
		
		List<Character> spl_char = new ArrayList<>();
		spl_char.add('!');
		spl_char.add('@');
		spl_char.add('#');
		spl_char.add('$');
		spl_char.add('%');
		spl_char.add('^');
		spl_char.add('&');
		spl_char.add('*');
		spl_char.add('(');
		spl_char.add(')');
//		System.out.println(spl_char);
		
//		-------------------Start alphabet check-----------------------
		int first=0;
		int last=0;
		for(int i=0;i<alpha.size();i++) {
			if(input1.charAt(0)==alpha.get(i)) {
			}
			else {
				first+=1;
			}
		}
//		----------------End special character check--------------------		
		for(int i=0;i<spl_char.size();i++) {
			if(input1.charAt(input1.length()-1)==spl_char.get(i)) {
			}
			else {
				last+=1;
			}
		}
//		-------------------All alphabets check-----------------------	
		int small_alpha_check=0;
		for(int i=0;i<input1.length();i++) {
			for(int j=0;j<alpha.size()/2;j++) {
				if(input1.charAt(i)==alpha.get(j)) {
					small_alpha_check+=1;
				}
			}
		}
		
		int big_alpha_check=0;
		for(int i=0;i<input1.length();i++) {
			for(int j=27;j<alpha.size();j++) {
				if(input1.charAt(i)==alpha.get(j)) {
					big_alpha_check+=1;
				}
			}
		}
		
		int alpha_check=small_alpha_check+big_alpha_check;
//		-------------------number check-----------------------
		int num_check=0;
		for(int i=0;i<input1.length();i++) {
			for(int j=0;j<number.size();j++) {
				if(input1.charAt(i)==number.get(j)) {
					num_check+=1;
				}
			}
		}
//		-------------------Consecutive character check-----------------------
		int cons_check = 0;
		for(int i=0;i<input1.length()-1;i++){
			for(int j=i;j<input1.length()-1;j++) {
				if(input1.charAt(i)==input1.charAt(j) && input1.charAt(i)==input1.charAt(j+1) && input1.charAt(i)==input1.charAt(j+2)) {
					cons_check+=1;
//					System.out.println(input1.charAt(i));
				}
			}
		}
//		System.out.println(cons_check);
//		------------------- Overall check---------------------
	
		if(input1.length()>=8 && input1.length()<=28 && first!=52 && last!=10 && alpha_check>=3 && big_alpha_check>=1 && small_alpha_check>=2 && num_check>=2 && cons_check==0) 
		{
			return true;
			}
		else {
			return false;
		}
	}
}










import java.util.*;
public class problem19 {

	public static void main(String[] args) {
		
		String input1 = "is today preassessment process";
		System.out.println(input1);
		String[] s = input1.split(" ");
		List <String> l1 = new ArrayList<>();
		for(String s1:s) {
			l1.add(s1);
				}
//				System.out.println(l1);
				String input2="";
				String input3="";
				
				if(l1.size()%2==0) {
					for(int i=0;i<l1.size()-1;i++) {
						if(l1.get(i).length()==l1.get(i+1).length()) {
							input2+=l1.get(i+1)+" "+l1.get(i)+" ";
							i+=1;
					}
						else {
							int n1=l1.get(i).length();
							int n2 = l1.get(i+1).length();
							if(n1>n2) {
								input2+=l1.get(i+1)+" ";
								for(int j=l1.get(i).length()-1;j>=n2;j--) {
									input2+=l1.get(i).charAt(j);
								}
								for(int k=0;k<n2;k++) {
									input2+=l1.get(i).charAt(k);
								}
								input2+=" ";
								i+=1;
							}
							else {
//								input2+=" ";
								for(int j=l1.get(i+1).length()-1;j>=n1;j--) {
									input2+=l1.get(i+1).charAt(j);
								}
								for(int k=0;k<n1;k++) {
									input2+=l1.get(i+1).charAt(k);
								}
								
								input2+=" "+l1.get(i)+" ";
								i+=1;
							}
						
						}
					}
				}
				else {
					for(int i=0;i<l1.size()-2;i++) {
						if(l1.get(i).length()==l1.get(i+1).length()) {
							input2+=l1.get(i+1)+" "+l1.get(i)+" ";
							i+=1;
					}
					else {
						int n1=l1.get(i).length();
						int n2 = l1.get(i+1).length();
						if(n1>n2) {
							input2+=l1.get(i+1)+" ";
							for(int j=l1.get(i).length()-1;j>=n2;j--) {
								input2+=l1.get(i).charAt(j);
							}
							for(int k=0;k<n2;k++) {
								input2+=l1.get(i).charAt(k);
							}
						}
						else {
							
							for(int j=l1.get(i+1).length()-1;j>=n1;j--) {
								input2+=l1.get(i+1).charAt(j);
							}
							for(int k=0;k<n1;k++) {
								input2+=l1.get(i+1).charAt(k);
							}
							input2+=" "+l1.get(i);
							
						}
					}
					}
					int num2=l1.get(l1.size()-1).length();
						for(int f=num2;f>0;f--) {
							input3+=l1.get(l1.size()-1).charAt(f-1);
						}
						input2+=" "+input3;
					}
				StringBuffer input4 = new StringBuffer(input2);
				
				String output="";
				for(int i=0;i<input4.length();i++) {
					if(i==input4.length()-1 && input4.charAt(i)==' ') {
						input4.deleteCharAt(input2.length()-1);
					}
				else if(i==0) {
						output+=Character.toUpperCase(input4.charAt(i));
					}
					else if(input2.charAt(i)==' '){
						output+=" "+Character.toUpperCase(input4.charAt(i+1));
						i+=1;
					}
					else {
						output+=Character.toLowerCase(input4.charAt(i));
					}
				}
				
				System.out.println(output);
				output="";
				
			}

		}

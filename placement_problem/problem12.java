
public class problem12 {
	public static String userMethod(String input1,long input2,String input3) {
		String output1="";
		int first_sum = 0;
		int second_sum=0;
		int third_sum=0;
		int fourth_sum=0;
		int fifth_sum=0;
		int six_sum=0;
		String acc= String.valueOf(input2);
		if(input1.length()>2) {
			if(acc.length()==11){
				if(input3=="Savings" || input3=="Current"|| input3=="Loan") {
					
					output1 += input3.charAt(0);
					output1 += input3.charAt(1);
					output1 += acc.charAt(0);
					
					for(int i=0;i<5;i++) {
						char num = acc.charAt(i);
						int sum = Character.getNumericValue(num);
						first_sum+=sum;
					}
					
					String check = Integer.toString(first_sum);
					if(check.length()>1) {
						for(int j=0;j<check.length();j++) {
							char sec_sum = check.charAt(j);
							int sum1 = Character.getNumericValue(sec_sum);
							second_sum += sum1;
						}
						String str = Integer.toString(second_sum);
						if(str.length()>0) {
							for(int n=0;n<str.length();n++) {
								char str2 = str.charAt(n);
								int sum3 = Character.getNumericValue(str2);
								six_sum += sum3;
							}
						}
					}
					output1 += six_sum;
					output1 += input1.charAt(0);
					
					for(int k=5;k<10;k++) {
						char acc2 = acc.charAt(k);
						int num2 = Character.getNumericValue(acc2);
						third_sum += num2;
					}
					
					String check2 = Integer.toString(third_sum);
					if(check2.length()>1) {
						for(int l=0;l<check2.length();l++) {
							char third = check2.charAt(l);
							int sum2 = Character.getNumericValue(third);
							fourth_sum += sum2;
						}
						String str1 = Integer.toString(fourth_sum);
						if(str1.length()>0) {
							for(int m=0;m<str1.length();m++) {
								char str3 = str1.charAt(m);
								int sum4 = Character.getNumericValue(str3);
								fifth_sum+=sum4;
							}
						}
					}
					
					output1 += fifth_sum;
					output1 += input1.charAt(input1.length()-1);
					output1 += acc.charAt(acc.length()-1);
				}
				else {
					System.out.println("----Enter valid type of Account----");
				}
			}
			else {
				System.out.println("----Enter valid Account Number----");
			}
		}else {
				System.out.println("----Enter valid Name----");
			}
		if(output1.length()==8) {
		}else {
			System.out.println("OTP not generated...");
		}
		return output1;
		}

	public static void main(String args[]) {
		
		String output = userMethod("Kavi",12345678925L,"Savings");
		String output1 = userMethod("GoodnamE", 61741978349l, "Current");
		
		System.out.println(output);
		System.out.println(output1);
		
	}
}








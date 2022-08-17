import java.util.*;
public class problem17 {
	public static ArrayList<String> output1;
		public static int output2;

		public static void main(String[] args) {
		ArrayList<String> input1 = new ArrayList<String>();
		input1.add("400");
		input1.add("3000");
		input1.add("J12a3N4");
		monthandyear(input1);
//		ArrayList<String> input1 = new ArrayList<String>();
//		input1.add("1000");
//		input1.add("3000");
//		input1.add("L12u34j");
//		monthandyear(input1);

		}
		public static ArrayList<String> monthandyear( ArrayList<String> input1 ){
//		System.out.println(input1);

		List<String> list = new ArrayList<>();
		list.add("JAN");
		list.add("FEB");
		list.add("MAR");
		list.add("APR");
		list.add("MAY");
		list.add("JUN");
		list.add("JUL");
		list.add("AUG");
		list.add("SEP");
		list.add("OCT");
		list.add("NOV");
		list.add("DEC");
		
		String str1 = input1.get(2);
		String str3=str1.replaceAll("[^\\d]","");
		String str2=str1.replaceAll("[\\d]","");
		String str4 = str2.toUpperCase();
		
		String q = "";
		for(int i=0;i<list.size();i++) {
		if(list.get(i).charAt(0)==str4.charAt(0) || list.get(i).charAt(0)==str4.charAt(1) ||list.get(i).charAt(0)==str4.charAt(2)) {
			if(list.get(i).charAt(1)==str4.charAt(0) || list.get(i).charAt(1)==str4.charAt(1) ||list.get(i).charAt(1)==str4.charAt(2) ) {
				if(list.get(i).charAt(2)==str4.charAt(0) || list.get(i).charAt(2)==str4.charAt(1) ||list.get(i).charAt(2)==str4.charAt(2) ) {
			q+=list.get(i);
		}}}
		}

		int count=0;
		int a = Integer.parseInt(input1.get(0));
		int b = Integer.parseInt(input1.get(1));
		
		if(input1.get(0).length()==4 && input1.get(1).length()==4) {
		for(int i=a;i<=b;i++) {
			String st1 = Integer.toString(i);
			if(str3.charAt(0)==st1.charAt(0)||str3.charAt(0)==st1.charAt(1)||str3.charAt(0)==st1.charAt(2)
					||str3.charAt(0)==st1.charAt(3)) {
				if(str3.charAt(1)==st1.charAt(0)||str3.charAt(1)==st1.charAt(1)||str3.charAt(1)==st1.charAt(2)
						||str3.charAt(1)==st1.charAt(3)) {
					if(str3.charAt(2)==st1.charAt(0)||str3.charAt(2)==st1.charAt(1)||str3.charAt(2)==st1.charAt(2)
							||str3.charAt(2)==st1.charAt(3)) {
						if(str3.charAt(3)==st1.charAt(0)||str3.charAt(3)==st1.charAt(1)||str3.charAt(3)==st1.charAt(2)
								||str3.charAt(3)==st1.charAt(3)) {
						System.out.println(q+"/"+i);
						count+=1;
					}
					}
			}}
		}
		
				
			}
			else {
				System.out.println("Invalid");
			}
			
		System.out.println(count);
		return output1;
	}
}

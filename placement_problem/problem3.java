//import java.util.*;s
public class problem3 {

	public static void main(String[] args) {
		
//		---------------------1st----------------------
//	covert year to month
//		int year=345;
//		int month=year/30;
//		int week=year/7;
//		System.out.println(month+" months "+week+" Weeks");

//		---------------------2nd----------------------
//	multiplication table	
//		Scanner scan = new Scanner(System.in);
//		int multiply=scan.nextInt();
//		for(int row=1;row<=10;row++) {
//			System.out.println(row+"*"+multiply+"="+row*multiply);
//		}
////		---------------------3rd----------------------
////	print the series and skip the number
//		for (int num=1;num<=50;num++) {
//			String val = Integer.toString(num);
//			if (val.endsWith("3") || val.endsWith("5")) {
//				continue;
//			}
//			else {
//				System.out.print(val+" ");
//			}
//		}
//		---------------------4th----------------------
//	pattern-1
		for (int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(col);
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
//	---------------------5th----------------------	
//	pattern-2
		for (int row=1;row<=5;row++) {
			for(int col=1;col<=row;col++) {
				System.out.print(row);
			}
			System.out.println();
		}
	}
}













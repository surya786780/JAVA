import java.util.*;

public class PlacementSeries {

	public static void main(String[] args) {
		
//		-------------------1st------------------------
		//System.out.println("Enter mark:- ");
		Scanner scan = new Scanner(System.in);
//		int mark=scan.nextInt();
//		if(mark>80) {
//			System.out.println("A");
//		}
//		else if(mark>60 && mark<=80) {
//			System.out.println("B");
//		}
//		else if(mark>50 && mark<=60) {
//			System.out.println("C");
//		}
//		else if(mark>45 && mark<=50) {
//			System.out.println("D");
//		}
//		else if(mark>25 && mark<=45) {
//			System.out.println("E");
//		}
//		else {
//			System.out.println("F");
//		}
//		scan.close();
		
//		----------------2nd-------------------------
		
//		System.out.println("Enter 3 age details");
//		int age1 = scan.nextInt();
//		int age2 = scan.nextInt();
//		int age3 = scan.nextInt();
//		
//		ArrayList<Integer> ages = new ArrayList<>();
//		ages.add(age1);
//		ages.add(age2);
//		ages.add(age3);
//		ages.sort(null);
//		System.out.println(ages.get(0)+" Small");
//		System.out.println(ages.get(1)+" Young");
//		System.out.println(ages.get(2)+" Old");
		
//	---------------------3rd---------------------------
		
//		int value = scan.nextInt();
//		System.out.println(Math.abs(value));
	
//	---------------------4th----------------------------
		
//		System.out.println("1st number:- ");
//		int firstnum = scan.nextInt();
//		System.out.println("2nd number:- ");
//		int secnum = scan.nextInt();
//		System.out.println("3rd number:- ");
//		int thirdnum = scan.nextInt();
//		
//		if(firstnum>secnum && firstnum>thirdnum) {
//			System.out.println("The greatest: "+firstnum);
//		}
//		else if(secnum > thirdnum) {
//			System.out.println("The greatest: "+secnum);
//		}
//		else {
//			System.out.println("The greatest: "+thirdnum);
//		}
	
//		---------------------5th----------------------------
		Scanner scan1=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = scan.nextInt();
		System.out.println("Enter Sex (M or F): ");
		char sex = scan1.next().charAt(0);
		System.out.println("Enter Marital status (Y or N): ");
		char maritalstatus = scan1.next().charAt(0);
		
		if(sex=='F' || sex=='f') {
			System.out.println("Work in Urban Area");
		}
		else if((sex=='M' || sex=='m') && (age>=20 && age<=40)) {
			System.out.println("Work in anywhere");
		}
		else if((sex=='M' || sex=='m') && (age>40 && age<=60)) {
			System.out.println("Work in Urban Area");
		}
		else if(age<20 || age>61){
			System.out.println("ERROR");
		}
		scan1.close();
		System.out.println("\n"+age+" "+sex+" "+maritalstatus+"\n");
	}
}










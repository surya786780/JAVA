package Hospital_management;
import java.util.*;
public class hospital {
	static String first_name="";
	static String last_name="";
	static long contact_num=0;
	static Scanner sc = new Scanner(System.in);
	static Scanner sc1 = new Scanner(System.in);
//	final static
	final static List<String> l1 = new ArrayList<>();
	final static List<String> first = new ArrayList<>();
	final static List<Long> contact = new ArrayList<>();
//	-----------------------------*******************-----------------------------
	public static void title() {
		System.out.println("--------------------------------------------------------");
		System.out.printf("\t\t****        SURYA HOSPITAL		****\n");
		System.out.println("--------------------------------------------------------");
	}
//	-----------------------------*******************-----------------------------
	public static void login_screen() {
		title();
		System.out.println("UserName: SURYA HOSPITAL");
		System.out.println("Password: ");
		Scanner sc = new Scanner(System.in);
		int check=0;
		do {
			String pass = sc.nextLine();
			if(pass.equals("sh123")) {
				home();
				break;
			}else {
				System.out.println("Invalid Password try again :(");
				check+=1;
			}
		}while(check<=2);
		if(check>2) {
			System.out.println("Try again Later... :(");
			Exit();
		}
	}
//	-----------------------------*******************-----------------------------
	public static void home() {
		title();
		System.out.println("1. Patient Registration "); // going to patient_reg() function
		System.out.println("2. Patient Details ");
		System.out.println("3. Search Patient Informaton ");
		System.out.println("4. Edit Patient Information");
		System.out.println("5. Exit ");
//		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		switch(a){
		case 1:
			patient_reg();
			break;
		case 2:
			patient_details();
			break;
		case 3:
			Search_Patient_Informaton();
			break;
		case 4:
			 Edit_Patient_Information();
			 break;
		case 5:
			Exit();break;
		}
	}
//	-----------------------------*******************-----------------------------
	public static void patient_reg() {
		title();
		String g,age,address,email,problem,dp;
//		Scanner sc = new Scanner(System.in);
		System.out.printf("1. First Name  		   : ");
		first_name=sc.nextLine();
		first.add(first_name);
		System.out.printf("2. Last Name   		   : ");
		last_name=sc.nextLine();
		System.out.printf("3. Gender(M/F)		   : ");
		g=sc.nextLine();
		System.out.printf("4. Age 			       : ");
		age=sc.nextLine();
		System.out.printf("5. Contact number	   : ");
		contact_num=sc.nextLong();
		contact.add(contact_num);
		System.out.printf("6. Address 		       : ");
		address=sc1.nextLine();
		System.out.printf("7. E-mail  		       : ");
		email=sc1.nextLine();
		System.out.printf("8. Problem    		   : ");
		problem=sc1.nextLine();
		System.out.printf("9. Docter preference    : ");
		dp=sc1.nextLine();
		l1.add(first_name+" "+last_name+" "+g+" "+age+" "+contact_num+" "+address+" "+email+" "+problem+" "+dp);
		
		System.out.println("If you add more patient details (Y/N)   : ");
		int i=0;
		for(i=0;i<5;i++) {
			String s1 = sc.nextLine();
			if(s1.equals("Y") || s1.equals("y")) {
				patient_reg();
				break;
			}
			else if(s1.equals("N") || s1.equals("n")){
				home();
				break;
			}
			else {
				System.out.println("Invalid character try again...");
			}
		}sc.close();
		if(i>4) {
			System.out.println("Try Later.... :(");
			Exit();
		}
	}
//	-----------------------------*******************-----------------------------
	public static void patient_details() {
		title();
		System.out.println("First_name    Last_name   Gender(M/F)  Age  Contact number  Address    E-mail    Problem    Docter_preference");
		for(String detail:l1) {
			System.out.println(detail);
		}
		home();
	}
//	-----------------------------*******************-----------------------------
	public static void Search_Patient_Informaton() {
		System.out.println("Enter patients firstname or mobile num");
		String checker = sc1.nextLine();
		boolean b = Character.isAlphabetic(checker.charAt(0));
		if(b==true) {
			for(int i=0;i<l1.size();i++) {
				if(checker.toUpperCase().equals(first.get(i))) {
					System.out.println("Patient detail : ");
					System.out.println("First_name    Last_name   Gender(M/F)  Age  Contact number  Address    E-mail    Problem    Docter_preference");
					System.out.println(l1.get(i));
				}
				else {
					System.out.println("Cannot find Patient details");
				}
				}
		}else{
			int a = Integer.parseInt(checker);
			for(int i=0;i<l1.size();i++) {
				if(a==contact.get(i)) {
					System.out.println("Patient detail : ");
					System.out.println("First_name    Last_name   Gender(M/F)  Age  Contact number  Address    E-mail    Problem    Docter_preference");
					System.out.println(l1.get(i));
				}else {
					System.out.printf("Cannot find Patient details \n");
				}
				}
		}
		
		System.out.println("Search again patient details [y/n] : ");
		String s = sc1.nextLine();
		if(s.equals("Y") || s.equals("y")) {
			Search_Patient_Informaton();
		}
		else {
			home();
		}
		
	}
//	-----------------------------*******************-----------------------------
	public static void Edit_Patient_Information() {
		title();
		int num=0;
		System.out.println("Which patient details you wants to Edit or remove : ");
		String edit = sc1.nextLine();
		for(int i=0;i<first.size();i++) {
			if(edit.toUpperCase().equals(first.get(i))) {
				num+=1;
			}
			if(num>0) {
				System.out.println(l1.get(i));
				l1.remove(i);
			}
		}
		if(num==0) {
			System.out.println("Patient infomation is wrong \n");
		}
		System.out.println("Continue to the process [y/n] : ");
		String s = sc1.nextLine();
		if(s.equals("Y") || s.equals("y")) {
			Edit_Patient_Information();
		}
		else {
			home();
		}
		
		
	}
//	-----------------------------*******************-----------------------------
	public static void Exit() {
		System.exit(0);
	}
//	-----------------------------*******************-----------------------------
	public static void main(String[] args) {
		
		login_screen();
//		patient_reg();
//		patient_details();
//		Search_Patient_Informaton();
		

	}

}

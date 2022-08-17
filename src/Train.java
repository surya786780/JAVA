import java.util.*;

public class Train {

	public static void main(String[] args) {
		System.out.println("Welcome to Train Booking...");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scan.nextLine();
		System.out.println("Enter your Address: ");
		String address = scan.nextLine();
		System.out.println("Enter your Mail ID: ");
		String mail = scan.nextLine();
		System.out.println("Enter your Mobile Num: ");
		int mobnumber = scan.nextInt();
		
		
		System.out.println("Enter 1: train details ");
		System.out.println("Enter 2: Booking details ");
		System.out.println("Enter 3: See your Details and booking ");
		System.out.println("Enter 4: Help ");
		System.out.println("Enter 5: Contact near railway station ");
		System.out.println("Enter 6: Exit");
		
		int details = scan.nextInt();		
		Scanner sc = new Scanner(System.in);
		
		switch (details){
//			case 0:
//				
//				System.out.print("\033[H\033[2J");
//				System.out.flush();
				//Runtime.getRuntime.exec("cls");
			case 1:
				System.out.println("Chennai Express:  chennai to kanniyakumari "+"\n"
						+ "train no: 123, date:12.05.2021 - 13.05.2021 "+"\n"+"Time: 12.00pm start from Chennai");
				
				System.out.println("Mysore Express:  mysore to madurai, "+"\n"
						+ "train no: 123, date:13.05.2021 - 14.05.2021"+"\n"+" Time: 12.00pm start from Mysore");
				
				System.out.println("Mumbai Express:  Mumbai to covai, "+"\n"
						+ "train no: 123, date:14.05.2021 - 15.05.2021" +"\n"+" Time: 12.00pm start from Mumbai");		
				break;
				
			case 2:
				System.out.println("Where you go: ");
				String destination = sc.nextLine();
				System.out.println("How many members to travel "+destination);
				int members = scan.nextInt();
				int amount = 0;
				int sleeper = 500;
				int normal = 300;
			
				System.out.println("Enter 1: Sleeper coach per hear 500rs for "+destination+"\n"+
						"Enter 2: Normal coach per head 300rs for"+destination);
				int coatch = scan.nextInt();
				if (coatch == 1) {
					for(int i=1;i<=members;i++) {
						amount+=sleeper;
					}
					System.out.println("Sleeper for - "+destination +" - "+ members +" - members amount is -" +amount);
				}
					else {
						for(int i=1;i<=members;i++) {
							amount+=normal;
						}
						System.out.println("Normal for - "+destination +" - "+ members +" - members amount is -" +amount);
					}
				break;
				
			case 3:
				System.out.println("Check your details- ");	
				
				System.out.println(name);
				System.out.println(mobnumber);
				System.out.println(mail);
				System.out.println(address);
				break;
				
			case 4:
				System.out.println("Help - Train Ticket Booking Service "
						+"\n"+ "Contact us @ indianrailway@gmail.com or"
						+"\n"+ "call @ 43245-73212");
				
				break;
				
			case 5:
				System.out.println("Switch on locaion for contact near railway station");
				
				break;
				
			case 6:
				break;
				
			default:
				System.out.println("Please Enter a Correct option: 1 to 6 - ");
	
				}
		
		scan.close();
		sc.close();
	}

}

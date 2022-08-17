import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//import java.sql.*;

public class mysqljava {
	
	
		
	public static void main(String[] args) {
		
		int i=1;
		while(i<=5) {
			System.out.println(i);
			System.out.print("\033[2J");  
//			System.out.flush(); 
//			System.out.print("\u000C");
//			System("CLS");
			i++;
		}
		try {
			Scanner sc = new Scanner(System.in);
			FileWriter f1 = new FileWriter("C:\\Users\\surya\\OneDrive\\Desktop\\Hospital_booking.txt");
			f1.write("First_name    Last_name   Gender(M/F)  Age  Contact number  Address    E-mail    Problem    Docter_preference");
			f1.write("\n");
			System.out.printf("1. First Name  		   : ");
			f1.write(sc.nextLine()+"     ");
			System.out.printf("2. Last Name   		   : ");
			f1.write(sc.nextLine()+"     ");
			System.out.printf("3. Gender(M/F)		   : ");
			f1.write(sc.nextLine());
			System.out.printf("4. Age 			       : ");
			f1.write(sc.nextLine());
			System.out.printf("5. Contact number	   : ");
			f1.write(sc.nextLine());
			System.out.printf("6. Address 		       : ");
			f1.write(sc.nextLine());
			System.out.printf("7. E-mail  		       : ");
			f1.write(sc.nextLine());
			System.out.printf("8. Problem    		   : ");
			f1.write(sc.nextLine());
			System.out.printf("9. Docter preference    : ");
			f1.write(sc.nextLine());
			f1.close();
			
			}catch(IOException e) {
			System.out.println("Not found");
			e.printStackTrace();
		}
		
		 try {  
	            // Create f1 object of the file to read data  
	            File f1 = new File("C:\\\\Users\\\\surya\\\\OneDrive\\\\Desktop\\\\Hospital_booking.txt");    
	            Scanner dataReader = new Scanner(f1);  
	            while (dataReader.hasNextLine()) {  
	                String fileData = dataReader.nextLine();  
	                System.out.println(fileData);  
	            }  
	            dataReader.close();  
	        } catch (FileNotFoundException exception) {  
	            System.out.println("Unexcpected error occurred!");  
	            exception.printStackTrace();  
	        }  

		
	}

}

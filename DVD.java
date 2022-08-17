import java.util.Scanner;

// A simple definition for a DVD.
public class DVD{
//    public String name;
//    public int releaseYear;
//    public String director;
//
//    public DVD(String name, int releaseYear, String director) {
//        this.name = name;
//        this.releaseYear = releaseYear;
//        this.director = director;
//    }
//
//    public String toString()
//    {
//       return (this.name + ", directed by " + this.director + ", released in " + this.releaseYear);
//    }
//
public static void main(String[] args) {
//	// The actual code for creating an Array to hold DVD's.
//			DVD[] dvdCollection = new DVD[15];
//			
//	// Firstly, we need to actually create a DVD object for The Avengers.
//			DVD avengersDVD = new DVD("The Avengers", 2012, "Joss Whedon");
//			// Next, we'll put it into the 8th place of the Array. Remember, because we
//			// started numbering from 0, the index we want is 7.
//			dvdCollection[7] = avengersDVD;
//					
//			DVD incrediblesDVD = new DVD("The Incredibles", 2004, "Brad Bird");
//			DVD findingDoryDVD = new DVD("Finding Dory", 2016, "Andrew Stanton");
//			DVD lionKingDVD = new DVD("The Lion King", 2019, "Jon Favreau");
//			DVD singamDVD = new DVD("Singam",2014,"Surya");
//			dvdCollection[0] = singamDVD;
//		// Put "The Incredibles" into the 4th place: index 3.
//		dvdCollection[3] = incrediblesDVD;
//
//		// Put "Finding Dory" into the 10th place: index 9.
//		dvdCollection[9] = findingDoryDVD;
//
//		// Put "The Lion King" into the 3rd place: index 2.
//		dvdCollection[2] = lionKingDVD;
//
//		
//		// Print out what's in indexes 7, 10, and 3.
//		System.out.println(dvdCollection[7]);
//		System.out.println(dvdCollection[10]);
//		System.out.println(dvdCollection[0]);
//		System.out.println(dvdCollection[3]);
//
//		// Will print:
//		
//		int[] squareNumbers = new int[10];
//
////		//Go through each of the Array indexes, from 0 to 9.
//		for (int i = 0; i < 10; i++) {
//		    // We need to be careful with the 0-indexing. The next square number
//		    // is given by (i + 1) * (i + 1).
//		    // Calculate it and insert it into the Array at index i.
//		    int square = (i + 1) * (i + 1);
//		    squareNumbers[i] = square;
//		}
////		for (int i = 0; i < 10; i++) {
////			System.out.println(squareNumbers[i]);
////		}
////		// Prints exactly the same as the previous example.
//		System.out.println("\n");
//		// For each VALUE in the Array.
//		for (int square : squareNumbers) {
//		    // Print the current value of square.
//		    System.out.println(square);
//		}
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int c = s.nextInt();
		int d = s.nextInt();
		int e = s.nextInt();
		int[] b = {a,e,d,c};
		System.out.println(b[1]);
}
}

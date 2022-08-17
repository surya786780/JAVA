package first;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class EndofFile {

    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
           for (int i=1;s.hasNext()==true;i++)			// Java's Scanner(.hasNext()) method is helpful for this problem.
           {
        	   if (i<=10) {
               System.out.println(i+" "+s.nextLine());	//use scanner obj . nextline
           }
        	   break;
        }
        
    }  /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }



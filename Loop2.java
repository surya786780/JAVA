package first;
import java.util.*;
//import java.io.*;
public class Loop2 {						//(a+2^0*b),(a+2^0*b+2^1*b),(a+2^0*b+2^1*b+2^2),.....,(a+2^n-1*b)


	    public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        int t=in.nextInt();				//value 3 a,b,n
	        for(int i=0;i<t;i++){
	            int a = in.nextInt();
	            int b = in.nextInt();
	            int n = in.nextInt();
	        
	            int c = a;					//initialize value c
	            for(int j=0;j<n;j++){
	                c += Math.pow(2, j)*b;				//increment a++ , 2 pow j , multiple b
	                System.out.printf("%d  ",c);
	            }
	            System.out.println();
	        }
	        in.close();
	    }
}


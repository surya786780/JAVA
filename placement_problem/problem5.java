public class problem5 {
	public static void main(String[] args){
	
//		-----------------1st---------------------
//		for(int row=1;row<=10;row++) {
//			for(int col=9;col>=row;col--) {
//			System.out.print(" ");
//		}
//			for(int k=1;k<=row;k++) {
//			System.out.print("*");}
//		System.out.println();}
//		-----------------2nd---------------------
//		for(int row=1;row<=10;row++) {
//		for(int col=9;col>=row;col--) {
//		System.out.print(" ");
//	}
//		for(int k=1;k<=row;k++) {
//		System.out.print(k);}
//		
//		for(int i=row-1;i>=1;i--) {
//			System.out.print(i);
//		}
//	System.out.println();}
	
//		-----------------3rd---------------------	
		char a=64;
		for(int row=1;row<=10;row++) {
			for(int col=9;col>=row;col--) {
			System.out.print(" ");
		}
			for(int k=1;k<=row;k++) {
			System.out.print(k);}
			
			for(int i=row-1;i>=1;i--) {
				a += (char)i;
				System.out.print(a);
				a=64;
			}
		System.out.println();
		}
	}
	}


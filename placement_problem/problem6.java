public class problem6 {

	public static void main(String[] args) {
		
//		------------------------1st---------------------------------
//	find min and max value in given array
		
//		int array[]= {10,50,100,40};
//		for(int min=array.length-1;min>0;min--) {
//			for(int max=0;max<min;max++) {
//				if(array[max]>array[max+1]) {
//					int temp=array[max];
//					array[max]=array[max+1];
//					array[max+1]=temp;
//				}
//			}
//		}
////		for(int arr:array) {				//this loop is use to print the sorted array
////				System.out.print(arr+" ");
////			}
//		System.out.println("'"+array[0]+"' is MIN");
//		System.out.println("'"+array[array.length-1]+"' is MAX");
//		
//		----------------------------2nd---------------------------------
//	find duplicate element in the array
		
//		int array[]= {10,50,100,40,10,54,40};
//		for (int dup=0;dup<=array.length-1;dup++) {
//			for(int i=array.length-1;i>dup;i--) {
//			if(array[i]==array[dup]) {
//				System.out.print(array[i]+" ");
//			}
//			}
//		}
//		----------------------------3rd---------------------------------
//	find non-repeat element in the array
		int arr[]= {10,50,100,40,10,54,40};
		boolean repeat=false;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					if(arr[i]!=arr[j]) {
						repeat=true;
					}
					else {
						repeat=false;
						break;
					}
				}
			}if(repeat==true) {
				System.out.print(arr[i]+" ");
			}
		}
	
	}
}















public class problem7 {

	public static void main(String[] args) {
//		1.sort an array of 10 numbers
		
//		int arr[]= {10,9,8,7,6,5,4,3,2,1};
//		for(int i=arr.length-1;i>=0;i--) {
//			for(int j=0;j<i;j++) {
//				if(arr[i]<arr[j]) {
//					int k=arr[i];
//					arr[i]=arr[j];
//					arr[j]=k;
//				}
//			}
//		}
//		for(int s=0;s<arr.length;s++) {
//			System.out.print(arr[s]+" ");
//		}
		
//		2. merge 2 sorted array
		
		int arr1[]= {11,12,13,14,15,16};
		int arr2[]= {1,2,3,4,5,6,7,8};
		int size=arr1.length+arr2.length;
		int arr3[]= new int[size];
		System.arraycopy(arr1, 0, arr3, 0, arr1.length);
		System.arraycopy(arr2, 0, arr3, arr1.length, arr2.length);;
//		System.out.println(Arrays.toString(arr3));
		
		for(int i=arr3.length-1;i>=0;i--) {
			for(int j=0;j<i;j++) {
				if(arr3[i]<arr3[j]) {
					int k=arr3[i];
					arr3[i]=arr3[j];
					arr3[j]=k;
				}
			}
		}
		for(int s=0;s<arr3.length;s++) {
			System.out.print(arr3[s]+" ");
		}
	}
}

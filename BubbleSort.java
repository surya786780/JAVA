
public class BubbleSort {

	public static void main(String[] args) {
		
		int a[]= {9,8,7,6,5,4,3,2,1,0};
		for (int i=0;i<a.length;i++) {
			for(int j=0;j<a.length-1;j++) {
			if(a[j]>a[j+1]) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
//			for(int k=0;k<a.length;k++) {
//				System.out.print(a[k]+" ");
//			}
//			System.out.println();
		}
			
			}
//		System.out.println();
		
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
	}

	}
}
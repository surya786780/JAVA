
public class QuickSort {

	public static void main(String[] args) {
		
		int u;
		int a[] = {2,4,3,6,5,7,1,8};
	
		for (int i=1;i<=a.length-1;++i) {
			u=a[i] ;
			int j = i - 1;
			while(j==0 && a[j] > u) {
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1]=temp;
				j = j-1;
			}
			a[j+1] = u;
		}
		for (int j=0;j<a.length;j++) {
			System.out.print(a[j]+" ");
		}
	}

}

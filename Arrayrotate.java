// matrix rotate 

public class Arrayrotate {
	public static void main(String[] args) {
		
		int arr[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
		
		for(int i[]:arr) {
			for (int j:i) {
		System.out.print(j+" ");
		}
			System.out.println();
	}
		//step 1 - horizontal to vertical 
		int i,j;
		for (i=0;i<arr.length;i++) {
			for(j=i;j<arr.length;j++) {
				if(i != j) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
				}
			}
		}
System.out.println();

		for(int k[]:arr) {
			for (int l:k) {
		System.out.print(l+" ");
		}
			System.out.println();
	}
		
		// step 2 swap elements for 90 degree
		
		int a,b;
		for (a=0;a<arr.length;a++) {
			for (b=0;b<Math.abs(arr.length/2);b++) {
				if(b!=1) {
				int temp = arr[a][b];
				arr[a][b] = arr[a][Math.abs(arr.length-b-1)];
				arr[a][Math.abs(arr.length-b-1)] = temp;
				}
			}
		}
		System.out.println();
		for(int k[]:arr) {
			for (int l:k) {
		System.out.print(l+" ");
		}
			System.out.println();
	}
	}
}

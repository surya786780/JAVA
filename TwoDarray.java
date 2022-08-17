
public class TwoDarray {

	public static void main(String[] args) {
		
/*		int a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]= {2,4,6,8};		*/
		
		int d[][]= {
				{1,2,3},
				{5,6,7,8},
				{2,4,6,8,12,34}
					};
		//System.out.println(d[1][3]);		
		//This is for a normal 2D array (fixed)
	/*	for (int i=0;i<3;i++)			// row is 0,1,2 total 3 rows
		{
			for (int j=0;j<4;j++)		// column is 0,1,2,3 total 4 colums
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		} */
		
		// This for jagged array (not fixed) that means we don't know the column of the array
		
	/*	for (int i=0;i<d.length;i++)			// row we don't know the row size
		{
			for (int j=0;j<d[i].length;j++)		// column we don't know the col size
			{
				System.out.print(" "+d[i][j]);
			}
			System.out.println();
		}	*/
		
		for (int k[]:d)						//Enhanced for loop for 2D array 
		{
			for(int z:k)
			{
				System.out.print(z+" ");
			}
		System.out.println();
		}
		
		//	2d array

		/*
		 * int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		 * 
		 * for (int i=0;i<3;i++) { for(int j=0;j<3;j++) {
		 * System.out.print(arr[i][j]+" "); } System.out.println();
		 */

		// 2d array
		/*
		 * int arr[]= {5,4,2,7,7,9,6,8}; Arrays.sort(arr);
		 * System.out.println(Arrays.toString(arr)); char arr1[]= {'z','x','a','s','d'};
		 * Arrays.sort(arr1); System.out.println(Arrays.toString(arr1)); int sum=0; for
		 * (int i=0;i<arr.length;i++) { sum+=arr[i]; }System.out.println(sum);
		 * System.out.println(sum/arr.length);
		 * 
		 * String sum1=""; for (int j=0;j<arr1.length;j++) { sum1+=arr1[j];
		 * }System.out.println(sum1); 2d array finish
		 */


}
}
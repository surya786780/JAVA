class Student						// array of class
{
	int id;
	String name;
}
public class OneDarrays {

	public static void main(String[] args) {
		
		int nums[]=new int[4];		//first method
		nums[0]=1;
		nums[1]=12;
		nums[2]=123;
		nums[3]=1234;
	//	System.out.println(nums[2]);
	
	/*	int nums[]= {1,12,123,1234};		// sec method
		//System.out.println(nums[3]);
		
		for (int i=0;i<=3;i++)				// for access all elements in the array
		{
			System.out.println(nums[i]);
		} */
		
		// Student s[] = new Student[4];		//or using -> 
		
	/*	Student s1=new Student();
		Student s2=new Student();
		Student s3=new Student();
		Student s4=new Student();	
		Student s[]={s1,s2,s3,s4};  	*/ 
		 
		for (int k : nums)					//Enhanced for loop for 1D array
		{
			System.out.println(k+" ");
		}
		
	}

}

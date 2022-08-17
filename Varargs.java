class Add					
{
	public int add(int ...n)		//Variable length argument 
						//java consider this as a array for using multiple parameters call from obj  
	{
		int sum = 0;
		for (int i:n)				// for loop enhanced
		{
			sum=sum+i;
		}
		return sum;
		
	}
}
public class Varargs {

	public static void main(String[] args) {
		
		Add sum = new Add();
		System.out.println(sum.add(5,4,3,2,1,0,12,4));	// we use multiple parameters in this method
		
	}

}

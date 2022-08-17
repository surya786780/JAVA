class Mark
{
	public void show(Number i)		//we dont need to specify any data type for method so use numbers
	{
		System.out.println(i);
	}
	
}
public class AbstractNumbers {

	public static void main(String[] args) {
		
		Mark obj = new Mark();
		obj.show(6.56789);			// we use any parameters but not modify in methods
	}

}

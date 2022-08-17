 class A						//final is a constant		
{	
	final int i=5;         // change i is not possible in final 
	public final void show()	//final method not override
	{
		int i=10;
		System.out.println(i);
		
	}
}
class B extends A 				//not possible to extends using final class
{
	//public void show()			//not override
	{
		System.out.println("in B");
	}
}
public class Final {

	public static void main(String[] args) {
		
		A obj = new A();
		obj.show();
	
			}

}

class Outer			// we use multiple class inside the one class
{
	int a;
	public void show(int a)
	{
		
		System.out.println(a);
		System.out.println("Outer Show");
	}
	
	class Inner
	{
		public void display(int a)
		{
			System.out.println(a);
			System.out.println("Inner Display");
		}
	}
}
public class InnerDemo {		// we create all the variables,methods,constructors,classes also in one class 

	public static void main(String[] args) {
		
		
		
		Outer obj = new Outer();
		obj.show(4);
		
		Outer.Inner obj1 = obj.new Inner();	//this inner cls is inside the outer so we use outer cls name.inner cls name
		obj1.display(6);						//and also outer obj.new 
	}

}

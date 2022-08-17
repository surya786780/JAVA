abstract class Human				//Abstract class can't create a obj for it
{									
	public abstract void eat();		//In abstract method we not define a method {} but declare it ;
	public void walk()				//If we use abstract method compulsory give abstract for class also 
									//but we have abstract class not compulsory for create a abstract method			
	{
		System.out.println("Walking");
	}
}
class Man extends Human				// we extends the abstract class human we compulsory use method from abstract class eat
{
	public void eat()
	{
		System.out.println("eating");
	}
	
}
public class Abstract {

	public static void main(String[] args) {
		
		Human obj = new Man();		// can't create obj for abstract class so we create obj for sub class
		obj.eat();
		obj.walk();
		
	}

}

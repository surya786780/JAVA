interface Stu						//interface also like abstract class but interface is good 
{
	public void mark();

}
class boys implements Stu
{
	public void mark()
	{
		System.out.println("boys...");
	}
}
class girls implements Stu
{
	public void mark()
	{
		System.out.println("girls...");
	}
}

public class Interface {

	public static void main(String[] args) {
		
			Stu obj = new boys();
			Stu obj1 = new girls();
			obj.mark();
			obj1.mark();
	}

}

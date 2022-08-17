class Emp{
	int eid;
	int esalary;
	static String ceo;
	
	public Emp()
	{
		eid=4;
		esalary=44000;
		//ceo="surya";
	}
	public void det()
	{
		eid=3;
		esalary=55000;
		//ceo="surya";
	}
	static			// we use same ceo for all methods and construtors  
	{				// static means no change so ceo is not change for any employee in one comany
		ceo="SURYA";
		//System.out.println("In static");
	}
}
public class Statics {
	public static void main(String args[]) 
	{
		Emp obj = new Emp();
		Emp sk = new Emp();
		sk.det();
		
		System.out.println("eid:"+obj.eid +" esalary:" +obj.esalary+" CEO:" +Emp.ceo); //we use ceo string is call by class
		System.out.println("eid:"+sk.eid +" esalary:" +sk.esalary+" CEO:" +Emp.ceo); //we don't need obj to call static vari
	}

}

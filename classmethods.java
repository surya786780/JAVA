/*class Cal
{
	int i;
	double j;
	double k;
	double z;
	String s;										// methods have same name - method overloading
	
	public void add()								// empty method
	{
		System.out.println("hi");
	}
	public void add(int i,double j,String s)		// parameter used method
	{
		k=i+j;
		System.out.println(s);
	}
	public double add(int i,double j,double k)		// method overloading but parameter different
	{
		return z=i+j+k;
	}
}
public class classmethods {
	public static void main(String args[])
			{
				Cal obj=new Cal();
				obj.add();								// for empty method object create
				obj.add(13,55.675,"hello everyone");	//create object for parameter method
				obj.add(12,2.4,4.444);					// double method
				System.out.println(obj.k);
				System.out.println(obj.z);
				//System.out.println(obj.s);
			}
}*/

class Student{
	String Name;
	int id;
	String Address;
	
	public Student(String Name, int id, String Address) {
		this.Name=Name;
		this.id=id;
		this.Address=Address;
	}
	public void setName(String Name) {
		 this.Name = Name;
	}
	public void setid(int id) {
		 this.id = id;
	}
	public void setAddress(String Address) {
		 this.Name = Address;
	}

	public String getName() {
		return Name;
	}
	public int getid() {
		return id;
	}

	public String getAddress() {
		return Address;
	}
	
	public String joins() {
		return ("Student name: "+this.getName()+"Student id: "+this.getid()+"Student Address is: "+this.getAddress());
	}
}
public class classmethods {
	public static void main(String args[])
			{
			Student stu=new Student("Surya",508,"Pallipalayam");
			System.out.println(stu.getName());
			System.out.println(stu.getid());
			System.out.println(stu.getAddress());
			System.out.println(stu.joins());
			}
}





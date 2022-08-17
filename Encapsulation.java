class Student
{
	private int rollno;
	private String name;
	public int getRollno() {		//getter for get the input
		return rollno;
	}
	public void setRollno(int rollno) {		//setter for set the input
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
public class Encapsulation {
	public static void main(String args[])
			{
				Student s1 = new Student();
				s1.setRollno(4);
				s1.setName("Surya");
				System.out.println(s1.getRollno());		//if we use private variables use object.get methods
				System.out.println(s1.getName());
			}

}

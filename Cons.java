/* class A
	{ 
	  int i;
	  int j;
	  int k;
	  String r;
	  String s;
	  
	public A()								// first constructor
	{
		 i = 1;
		 j = 3;
		k=i+j;
		System.out.println("in frt");
	}
	public A(int i,int j)					// sec constructor
	{
		
		k=i+j;
		System.out.println("in sec");
	}
	
	public A(int i,double j,String s)			// constructor overloading
	{
		r=i+j+s;
	}
	
}
	
public class Cons {

	public static void main(String[] args) {
		
		A obj2 = new A();
		System.out.println(obj2.k);
		A obj = new A(4,4.567,"\nhello all");
		System.out.println(obj.r);
		A obj1 = new A(4,4);
		System.out.println(obj1.k);
		
	}

}*/

class Cube{
	int width;
	int height;
	int depth;
	
	Cube(int width, int height, int depth){
		this.width=width;
		this.height=height;
		this.depth=depth;
		}
	
	Cube(int width,int height){
		this.width=width;
		this.height=height;
		this.depth=10;	
	}
	
	Cube(int dimention){
		this.width=dimention;
		this.height=dimention;
		this.depth=dimention;
	}
	
	Cube(){
		this.width=10;
		this.height=10;
		this.depth=10;
	}
	
	int total() {
		return width*height*depth;
	}
}
public class Cons {

	public static void main(String[] args) {
		int vol;
		Cube cube=new Cube(10,20,15);
		vol=cube.total();
		System.out.println(vol);
		
		Cube cube1=new Cube(10,20);
		vol=cube1.total();
		System.out.println(vol);
		
		Cube cube2=new Cube(15);
		vol=cube2.total();
		System.out.println(vol);
		
		Cube cube3=new Cube();
		vol=cube3.total();
		System.out.println(vol);
	}	
	}









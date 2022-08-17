import java.util.*;
public class Ex2 {
	public static void main(String[] args) {

//		for (int i = 1; i < 5; i++) {
//			for (int j = 1; j<8; j++) {
//				if ((i==1 && j==4) || (i==2 && j==3 ) || (i==2 && j==5) || (i==3 && j%2==0 && j!=4) || (i==4)){
//				System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}System.out.println();
//	}

		
//			for (int i = 5; i>=1; i--) {
//			
//				for (int j = 5; j>=1; j--) {
//					System.out.print("* ");
//				}
//				System.out.println();	
//			} 
		
		
//		int i=10;
//		while (i>=1) 
//		{
//			System.out.println(i);
//			i--;
//		} 
		

//		int[] ar= {2,4,6,7,1,2,3,4,9,11,14,12,13,20};
//		System.out.println(Arrays.toString(ar));
//		Arrays.sort(ar);
//		for(int i:ar) {
//			System.out.print(i+" ");
//		}
//		for (int i:ar) {
//			if(i%2==0) {
//			System.out.println("even "+i);
//			}
//			else {
//				System.out.println("odd "+i);
//			}
//		}
		
		
		
		//remove duplicate element in array
//		int[] ar= {3,4,5,4,2,3};
//		int l=ar.length;
//		for (int i=0;i<l;i++) {
//			for (int j=i+1;j<l;j++) {
//				if(ar[i]==ar[j]) {
//					ar[j]=ar[l-1];
//					l--;
//				}
//			}
//		}
//		int ar1[]=Arrays.copyOf(ar, l);
//		for (int j=0;j<ar1.length;j++) {
//			System.out.print(ar1[j]+" ");
//		}
		
		
		
		// ArrayList AL is a continues memory allocation
//		ArrayList <Integer> a=new ArrayList<Integer>();
//		for (int i=0;i<7;i++) 
//		{	
//		a.add(i);
//		}
//		a.add(4);
//		a.add(3);
//		a.add(5);
//		a.add(1);
//		a.add(2);
//		System.out.println(a);
//		//a.remove(2);
//		//System.out.println(a);
//		System.out.println(a.indexOf(4)); //4 is a value we got a index of 4 not get value's 4
//		a.sort(null);
//		System.out.println("sort > "+a);
//		System.out.println(a.size());
//		System.out.println(a.indexOf(a.size())); // not have any value 12 so print -1
		
		
		//LinkedList 
		
//		LinkedList<String> b=new LinkedList<>();
//		b.add("S");
//		b.add("u");
//		b.addFirst("A.");
//		b.addLast("a");
//		b.add(3,"r");
//		b.add(4,"y");
//		System.out.println(b.set(1, "a")); //change the value to another value index,value
//		for (String i:b) {
//		System.out.print(i);
//	}
//		b.remove(0);
//		System.out.println("\n"+b);
//		System.out.println(b.size());
//		b.clear();
//		System.out.println(b.size());
		
		
		
		//HashSet or Set, doesn't add a duplicate elements, not change the value immutable
		
//		Set<Integer> c=new HashSet<>();
//		c.add(4);
//		c.add(3);
//		c.add(2);
//		c.add(4); //doesn't add a duplicate elements
//		System.out.println(c);
//		
//		System.out.println(c.contains(3)); //contain is use to check the set is have a element or not 
//		
//		c.remove(3);
//		System.out.println(c);
//		// for remove the [] brackets
//		for (int i:c) {
//			System.out.print(i+" ");
//		}
		
		
		
		//		TreeSet, doesn't add a duplicate elements
		//		Auto sort values
		
		TreeSet <Double> d=new TreeSet<>();
		d.add(4.3);
		d.add(3.4);
		d.add(1.3);
		d.add(2.7);
		d.add(4.8);
		System.out.println(d);
		System.out.println(d.lower(3.7)); //gives the next low value of the tree set
		System.out.println(d.contains(1.1));
		System.out.println(d.last()); // print last element in the tree
		System.out.println(d.tailSet(3.0)); //print greater all the element 3.0 
		System.out.println(d.headSet(3.0)); //print lower all the element 3.0 
		
		
	}
}








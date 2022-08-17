import java.util.*;
import java.util.Map.Entry;
public class Ex3 {

	public static void main(String[] args) {
		HashMap<Integer, String> Eee=new HashMap<>();
		Eee.put(1,"Surya");
		Eee.put(2, "Kumar");
		Eee.put(4, "Rohit");
		Eee.put(5, "Rajini");
		System.out.println(Eee);
		// get a value of the key
		if(Eee.containsKey(4)) {
			String q=Eee.get(4);
			System.out.println(q);
		}
		
		System.out.println();
		for (int k:Eee.keySet()) {
			System.out.println(k+" "+Eee.get(k));
		}
		
		System.out.println();
		for(Entry<Integer, String> E:Eee.entrySet()){
			System.out.println(E.getKey()+" "+E.getValue());
		}
		
		
		/*Map<Integer, String> Eee=new TreeMap<>();
		Eee.put(4,"Surya");
		Eee.put(3, "Kumar");
		Eee.put(1, "Rohit");
		Eee.put(2, "Rajini");
		System.out.println(Eee);
		// get a value of the key
		if(Eee.containsKey(4)) {
			String q=Eee.get(4);
			System.out.println(q);
		}
		
		System.out.println();
		for (int k:Eee.keySet()) {
			System.out.println(k+" "+Eee.get(k));
		}
		
		System.out.println();
		for(Entry<Integer, String> E:Eee.entrySet()){
			System.out.println(E.getKey()+" "+E.getValue());
		} */	
		
			
		// STACK 
		/*Stack <String> s=new Stack<>();
		s.add("india");
		s.push("USA");
		s.push("UK");
		System.out.println("Stack is: "+s);
		System.out.println("Top element in stack: "+s.peek());
		String a=s.remove(1);
		System.out.println("Removed index element is- "+a);
		System.out.println(s);
		String b=s.pop();
		System.out.println("Removed pop element is- "+b);
		System.out.println("Pop the top element in the Stack- "+s);*/
	
		
		// Queue 
					/*Queue <String> Q=new PriorityQueue<>();
					Q.add("INDIA");
					Q.add("USA");
					Q.add("UK");
					System.out.println("Queue is: "+Q);
					String a=Q.poll();
					System.out.println("Polled or removed element: "+a);
					System.out.println("After poll: "+Q);
					System.out.println("Top element in Queue: "+Q.peek());*/
		
		
		
		
	}
}






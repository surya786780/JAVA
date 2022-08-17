//import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class Stream {

	public static void main(String[] args) {
//		List<Integer> l=new ArrayList<>();
//		l.add(10);
//		l.add(20);
//		l.add(5);
//		
//		List<Integer> s=new ArrayList<>();
//		for (int i:l) {
//			s.add(i*i);
//		}
//		System.out.println(s);
		
		//The same above we do using a Stream Map method and give collect in the last of the map 
		//List<Integer> s=l.stream().map(x -> x*x).collect(Collectors.toList());//tolist is convert this in a list method 
		//System.out.println(s);
		
//		List<Integer> l=new ArrayList<>();
//		l.add(10);
//		l.add(20);
//		l.add(5);
//		
//		Set<Integer> s=new HashSet<>();
//		for (int i:l) {
//			s.add(i+i);
//		}
//		System.out.println(s);
		
//		Set<Integer> s=l.stream().map(z -> z+5).collect(Collectors.toSet());
//		System.out.println(s);
		
		
		// Filter function
		
//		List<String> l=new ArrayList<>();
//		l.add("Java");
//		l.add("Python");
//		l.add("C++");
//		l.add("Pycharm");
//		l.add("py");
		
//		List<String> s=new ArrayList<>();
//		for (String i:l) {
//			if (i.startsWith("P")) {
//				s.add(i);
//			}
//		}
//		System.out.println(s);
		
		//The same above we do using a Stream Filter method and give collect in the last of the Filter
		
//		List<String> s=l.stream().filter(c -> c.startsWith("P")).collect(Collectors.toList());
//		System.out.println(s);
		
		// sort the elements
		
//		List<String> s=l.stream().sorted().collect(Collectors.toList());
//		System.out.println(s);

		//print all the elements from the list and perform to all the elements
		// print all the elements start with p only
//	List<String> w=new ArrayList<>();
//		l.stream().forEach(q -> {
//		if(q.startsWith("P")) {
//			w.add(q);
//		}
//		else {
//			w.remove(q);
//		}
//		
//		});System.out.println(w);
		
//		l.stream().forEach(a -> {
//			//System.out.println(a);
//			if (a=="Java") { 
//				System.out.println("Found "+a);
//			}
//			else {
//				System.out.println("Not found "+a);
//			}
//		});
		
		//only print all the elements
		
//		l.stream().forEach(a -> System.out.println(a));
		
		// reduce (use for find sum of all element from the list)
		
//		int a = l.stream().reduce(0, (result,i) -> result+i); //0-initial value, result-partial result of the reduction 
//		System.out.println(a);				//operation, i-next element of the stream (result,i-is the accumulator)
		
	
	}

}








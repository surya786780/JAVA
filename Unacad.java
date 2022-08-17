import java.util.*;
	import java.lang.*;
	import java.io.*;

	/* Name of the class has to be "Main" only if the class is public. */

public class Unacad {
	/* package whatever; // don't place package name! */

	
		public static void main (String[] args) 
		{
			// your code goes here
			Scanner sc = new Scanner(System.in);
			int M = sc.nextInt();
			int K = sc.nextInt();
			int arr[] = new int[M];
			for(int i=0;i<M;i++)
			{
				arr[i]=sc.nextInt();
			}
			List <Integer> l = new ArrayList<>();
			int co=0;
			for(int i=0;i<M;i++)
			{
				for(int j=2;j<=K;j++)
				{
					if(arr[i]%j==0)
					{
						l.add(j);
					}
				}
				
			}
			List <Integer> list = new ArrayList<>();
			int arr1[]=new int[K];
			for(int i=0;i<K;i++) {
				arr1[i]=i;
			}
			l.sort(null);
			Set<Integer> s = new LinkedHashSet<>(l);
//			System.out.println(s);
			for(int i=1;i<=K;i++)
			{
				if(!s.contains(i))
				{
					list.add(i);
				}
						
			}
			System.out.println(list.size());
			for(int i=0;i<list.size();i++) {
				System.out.println(list.get(i));
			}
		}
	}


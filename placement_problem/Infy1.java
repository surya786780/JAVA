import java.util.*;
import java.util.regex.*;
public class Infy1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s=sc.nextLine();
		List<String> l = new ArrayList<>();
		Pattern pp = Pattern.compile("\\d+");
		Matcher m = pp.matcher(s);
		while(m.find())
		{
		    System.out.println(m.group());
//			int q = Integer.parseInt(m.group());
			l.add(m.group());
		}
//		System.out.println(l+" "+" "+l2 );
//		System.out.println(l);

		int arr[]=new int[l.size()];
		int check=0;
		for(int i=0;i<l.size();i++) {
			int add=Character.getNumericValue(l.get(i).charAt(l.get(i).length()-1));
			arr[i]=add;
			check+=add;
		}
		
		System.out.println(check);
		int flag=0;
		for(int i=2;i<check/2;i++) {
			if(check%i == 0) {
				flag=1;
				break;
			}
		}
		String rev=Integer.toString(check);
		String rev1="";
		if(flag==1) {
			for(int i=rev.length()-1;i>=0;i--) {
				rev1+=rev.charAt(i);
			}
			int revval=Integer.parseInt(rev1);
			int flag1=0;
			for(int i=2;i<revval/2;i++) {
				if(revval%i == 0) {
					flag1=1;
					break;
				}
			}
			if(flag1==1) {
				int ans=0;
				for(int i=1;i<=revval;i++) {
					for(int j=i;j<=revval;j++) {
						if(i*j==revval) {
							System.out.println(i+" "+j);
							ans+=2;
						}
					}
				}
				System.out.println(ans);
			}
			else {
				System.out.println(revval);
			}
			
		}
		else {
			System.out.println(check);
		}
		
//		System.out.println(rev1);
	}

}


public class bignumber {

	public static void main(String[] args) {
		
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		List <String> l = new ArrayList <>();
//		for (int i=1;i<=n;i++) {
//			String a = s.nextLine();
//			l.add(a);
//		}
		String l[]= {"30","34","9","3"};
		
		for (int j=0;j<l.length;j++) {
			for (int i=j;i<l.length;i++) {
			String b=l[j]+l[i];
			String c=l[i]+l[j];
			
			int d = Integer.parseInt(b);
			int e = Integer.parseInt(c);
			if (d > e) {
				continue;
			}
			else {
				String temp = l[j];
				l[j] = l[i];
				l[i] = temp;;
						
			}}
		}
		for (String k:l) {
			System.out.print(k+"");
		}
		
		

	}

}

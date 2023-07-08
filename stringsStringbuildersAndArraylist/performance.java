package stringsStringbuildersAndArraylist;

import java.util.Iterator;

public class performance {

	public static void main(String[] args) {
		int n =100000;
		long start = System.currentTimeMillis();
//		String s="";
//		
//		for (int i = 0; i <=n; i++) {
//			s+=i;
//		}
		
		StringBuilder s=new StringBuilder("");
		for (int i = 0; i <=n; i++) {
			s.append(i);
		}
		long end = System.currentTimeMillis();
		long duration = end-start;
		System.out.println(duration);

	}

}

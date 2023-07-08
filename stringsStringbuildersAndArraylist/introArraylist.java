package stringsStringbuildersAndArraylist;
import java.util.*;
public class introArraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		System.out.println(list+"->"+list.size());
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list+"->"+list.size());
		
		list.add(1,40);
		System.out.println(list);
		
		int val=list.get(1);
		System.out.println(val);
		
		list.set(1, 1000);
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		ArrayList<String> l2= new ArrayList<>();
		l2.add("hello");
		l2.add("mello");
		l2.add("cello");
		for (int i = 0; i <l2.size(); i++) {
			String val1=l2.get(i);
			System.out.println(val1);
		}
		for (int vali : list) {
			System.out.println(vali);
		}
		

	}

}

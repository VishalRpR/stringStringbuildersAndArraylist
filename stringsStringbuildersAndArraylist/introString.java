package stringsStringbuildersAndArraylist;
import java.util.*;

public class introString {

	public static void main(String[] args) {
//		Scanner scn =new Scanner(System.in);
//		String s1=scn.nextLine();
//		String s2=scn.nextLine();
//		System.out.println(s1);
//		System.out.println(s1.length());
//		System.out.println(s2);
		
//		s1.charAt(0)='z';  does not work
		
		
//		
//		for (int i = 0; i < s1.length(); i++) {
//			char cr=s1.charAt(i);
//			System.out.println(cr);
//		}
		
//		
//		String s = "abcd";
//		for (int i = 0; i <s.length(); i++) {
//			for (int j = i+1; j <=s.length(); j++) {
//				System.out.println(s.substring(i,j));
//				
//			}
//		}
		
//		String s1="hello";
//		s1+=" ";
//		s1+="w";
//		s1+="o";
//		s1+=10;
//		String s2="vishal";
//		String s3=s1+" "+s2;
//		System.out.println("hello"+10+20);
//		System.out.println(10+20+"hello");
		
		String s="abc def ghi jkl mno";
		String[] parts = s.split(" ");
		for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}
		
		
		

	}

	

}

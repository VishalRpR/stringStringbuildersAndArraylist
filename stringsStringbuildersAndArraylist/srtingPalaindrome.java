package stringsStringbuildersAndArraylist;
import java.util.*;



public class srtingPalaindrome {

	
	public static boolean ispalindrome(String s) {
		int i=0;
		int j=s.length()-1;
		
		while(i<=j) {
			char c1=s.charAt(i);
			char c2=s.charAt(j);
			if(c1!=c2) {
				return false;
			}else {
				i++;
				j--;
			}
		}
		
		return true;
	}
	
	public static void solution(String s) {
		
		for (int i = 0; i <s.length(); i++) {
			for (int j = i+1; j<=s.length(); j++) {
				String ss=s.substring(i,j);
				if(ispalindrome(ss)==true){
				System.out.println(ss);
				}
			}
		}

	}
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		String str=scn.nextLine();
		solution(str);
		
	}




}

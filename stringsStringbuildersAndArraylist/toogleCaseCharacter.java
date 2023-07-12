package stringsStringbuildersAndArraylist;
import java.util.*;

public class toogleCaseCharacter {
	
	public static String toogleCase(String str) {
		StringBuilder sb= new StringBuilder(str);
		for (int i = 0; i < sb.length(); i++) {
			char ch=sb.charAt(i);
			
			if(ch>='a' && ch<='z') {
				char uhc=(char)('A'+ch-'a');
				sb.setCharAt(i, uhc);
			}else if(ch>='A' && ch<='Z') {
				char lhc=(char)('a'+ch-'A');
				sb.setCharAt(i,lhc);
			}
			
		}
		return sb.toString();
		
		
		
		

	}
	
	
	
	
	

	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		String str = scn.next();
		System.out.println(toogleCase(str));

	}

}

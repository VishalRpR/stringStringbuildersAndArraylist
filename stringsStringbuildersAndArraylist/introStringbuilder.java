package stringsStringbuildersAndArraylist;

public class introStringbuilder {

	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("hello");
		System.out.println(sb);
		
		char ch = sb.charAt(2);
		System.out.println(ch);
		
		sb.setCharAt(0,'y');
		System.out.println(sb);
		
		sb.insert(2, 'y');
		System.out.println(sb);
		
		sb.deleteCharAt(2);
		System.out.println(sb);
		
		sb.append('g');
		System.out.println(sb);
		
		
		
	}

}

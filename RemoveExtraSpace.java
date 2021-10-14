import java.util.StringTokenizer;

public class RemoveExtraSpace {
	
	public static void main(String[] args) {
		
		String input = "Welcome to jave world    ";
		input = input.replaceAll("\\s ", "");
		System.out.println(input);
		//countWords(input);
		
	}
	
	static void removeExtraSpce(String input) {
		StringTokenizer tokens = new StringTokenizer(input, " ");
		
		System.out.println(tokens.countTokens());
		
		StringBuffer strbf = new StringBuffer();
		
		while(tokens.hasMoreElements()) {
			strbf.append(tokens.nextElement()).append(" ");
		}
		
		System.out.println(strbf);
	}
	
	
	static void countWords(String input) {
		StringTokenizer tokens = new StringTokenizer(input, " ");
		
		System.out.println(tokens.countTokens());
		
	}

}

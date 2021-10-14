import java.util.*;

public class CountSpace {
	
	
	public static void main(String[] args) {
		String sample = "thii     st es ting";
		
		System.out.println(sample.length());
		/*Integer samplde = sample.replaceAll("\\s", "").length();
		
		System.out.println(sample.length() - samplde);
		
		int count = 0;
		for (int i = 0; i < sample.length(); i++) {
			
			if(String.valueOf(sample.charAt(i)).equals(" ")) {
				count += 1;
				
			}
			
		}
		System.out.println(count);*/
		
		
		
		System.out.println(sample.trim().length());
		
		StringTokenizer token = new StringTokenizer(sample, " ");
		
		System.out.println(token.countTokens());
		String without_extra_space = "";
		
		while(token.hasMoreElements()) {
			without_extra_space += token.nextToken() + " ";
		}
		
		System.out.println(without_extra_space.trim());
		
	}

}

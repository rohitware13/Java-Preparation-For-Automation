package practice_24;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverse {
	
	public static void main(String[] args) {
		String input = "rohit ware";
		
		
		//For loop
		String reverse = "";
		for (int i = input.length()-1; i >= 0; i--) {
			
			reverse += input.charAt(i);
			
		}
		System.out.println(reverse);
		
		
		
		
		//By using StringBuilder
		
		StringBuilder builder = new StringBuilder(input);
		
		System.out.println(builder.reverse());
		
		
		// By using Stream
	//	System.out.println(Stream.of(input).map(ch -> new StringBuilder(ch).reverse()).collect(Collectors.joining(" ")));
	

	}

	
}

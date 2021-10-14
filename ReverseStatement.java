import java.util.Deque;
import java.util.Stack;

public class ReverseStatement {
	
	
	public static void main(String[] args) {
		String sample = "this is rohit";
		
		String reversed_output="";
		
		String[] split_sample = sample.split("\\s");
		
		System.out.println(split_sample.length);
		
/*		for (int i = 0; i < split_sample.length; i++) {
			
			String split_input = split_sample[i];
			
			for (int j = split_input.length() -1; j >=0 ; j--) {
				
				reversed_output = reversed_output + split_input.charAt(j);
				
				
				
			}
			
			reversed_output += " ";
			
		}
		System.out.println(reversed_output.trim());*/
		
/*		
		Stack<Character> stack_entry = new Stack<>();
		
		for (int i = 0; i < sample.length(); i++) {
			
			stack_entry.push(sample.charAt(i));
		}
		
		for (int i = 0; i < sample.length(); i++) {
		System.out.print(stack_entry.pop());
		}*/
		
		
		StringBuilder builder = new  StringBuilder(sample);
		
		builder.reverse();
		
		System.out.println(builder);
		
	}

}

import java.util.ArrayList;

public class Student{

	int std_id;
	
	
	
	public static void main(String[] args) {
		String ra;
		
		String[] sa;

		String[] s1 = {"123.03","34.54","54.76"};
		
		
		//s1.sort(function(a, b){return a-b;});

		
		ArrayList<String> str = new ArrayList<>();
			
		String doubleAsString = String.valueOf(s1[0]);
		int indexOfDecimal = doubleAsString.indexOf(-1);
		
		String a = doubleAsString.substring(indexOfDecimal);
		System.out.println(a);
		
	}
}
package practice_24;

public class ExtractNumberAndAdd {
	
	public static void main(String[] args) {
		
		String inp = "1231asd54";
		
		String newsd= "0";
		int sum = 0;
		for(char ch:inp.toCharArray()) {
			if(Character.isDigit(ch)) {
				newsd = newsd+ch;
			}else {
				sum += Integer.parseInt(newsd);
				newsd = "0";
			}
		}
		
		System.out.println(sum + Integer.parseInt(newsd));
	}

}


public class AlphanumericPalindrome {

	
	public static void main(String[] args) {
		
		String input = "A man, a plan, a canal: Panama";
		
		
		input = input.replaceAll("[^a-zA-Z0-9 ]", "");
		
		System.out.println(input);
		
		
		
//		String new_inp = "abccbaa";
//		
//		StringBuilder build = new StringBuilder(new_inp);
//		
//		StringBuilder rev_inp = build.reverse();
//		int counter = 0;
//		System.out.println(rev_inp);
//		int j = new_inp.length()-1;
//		for (int i = 0,k=0; i < j; i++,k++) {
//			if(new_inp.charAt(i) != rev_inp.charAt(k)) {
//				new_inp = new_inp.replaceFirst(String.valueOf(rev_inp.charAt(k)), "");
//				i--;
//				counter++;
//			
//				
//			}
//		}
//		System.out.println(counter);
		
		int[] inp_arr= {2,67,3,6, 7,2};
		int sum = 9;
		for (int i = 0; i < inp_arr.length-1; i++) {
			for (int j = i+1; j < inp_arr.length; j++) {
				if(inp_arr[i]+inp_arr[j]== sum) {
					System.out.println("Index - "+ String.valueOf(i)+ "," + String.valueOf(j));
				}
				
				
			}
			
		}
		
	}
}

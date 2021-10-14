import java.util.ArrayList;

public class Palindrome {

	
	public static void main(String[] args) {
		
		//System.out.println(isPalindrome(121));
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(2);
		list.add(1);
		//list.add(1);
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();

		
		for (int i = list.size()-1; i >= 0; i--) {
			list2.add(list.get(i));
			
		}
		
		if(list.equals(list2)) {
			System.out.println("Success");
		}
	}
	
	

	//	    public static boolean isPalindrome(int x) {
//	    	int original = x;
//	        int num = 0;
//	         while(x>0){
//	             int rem = x%10;
//	             num = (num*10)+rem;
//	             x = x/10;
//	         }   
//	        
//	      if(num==original)
//	            return true;
//		return false;
//	        
//	    }
	    
	   
	      
	
}

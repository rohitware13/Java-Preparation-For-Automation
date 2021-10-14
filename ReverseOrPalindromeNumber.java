package practice_24;

public class ReverseOrPalindromeNumber {
	
	public static void main(String[] args) {
		
		int a = -131;
		
		int rem = 0;
		
		int temp = a;
		int sum = 0;
		if(a < 0) {
			a = a* -1;
		}
		while(a>0) {
			
			rem = a % 10;
			
			sum = sum*10+rem;
			
			a=a/10;
		}
		
		if(temp < 0) {
			sum = sum* -1;
		}
		if(temp==sum) {
			System.out.println("Palindrome");
		}
	}

}


public class ReverseNumber {
	
	public static void main(String[] args) {
		
		int num = 123;
		int revnu = 0;
		int rem = 0;
		while (num!=0) {
			rem = num%10;
			revnu = rem + revnu*10;
			num = num/10;
			
			
		}
		System.out.println(revnu);
	}

}

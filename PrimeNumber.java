
public class PrimeNumber {

	public static void main(String[] args) {
		
		int num= 4;
		
		int prm = num/2;
		
		int flag = 0;
		
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				System.out.println("not prime");
				flag = 1;
				break;
				
			}
		}
		
		if(flag==0) {
			System.out.println("Prime");
		}
	}
}

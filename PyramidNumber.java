
public class PyramidNumber {

	

	public static void main(String[] args) {

		int n=3;

		for (int i = 0; i < n; i++) {
			System.out.println(" ");
			for (int j = 0; j <= i; j++) {
				System.out.print(j+ "");

			}

		}
		
		
		for (int i = 0; i < n; i++) {
			System.out.println(" ");
			int letter = 65;
			for (int j = 0; j <= i; j++) {
				
				System.out.print((char)letter);
				letter++;
			}
			
		}
		
	}
}

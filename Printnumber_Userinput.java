import java.util.Scanner;

public class Printnumber_Userinput {

	
	public static void main(String[] args) {
		Scanner readInput = new Scanner(System.in);
		
		System.out.println("Enter the desired number - ");
		int num = readInput.nextInt();
		
		readInput.close();
		
		System.out.println("Entered Number - " + num);
	}
}

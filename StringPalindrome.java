package practice_24;

public class StringPalindrome {

	public static void main(String[] args) {

		String a = "abcba";
		String temp = "";

		//Logic 1
		for (int i = a.length()-1; i >= 0; i--) {
			temp += a.charAt(i);
		}

		if(a.equals(temp)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not");
		}

		// Logic 2
		int i=0; int j = a.length()-1;
		boolean flag = false;
		while(i<j) {
			if(a.charAt(i) == a.charAt(j)) {

				i++;
				j--;
			}
			else {
				flag = false;	
				break;
			}

			flag = true;
		}

		if(flag == true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not");
		}
	}


}

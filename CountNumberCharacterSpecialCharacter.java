package practice_24;

public class CountNumberCharacterSpecialCharacter {
	
	
	public static void main(String[] args) {
		
		String input = "asdasd345(*&*&^";
		
		
		
		int alpha = 0;
		int digit = 0;
		int special = 0;
		
		//Logic 1
		for (char ch : input.toCharArray()){
			
			if(Character.isAlphabetic(ch)) {
				alpha += 1;
			} else if (Character.isDigit(ch)) {
				digit += 1;
			} else {
				special +=1;
			}
			
		}
		
		System.out.println("Character " + alpha + " ,Digit " + digit + " ,Special Character " + special);
		
		//Logic 2
		
		String temmp = input.replaceAll("[^A-Za-z0-9 ]", "");
		
		special = input.replaceAll("[A-Za-z0-9 ]", "").length();
		
		digit = temmp.replaceAll("[A-Za-z]", "").length();

		alpha = temmp.replaceAll("[0-9]", "").length();
		
		System.out.println("Character " + alpha + " ,Digit " + digit + " ,Special Character " + special);

	}

}

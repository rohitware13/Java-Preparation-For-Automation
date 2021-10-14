
public class OccuranceOfCharacterWithoutLoop {

	
	public static void main(String[] args) {
		
		String name= "rohitwaree";
		
		char ch = 'r';
		
		
		int count = name.replace("r", "").length();
		System.out.println(name.length()-count);
		
		
		/*for (int i = 0; i <= name.length()-1; i++) {
			int count1 = 0;
			String rel = name.replace(String.valueOf(name.charAt(i)), "");
			 count1 = name.length() - rel.length();
			
			if(count1>1) {
				System.out.println("Duplicate - " + name.charAt(i));
			}
			
		}*/
	}
}

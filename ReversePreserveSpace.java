
public class ReversePreserveSpace {
	public static void main(String[] args) {
		
		String name = "I am rohit";
		
		String rever = "";
		
		
		
		
		char[] input = name.toCharArray();
		
		char[] reve = new char[input.length];
		
		for (int i = 0; i < reve.length; i++) {
			if(input[i]==' ') {
				reve[i]=' ';
			}
		}
		
		
//		String[] name_spli = name.split("\\s");
//		int len_o = name.length()-1;
//		for (int i = 0; i <= name_spli.length-1; i++) {
//			int len = name_spli[i].length();
//			
//			System.out.println(len);
//			
//			for (int j = 0; j <= len-1; j++) {
//				if(name.charAt(len_o) != ' ') 
//					rever = rever+	name.charAt(len_o);
//					len_o--;
//				
//			}
//			rever = rever+ ' ';
//		}
//		
//		rever = rever.trim() + name.charAt(0);
//		System.out.println(rever);
//		
////		System.out.println(name.length());
////		int j = name.length()-1;
////		for (int i = 0; i < name.length(); i++) {
////			if (name.charAt(i) == ' ') {
////				rever = rever + ' ';
////			}
////			if (name.charAt(j)!= ' ') {
////			rever = rever + name.charAt(j);
////			}
//			j--;
//		}
//		
//		System.out.println(rever);
	}

}

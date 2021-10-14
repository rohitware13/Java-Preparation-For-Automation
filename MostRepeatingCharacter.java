package practice_24;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MostRepeatingCharacter {
	
	public static void main(String[] args) {
		
		
		String in = "rohit ware";
		
		
		HashMap<Character, Integer> map = new HashMap<>();
		
		for(char a : in.toCharArray()) {
			
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
		}
		
		int max = 0;
		
		char max_chara = ' ';
		
		Set<Entry<Character, Integer>> ha = map.entrySet();
		
		for(Entry<Character, Integer> ch:ha) {
			int max_char = ch.getValue();

			if(max_char > max) {
				max = max_char;
				max_chara = ch.getKey();
			}
		}
		System.out.println(max);

		System.out.println(String.valueOf(max_chara));
		
		
		Map<String, Integer> ma = new HashMap<String, Integer>();
		
		ma.put("test", 1);
		ma.put("test", 2);
		
		System.out.println(ma);
		
	}

}

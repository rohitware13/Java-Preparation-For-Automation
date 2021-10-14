package practice_24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxOccurance {

	
	public static void main(String[] args) {
		
		String input = "oheetwarr";
		
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		
		for(char ch : input.toCharArray()) {
			
			map.put(ch, map.get(ch) == null ? 1 : map.get(ch)+1);
		}
		
		
		Set<Entry<Character, Integer>> entry = map.entrySet();
		
	
		int max = 1;
		char a = ' ';
		
		for(Entry<Character, Integer> entry1 : entry) {
			
			if(entry1.getValue() <= max ) {
				
				max = entry1.getValue();
				a = entry1.getKey();
			}
		}
		
		System.out.println(max + " - " + a);
	}
}

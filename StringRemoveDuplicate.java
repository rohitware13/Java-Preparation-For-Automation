package practice_24;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringRemoveDuplicate {
	
	public static void main(String[] args) {
		
		String input = "asdfasd";
		
		
		//Using Set
		Set<Character> set = new LinkedHashSet<>();
		
		for(char ch : input.toCharArray()) {
			set.add(ch);
		}
		
		for (Character character : set) {
			System.out.print(character);
		}
		
		System.out.println("");
		
		//Using Map
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char ch : input.toCharArray()) {
			map.put(ch, map.get(ch) == null ? 1 : map.get(ch)+1);
		}
	
		Set<Entry<Character, Integer>> entry = map.entrySet();
		
		for (Entry<Character, Integer> character : entry) {
			System.out.print(character.getKey());
		}
		System.out.println("");

		
		
		//For Loop
		String non_dup = "";
		
		
		for(char ch : input.toCharArray()) {
			
			if(!non_dup.contains(String.valueOf(ch))) {
				non_dup += String.valueOf(ch);
			}
		}
		System.out.println(non_dup);
	}

}

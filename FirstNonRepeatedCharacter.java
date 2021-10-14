package practice_24;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCharacter {
	
	public static void main(String[] args) {
		
		String inp = "rohitwaeho";
		
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char ch: inp.toCharArray()) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			} else {
				map.put(ch, 1);
			}
		}
		
		for(Entry<Character, Integer> ch : map.entrySet()) {
			if(!(ch.getValue() > 1)) {
				System.out.println(ch);
				break;
			}
		}
	}

}

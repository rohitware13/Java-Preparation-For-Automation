import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{
	
	public static void main(String[] args) {
		
		String inpu = "aassbg";
		
		char[] count_char = new char[256];
		for (int i = 0; i < inpu.length(); i++) {
			count_char[inpu.charAt(i)]++;
		}
		
		int max_count = 0;
		
		char sa = ' ';
		
		// Traversing through the string and maintaining
        // the count of each character
        for (int i = 0; i < inpu.length(); i++) {
            if (max_count < count_char[inpu.charAt(i)]) {
                max_count = count_char[inpu.charAt(i)];
                sa = inpu.charAt(i);
            }
        }
      
        System.out.println(sa + ","+ max_count);    
        
	
	
        Map<Character, Integer> map = new HashMap<>();
        char[] chara = inpu.toCharArray();
        for(char ch : chara) {
        	if(map.containsKey(ch)) {
        		map.put(ch, map.get(ch)+1);
        	} else {
        		map.put(ch, 1);
        	}
        }
        
        int max= 0;
        char max_o = ' ';
        
        Set<Entry<Character, Integer>> entry = map.entrySet();
        
        for (Entry<Character, Integer> entry1 : entry) 
        	if(entry1.getValue() > max) {
        		
        		max = entry1.getValue();
        		max_o = entry1.getKey();
        		
        	}
        System.out.println(max + ","+ max_o);
        
        
        for (Entry<Character, Integer> entry1 : entry) 
        	if(entry1.getValue() < max) {
        		
        		max = entry1.getValue();
        		max_o = entry1.getKey();
        		
        	}
        System.out.println(max + ","+ max_o);
        
        }
	
	
		
	
	
		
	
}
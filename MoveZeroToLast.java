package practice_7;

import java.util.Arrays;

public class MoveZeroToLast {
	
	public static void main(String[] args) {
		
		int[] a = {1,0,7,0,-11,6,0};
		
		int counter = 0;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] != 0) {
				
				a[counter] = a[i];
				counter++;
			}
		}
		
		
		while(counter<a.length) {
			a[counter] = 0;
			counter++;
		}
		
		System.out.println(Arrays.toString(a));
	}

}

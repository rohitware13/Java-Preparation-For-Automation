package practice_24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumberArray {

	
	public static void main(String[] args) {
		int[] a = {1,2,3,4,6};
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];	
		}
		
		int all = 0;
		for (int i = 0; i <= a.length+1; i++) {
			all += i;
		}
		
		System.out.println(all);
		
		System.out.println("Missing - " + (all-sum));
		
		
		//Multiple in 1 to 20
		
		
		int[] b = {1,2,3,4,9,10,13,15,20};
		
		
		
		for (int i = 1; i < 20; i++) {
			
			int asd = Arrays.binarySearch(b, i);
			if(asd < 0) {
				System.out.print(i + ", ");
			}
			
		}
	}
}

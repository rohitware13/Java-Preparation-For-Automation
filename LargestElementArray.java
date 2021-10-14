package practice_24;

public class LargestElementArray {
	
	public static void main(String[] args) {
		
		int[] a = {4,5,6,7,4,11,45,43,67,89,6,54};
		
		
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}

}

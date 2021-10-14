import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProgram {
	
	public static void main(String[] args) {
		 int[] sample= {1,3,5,-1,-6,7};
		 
		 
		 ArrayList<Integer> mainlist = new ArrayList<>();

		 ArrayList<Integer> temp = new ArrayList<>();
		 
		 for (int i = 0; i < sample.length; i++) {
			if (sample[i] < 0) {
				temp.add(sample[i]);
			}
			else {
				mainlist.add(sample[i]);
			}
			
		}
		
		mainlist.addAll(temp);
		
		System.out.println(mainlist);
	}

}

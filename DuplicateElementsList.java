
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsList {

	
	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<>();//['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0, 1, 2, 3, 4];
		
		 int list[] = {1,4,3,5,6,1,3,1};

		System.out.println("Input list : " + list);
		duplicateEleSet(list);
		
		duplicateEleLoop(list);
		
	}
	
	static void duplicateEleSet(int list[]) {
		
		Set<Integer> map= new LinkedHashSet<>();
		for (int ele : list) {
			if(!map.add(ele)) {
				map.add(ele);
			}
		}
		
		
	}
	
	static void duplicateEleLoop(int list[]) {
		
		ArrayList<Integer> duplist = new ArrayList<>();
		for (int i = 0; i < list.length; i++) {
			for (int j = i+1; j <= list.length-1; j++) {
				if(list[i]==list[j]) {
					duplist.add(list[i]);
				}
			}
		}
		System.out.println(duplist);
	}
}

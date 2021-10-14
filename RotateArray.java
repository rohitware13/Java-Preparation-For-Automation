import java.util.PriorityQueue;
import java.util.Queue;

public class RotateArray {

	public static void main(String[] args) {
		int arr[] = {11, 15, 26, 38, 9, 10};
		int d = 35;
		queuePrint();
	}

	static void rotateArrayByInput(int arr[], int d){
		for (int j = 0; j < d; j++) {
			int temp = arr[0];
			for (int i = 0; i < arr.length-1; i++) {
				arr[i]=arr[i+1];

			}
			arr[arr.length-1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}


	static void rotateArrayByCycle(int arr[]){
		for (int j = 0; j < arr.length-1; j++) {
			int temp = arr[j];
			arr[j] = arr[arr.length-1];
			arr[arr.length-1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	static void findElementInArr(int arr[], int d){
		boolean flag = false;
		for (int i = 0; i <= arr.length-1; i++) {
			if (arr[i] == d) {
				flag = true;
				System.out.println("Index - " + i);
			}	
		}
		if (!flag) {
			System.out.println("Not found");
		}
	}

	static void findElementsWithSum(int arr[], int d){
		for (int j = 0; j < arr.length; j++) {
			for (int i = j; i < arr.length-1; i++) {

				if(arr[j]+ arr[i+1] == d) {
					System.out.println("Elemeents are ->" + arr[j] +" , " + arr[i+1]);
				}
			}	
		}
	}

	static void findElementsLowest(int arr[]){
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i; j <= arr.length-1; j++) {		
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}			
		}			
	}

	static void queuePrint() {
		// Creating empty priority queue
		Queue<String> str_queue
		= new PriorityQueue<String>();

		// Adding items to the pQueue
		// using add()
		str_queue.add("one");
		str_queue.add("three");
		str_queue.add("two");
		str_queue.add("four");

		// Printing the top element of
		// the PriorityQueue
		System.out.println(str_queue.peek());

		// Printing the top element and removing it
		// from the PriorityQueue container
		System.out.println(str_queue.poll());
		System.out.println(str_queue);

		// Printing the top element again
		System.out.println(str_queue.peek());
	}

}

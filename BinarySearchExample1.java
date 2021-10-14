import java.util.Arrays;

public class BinarySearchExample1 {
	public static int binarySearch(int arr[], int first, int last, int key) {
		if (last >= first) {
			int mid = first + (last - first) / 2;
			if (arr[mid] == key) {
				return mid;
			}
			if (arr[mid] > key) {
				return binarySearch(arr, first, mid - 1, key);// search in left subarray
			} else {
				return binarySearch(arr, mid + 1, last, key);// search in right subarray
			}
		}
		return -1;
	}

	public static void main(String args[]) {
		int arr[] = { 20, 10, 40, 30, 50 };
		Arrays.sort(arr);
		int key = 300;
		int last = arr.length - 1;
		int result = binarySearch(arr, 0, last, key);
		if (result == -1)
			System.out.println("Element is not found!");
		else
			System.out.println("Element is found at index: " + result);
	}
}
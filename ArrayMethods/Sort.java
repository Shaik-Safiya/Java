import java.util.Arrays;
public class Sort {
	public static void main(String[] args) {
	        int[] numbers = { 5, 2, 8, 1, 9 };
	        Arrays.sort(numbers);
	        System.out.println("Sorted array in ascending order: " + Arrays.toString(numbers));
	        Arrays.sort(numbers);
	        reverseArray(numbers);
	        System.out.println("Sorted array in descending order: " + Arrays.toString(numbers));
	    }
	    public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        while (start < end) {
	            int temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	}
}

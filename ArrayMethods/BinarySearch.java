import java.util.Arrays;
public class BinarySearch {
	public static void main(String[] args) {
		        int[] numbers = { 2, 5, 8, 12, 18, 23, 30 };
		        int searchKey = 12;
		        int index = Arrays.binarySearch(numbers, searchKey);
		        if (index >= 0) {
		            System.out.println("Number " + searchKey + " found at index " + index);
		        } else {
		            System.out.println("Number " + searchKey + " not found in the array.");
		        }  
	}

}

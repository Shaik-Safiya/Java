
public class ToString {
	public static void main(String[] args) {
		        int[] numbers = { 2, 4, 6, 8, 10 };

		        String arrayAsString = arrayToString(numbers);

		        System.out.println("The array as a string: " + arrayAsString);
		    }

		    public static String arrayToString(int[] arr) {
		        StringBuilder sb = new StringBuilder();
		        sb.append("[");
		        for (int i = 0; i < arr.length; i++) {
		            sb.append(arr[i]);
		            if (i < arr.length - 1) {
		                sb.append(", ");
		            }
		        }
		        sb.append("]");
		        return sb.toString();
    }
}


import java.util.Arrays;
public class Fill {
	    public static void main(String[] args) {
	        int[] numbers = new int[5];
	        int fillValue = 10;
	        Arrays.fill(numbers, fillValue);
	        System.out.println("Array after filling: " + Arrays.toString(numbers));
	    }
}

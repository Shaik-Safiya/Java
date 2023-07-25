import java.util.Scanner;
public class IfElse {
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter a Number");
	        int num = scan.nextInt();
	        if (num > 0) {
	            System.out.println("Number is positive ");

	            if (num % 2 == 0) {
	                System.out.println("Number is even ");
	            } 
	            else 
	            {
	                System.out.println("Number is odd ");
	            }
	        } 
	        else
	        {
	            System.out.println("Number is Negative ");
	        }
	    }
}

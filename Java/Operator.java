import java.util.Scanner;
public class Operator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int a = scan.nextInt();
		int b = scan.nextInt();
		OperatorApp op = new OperatorApp();
		int c = op.add(a,b);
		System.out.println("Addition :"+c);
		int d = op.sub(b,a);
		System.out.println("Subtraction :"+d);
		int e = op.mul(a,b);
		System.out.println("Multiplication :"+e);
		int f = op.div(b,a);
		System.out.println("Division :"+f);
		int g = op.mod(a, b);
		System.out.println("Remainder :"+g);
		
		
		
	}

}
 
		
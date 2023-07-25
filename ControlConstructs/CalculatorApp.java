import java.util.Scanner;
public class CalculatorApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello User Welcome to Kodnest Calculator");
Calculator c=new Calculator();
		do {
			System.out.println("+ is addition");
			System.out.println("- is subtraction");
			System.out.println("* is multiplication");
			System.out.println("/ is division");
			System.out.println("% is findremainder");
			System.out.println("^ is find square");
			System.out.println(" ! is stop");
			System.out.println("select your choice");
			char opt=scan.next().charAt(0);
			switch(opt) {
			case '+':
				System.out.println("enter num1 and num2");
				int num1=scan.nextInt();
				int num2=scan.nextInt();
				c.addition(num1,num2);
				break;
			case '-':
				System.out.println("enter num1 nad num2");
				int n1=scan.nextInt();
				int n2=scan.nextInt();
				c.subtraction(n1,n2);
				break;
			case '*':
				System.out.println("enter num1 nad num2");
				int num11=scan.nextInt();
				int num21=scan.nextInt();
				c.multiplication(num11,num21);
				break;
			case '/':
				System.out.println("enter num1 nad num2");
				int num111=scan.nextInt();
				int num211=scan.nextInt();
				c.division(num111,num211);
				break;
			case '%':
				System.out.println("enter num1 nad num2");
				int num1111=scan.nextInt();
				int num2111=scan.nextInt();
				
				c.findrem(num1111,num2111);
				break;
			case '^':
				System.out.println("enter  a number");
				int num=scan.nextInt();
				c.findsquare(num);
				break;
			case'!':
				System.out.println("stop");
				return;
			default:
				System.out.println("see the message carefully");
				}
		}while(true);
	}
}



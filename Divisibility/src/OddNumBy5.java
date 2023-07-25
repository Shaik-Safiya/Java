import java.util.Scanner;
public class OddNumBy5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n");
		int n=scan.nextInt();
		printOddDivisibleBy5(n);
	}
	public static void printOddDivisibleBy5(int n)
	{
		for(int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}

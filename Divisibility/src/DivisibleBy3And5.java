import java.util.Scanner;
public class DivisibleBy3And5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		displayDivisibleBy3And5(n);
	}
	public static void displayDivisibleBy3And5(int n)
	{
		for(int i=0;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}

import java.util.Scanner;
public class DivisibleBy5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int N=scan.nextInt();
		displayDivisibleBy3(N);
	}
		public static void displayDivisibleBy3(int n)
		{
			for(int i=0;i<=n;i++)
			{
				if(i%5==0)
				{
					System.out.println(i);
				}
			}
		
		}
}

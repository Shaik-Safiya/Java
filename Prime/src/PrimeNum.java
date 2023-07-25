import java.util.Scanner;
public class PrimeNum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number to check for Prime");
		int n=scan.nextInt();
		boolean isPrime=false;
		if(n<2)
		{
			System.out.println("Entered Number "+n+" is not Prime");
		}
		else
		{
			for(int i=2;i*i<=n;i++)
			{
				if(n%i!=0)
				    isPrime=true;
					break;
			}
			if(isPrime==true)
			{
				System.out.println("Entered Number "+n+" is Prime");
			}
			else
			{
				System.out.println("Entered Number "+n+" is not Prime");
			}
		}
	}
}

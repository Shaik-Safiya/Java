import java.util.Scanner;
public class Main {
	public static void checkMultipleOfTen(int n,int m)
	{
	   if(n%m==0) 
	   {
		   System.out.println("Entered Number "+n+" Is Multiple of 10 "+m);
	   }
	   else
	   {
		   System.out.println("Entered Number "+n+" Is Not Multiple of 10 "+m);
	   }
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 2 Numbers");
		int n=scan.nextInt();
		int m=scan.nextInt();
		checkMultipleOfTen(n,m);
	}
}

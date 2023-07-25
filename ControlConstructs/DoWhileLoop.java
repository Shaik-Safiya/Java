import java.util.Scanner;
public class DoWhileLoop {
	public static void main(String []args)
	{
		Scanner scan = new Scanner(System.in);
		int pageno=100;
		boolean bored=true;
		int i=1;
		do {
			System.out.println("KodWoman read page "+i);
			i++;
			System.out.println("Do You Want to Continue ?");
			bored=scan.nextBoolean();
		}while(bored);
	}

}

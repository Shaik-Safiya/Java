import java.util.Scanner;
public class BooleanArray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter people count");
		boolean arr[]=new boolean[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Is Person "+i+" Married? ");
			arr[i]=scan.nextBoolean();
		}
		System.out.println("Array Contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("person "+i+" married "+arr[i]);
		}

	}

}

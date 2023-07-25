import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		float []arr=new float[7];
		System.out.println("Array Elements are...");
		for(int i=0;i<=arr.length-1;i++) 
		{
			System.out.println("Enter the height of player "+i);
			arr[i]=scan.nextFloat();
		}
		System.out.println("Array Contents are...");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i]+" ");
		}

	}

}

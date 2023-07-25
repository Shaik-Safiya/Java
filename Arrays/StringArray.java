import java.util.Scanner;
public class StringArray {
	public static void main(String []args) {
		Scanner scan=new Scanner(System.in);
		String []arr=new String[10];
		System.out.println("Enter Array Elements....");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter the name of the employee"+i);
			arr[i]=scan.next();
		}
		System.out.println("Array Contents are....");
		for(int i=0;i<=arr.length-1;i++)
		{
		System.out.println(arr[i]+" ");
		}
	}

}

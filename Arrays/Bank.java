import java.util.Scanner;
public class Bank {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st D Length");
		String arr[][] =new String[scan.nextInt()][];
for(int i=0;i<=arr.length-1;i++)
{
	System.out.println("Enter 2nd D Length for 1st D "+i);

    arr[i]=new String[scan.nextInt()];
}
		scan.nextLine();
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter Name Of Bank "+i+" Customer "+j);
				arr[i][j]=scan.nextLine();
			}
		}
		System.out.println("Array Contents Are.....");
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.print(arr[i][j]+" ");
				
			}
			System.out.println();
		}
	
	}
}

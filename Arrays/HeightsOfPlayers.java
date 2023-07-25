import java.util.Scanner;
public class HeightsOfPlayers {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Rows and Columns where Rows = no of games . Columns=no of Players");
		float arr[][]=new float[scan.nextInt()][scan.nextInt()];
		for (int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println("Enter Heights of Game "+i+ " Player "+j);
				arr[i][j]=scan.nextFloat();
			}
		}
		System.out.println("Array Contents Are....");
		for (int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=arr[i].length-1;j++)
			{
				System.out.println(arr[i][j]+" ");
			}
		
			System.out.println();
		}

	}
}



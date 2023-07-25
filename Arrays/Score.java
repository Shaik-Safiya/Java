import java.util.Scanner;
public class Score {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1D Length");
		int arr[][]=new int[scan.nextInt()][];
		for(int i=0;i<=arr.length-1;i++)
		{
		  System.out.println("Enter Length of 2D Length for 1D "+i);
		  arr[i]=new int[scan.nextInt()];
		}
		for(int i=0;i<=arr.length-1;i++)
		{
		  for(int j=0;j<=arr[i].length-1;j++)
		  {
		    System.out.println("Enter The Score of Game "+i+"Player "+j);
		    arr[i][j]=scan.nextInt();
		  }
	    }
		System.out.println("Scores of Players in the Game");
		for(int i=0;i<=arr.length-1;i++)
		{
		  for(int j=0;j<=arr[i].length-1;j++)
		  {
		    System.out.print(arr[i][j]+" ");
		  }
		}
		System.out.println();
	}
}

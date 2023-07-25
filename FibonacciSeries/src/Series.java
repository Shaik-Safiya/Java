import java.util.Scanner;
public class Series {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter n to print the number in the series");
		int n=scan.nextInt();
		SeriesApp series=new SeriesApp();
		series.fibonacciSeries(n);
	}
}

import java.util.Scanner;
public class TemparatureApp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter celcius");
		int celcius = scan.nextInt();
		Temparature t = new Temparature();
		t.temp(celcius);
		
	}
	

}

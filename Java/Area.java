import java.util.Scanner;
public class Area {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two numbers");
		int l = scan.nextInt();
 		int b = scan.nextInt();
 		AreaApp ar = new AreaApp();
 		ar.areaOfRectangle(l, b);
	}

}

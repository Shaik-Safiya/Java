import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Number Of SidesTo Identify The Shape");
		int sides=scan.nextInt();
		identifyPolygon(sides);
		}
	public static void identifyPolygon(int sides) {
		switch(sides)
		{
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Quadilateral");
			break;
		case 5:
			System.out.println("Pentagon");
			break;
		case 6:
			System.out.println("Hexagon");
			break;
			default:
				System.out.println("Polygon");
				break;
			}
	}
}

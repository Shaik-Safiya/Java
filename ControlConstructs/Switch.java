import java.util.Scanner;
public class Switch {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter 1 or 2 or 3 or 4 or 5 or 6 or 7 days");
   int week = scan.nextInt();
   switch(week)
   {
   case 1:
	   System.out.println("Super Sunday");
		break;
   case 2:
	   System.out.println("Boring Monday");
		break;
   case 3:
	   System.out.println("Headche Tuesday");
		break;
   case 4:
	   System.out.println("Wonderful Wednesday");
		break;
   case 5:
	   System.out.println("Thoughtful Thursday");
		break;
   case 6:
	   System.out.println("Exciting Friday");
		break;
   case 7:
	   System.out.println("Enjoying Saturday");
		break;
   default :
		System.out.println("Stupid!How Many Days You Have in a Week");
	}

   }
}

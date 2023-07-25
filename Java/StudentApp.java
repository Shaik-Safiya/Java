
import java.util.Scanner;
public class StudentApp {
	public static void main(String[] args) {
		Student st = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student age");
		int age = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter name of the student");
		String name = scan.next();
		System.out.println(st.age=age);
		System.out.println(st.name=name);
	}

}

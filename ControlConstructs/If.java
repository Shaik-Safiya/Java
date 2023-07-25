import java.util.Scanner;
public class If {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Student Score in a Subject");
		int score = scan.nextInt();
		if(score>40){
			System.out.println("Student got Pass Marks");
			if(score>70){
			  System.out.println("Student got Distinction Score");
			}
		}
	}
}

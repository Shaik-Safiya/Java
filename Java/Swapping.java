
public class Swapping {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c;
		System.out.println("Before Swapping");
		System.out.println(a + " " + b);
	    a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swapping");
		System.out.println(a + " " + b);
	}

}

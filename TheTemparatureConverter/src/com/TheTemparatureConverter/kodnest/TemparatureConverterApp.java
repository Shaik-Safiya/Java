package com.TheTemparatureConverter.kodnest;
import java.util.Scanner;
public class TemparatureConverterApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter temp in F");
		double f=scan.nextDouble();
		TemparatureConverter temparatureConverter=new TemparatureConverter();
		System.out.printf("%.2f",temparatureConverter.convertFahrenheitToCelsius(f));

	}

}

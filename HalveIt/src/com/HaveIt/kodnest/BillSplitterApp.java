package com.HaveIt.kodnest;
import java.util.Scanner;
public class BillSplitterApp {
	public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
          double half = BillSplitter.halveTheNumber(150.0);
          System.out.printf("%.2f%n", half);
	}
}

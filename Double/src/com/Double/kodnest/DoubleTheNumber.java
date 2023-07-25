package com.Double.kodnest;
import java.util.Scanner;
public class DoubleTheNumber {
	public static void main(String []args)
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(DoubleTheNumber(num));
	}
	public static int DoubleTheNumber(int num) 
	{
		return num*2;
	}
 }

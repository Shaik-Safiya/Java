package com.kodnest.patterns.practicepatterns;
public class Pattern19 {
	public static void main(String[] args) {
	    for(int i=0;i<=5;i++) {
	    for(int j=0;j<=5/2; j++) {
	    if((j==0 || j==5/2) && i!=0 || i == 0  && j!=5/2 || i==5/2)
	    System.out.print("*");
	    else
	    System.out.print(" ");
	    }
	    System.out.println();
	    }
	}
}

package com.kodnest.patterns.practicepatterns;
public class Pattern14 {
	public static void main(String[] args) {
		int count=1;
        for(int i=1;i<=5;i++) {
            for(int j=1;j<=5-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++) {
                System.out.print((char)(64 + count++));
            }
            System.out.println();
        }
	}
}

package com.kodnest.patterns.practicepatterns;
public class Pattern4 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
            for(int j=5;j>i;j--) {
                System.out.print(" ");
            }
            for(char ch='A';ch<'A'+i;ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
	}
}

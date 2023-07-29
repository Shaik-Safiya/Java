package com.kodnest.patterns.practicepatterns;
public class Pattern10 {
	public static void main(String[] args) {
		 for(int i=1;i<=5;i++) {
	            for(int j=1;j<i;j++) {
	                System.out.print(" ");
	            }
	            System.out.print(i);
	            for(int k=1;k<=2*(5-i)-1;k++) {
	                System.out.print(" ");
	            }
	            if(i!=5) {
	                System.out.print(i);
	            }
	            System.out.println();
	        }
	        for(int i=5- 1;i>=1;i--) {
	            for(int j=1;j<i;j++) {
	                System.out.print(" ");
	            }
	            System.out.print(i);
	            for(int k=1;k<=2*(5-i)-1;k++) {
	                System.out.print(" ");
	            }
	            if(i!=5) {
	                System.out.print(i);
	            }
	            System.out.println();
	      }
	}
}

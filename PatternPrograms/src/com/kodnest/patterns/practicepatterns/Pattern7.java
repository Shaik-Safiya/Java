package com.kodnest.patterns.practicepatterns;
public class Pattern7 {
	public static void main(String[] args) {
		 for(int i=0;i<5;i++) {
	            int num=1;
	            for(int j=0;j<=i;j++) {
	                System.out.print(num);
	                num=num*(i-j)/(j+1);
	            }
	            System.out.println();
	        }
	}
}

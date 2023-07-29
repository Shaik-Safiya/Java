package com.kodnest.patterns.practicepatterns;
public class Pattern24 {
	public static void main(String[] args) {
		 for(int i=1;i<=6;i++)
		 {
		        for(int j=i;j<=6;j++)
		        {
		            System.out.print("*");
		        }
		        for(int j=1;j<=(2*i-1);j++)
		        {
		            System.out.print(" ");
		        }
		        for(int j=i;j<=6;j++)
		        {
		            System.out.print("*");
		        }
		 
		        System.out.println();
		    }
		 for(int i=1;i<=6;i++)
		    {
		        for(int j=1;j<=i;j++)
		        {
		            System.out.print("*");
		        }
		        for(int j=(2*i-2);j<(2*6-1); j++)
		        {
		            System.out.print(" ");
		        }
		 
		        for(int j=1; j<=i; j++)
		        {
		            System.out.print("*");
		        }
		 
		        System.out.println();
	       } 
	}
}

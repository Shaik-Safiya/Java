package com.kodnest.patterns.practicepatterns;
public class Pattern21 {
	public static void main(String[] args) {
		for(int i=1;i<=5*2-1;i++)
        {
            if(i==1 || i==5 || i==5*2-1)
            {
                for(int j=1; j<=5; j++)
                {
                    if(j==1 || j==5)
                        System.out.print(" ");
                    else
                        System.out.print("*");
                }
            }
            else
            {
                for(int k=1;k<=5;k++)
                {
                    if(k==1 || k==5)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
            }
            System.out.println();
        }
	}
}
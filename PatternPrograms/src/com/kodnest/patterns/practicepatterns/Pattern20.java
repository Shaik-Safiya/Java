package com.kodnest.patterns.practicepatterns;
public class Pattern20 {
	public static void main(String[] args) {
        for(int i=1;i<=(5*2-1);i++)
        {
            if(i==5)
            {
                for(int j=1;j<=(5*2-1);j++)
                {
                    System.out.print("*");
                }
            }
            else
            {
                for(int k=1;k<=5-1;k++)
                {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
	}
}

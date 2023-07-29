package com.kodnest.patterns.practicepatterns;
public class Pattern26 {
	public static void main(String[] args) {
		for(int i=1;i<9+1;i++)  
		{  
		for(int j=i;j<9+1;j++)  
		{  
		System.out.print(j+" ");  
		}  
		for(int k=1;k<i;k++)  
		{  
		System.out.print(k+" ");  
		}  
		System.out.println();  
		}  
	}
}

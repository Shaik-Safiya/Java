package com.kodnest.patterns.practicepatterns;
public class Pattern9 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
            int num=i;
            for(int j=1;j<=i;j++) {
                System.out.print(num);
                num++;
            }
            num=num-2;
            for(int k=1;k<i;k++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }
	}
}

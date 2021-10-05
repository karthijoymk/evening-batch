package org.one;

public class Default {
	public static void main(String[] args) {
		int a=6451,b,c=0;
		while (a>0) {
			b=a%10;
			c=(c*10)+b;
			a=a/10;
			System.out.println(c);
			
		}
	}

}

package com.selenium.task;

public class Practise_4 {

	public static void main(String[] args) {

//Fibanocci series; --> 0,1,1,2,3,5,8,13...
		
		int a = 0, b = 1, c;
		
		System.out.println(a); //a=0;
		System.out.println(b); //b=1;
		
		for (int i = 1; i <= 3; i++) {
			
			c = a+b;   //c=0+1;=1;  1+1;=2;   1+2=3;      2+3=5;
			a = b;     //a=1;       a=1;      a=2;        a=3;
			b = c;     //b=1;       b=2;      b=3;        b=5;
			
		System.out.println(c);
			
		}
	}
}
package com.selenium.task;

public class Practise_6 {

	public static void main(String[] args) {

//Factorial of a number; 3 = 3*2*1;
		
		int n = 3;
		int fact = 1;   //temp variable;  1 will be constant for all factors; 2*1; 3*2*1; 4*3*2*1;
		
		for (int i = 1; i <= n; i++) {      //i=1; 1<=3; true;       //i=2; 2<=3; true;    //i=3;3<=3;true;
			                                   //fact=1*1=1;            //fact=2*1=2;        //fact=3*2=6;
			fact=fact*i;
		}
	System.out.println(fact);
	}
}
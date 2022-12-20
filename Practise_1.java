package com.selenium.task;
public class Practise_1 {

//Swapping 2 numbers;
	public static void main(String[] args) {
		
		int i = 10;
		int j = 20;
		int k ;
		
	System.out.println("i : " + i);
	System.out.println("j : " + j);

System.out.println("-------------------------");
	
//Swap using 3rd variable;
		
		k = i; k=10;
		i = j; i=20;
		j = k; j=k=10;
		
	System.out.println("i : " + i);
	System.out.println("j : " + j);
	
System.out.println("-------------------------");	
	
//Swap without 3rd variable;
	
	i = i+j;
	j = i-j;
	i = i-j;
	
    System.out.println("i : " + i);
    System.out.println("j : " + j);
	
	}
}
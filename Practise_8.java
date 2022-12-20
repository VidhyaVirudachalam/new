package com.selenium.task;

public class Practise_8 {

	public static void main(String[] args) {
		
//Nested for loop;	
		
		int sum = 0;
		
		for (int i = 1; i <= 5; i++) {
			
             for (int j = 1; j <=i; j++) {
				
            	 System.out.print(j + " ");
			}
//As like Reverse String;         
             
             sum = sum+i;
             
             System.out.println(sum);
             
System.out.println();
		}
	}
}
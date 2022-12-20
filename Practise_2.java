package com.selenium.task;

public class Practise_2 {
	
//Reverse a string ;
	public static void main(String[] args) {

		String s = "VIDHYA";   // length() = 5; index -> length()-1 = 4;
		String s1 = "";
		String s2 ="";
		
  System.out.println("s : " + s);
  
//Printing from last index;	
	for (int i = s.length()-1; i >= 0 ; i--) {
		
		s1 = s1 + s.charAt(i);
	}
	
  System.out.println("s1 : " + s1);
  
//Printing from 1st index;		
  for (int j = 0; j <= s.length()-1 ; j++) {
	  
	  s2 =  s2 + s.charAt(j);
	  
  }
  
  System.out.println("s2 : " + s2);
  
	}
}
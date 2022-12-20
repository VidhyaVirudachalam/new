package com.selenium.task;

public class Length_Without_Space {

//Finding the length of the given string excepting spaces(not including spaces);
	
	public static void main(String[] args) {

		String s = "As it was";           //length with spaces = 9;
		                                  //length without spaces = 7;
		
		int total = 0;                    //storing 0 value in total(local variable);
		
//using replace("target","replacement");		
		String s1 = s.replace(" ", "");   //replacing spaces using string method;
		                                  //storing length in s1;
		int length = s1.length();         //getting length of s1;
		System.out.println(length);       //print length;
		
System.out.println("----------------------------");

//using split(" ");
//as like reverse string;	
       String[] s2 = s.split(" ");        //spliting words in string using split(" ");
       for (String each : s2) {           //forEach loop --> check and get every word;
    	   total = total + each.length();   //storing each word length in total;
    	   System.out.println(total);
	}
System.out.println("----------------------------");
       System.out.println(total);
  }
}
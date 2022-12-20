package com.selenium.task;

public class Practise_5 {

	public static void main(String[] args) {

//Palindrome;
	//Reverse a string and checks the condition;
	//for loop and if loop;
		
		String s = "madam";
		String s1 = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			
			s1 = s1+s.charAt(i);
		}
System.out.println(s1);
		
	if (s.equals(s1)) {
		
		System.out.println("s1 is palindrome");
	}
	else {
		System.out.println("s1 is not palindrome");
	}
  }
}
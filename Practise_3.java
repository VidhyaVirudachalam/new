package com.selenium.task;

public class Practise_3 {

	public static void main(String[] args) {
		
		String a = "data";
		String b = "flow";
		String c;
		
	    a = a+b;                                    //a=dataflow;  length(a)=8;
		b = a.substring(0,a.length()- b.length());  //b=data;      length(a-b)=8-4;=4;  from this to this length;
		a = a.substring(b.length());                //a=flow;      length(b)=4;         from this length;
	
	System.out.println(a+b);
		
System.out.println("-------------------------");

		c=a+b;    //c=flow+data;flowdata;          //a=flow;
		                                           //b=data;
	System.out.println(c);

System.out.println("-------------------------");
		
	    c = a+b;  //c = flowdata;
	    a = b;    //a = data;
	    b = c ;   //b = flowdata;

	System.out.println(c);
	}
}
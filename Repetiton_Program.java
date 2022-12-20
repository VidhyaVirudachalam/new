package com.selenium.task;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;  //Entry has seperate import;
import java.util.*;          //using java.util.* ---> to import all;
public class Repetiton_Program {
//Repetition of words in a string program;
	public static void main(String[] args) {
		String s = "Newton's first law of motion predicts the behavior of objects for which all existing forces are balanced."
				+ "The first law - sometimes referred to as the law of inertia - states that if the forces acting upon an object are balanced,"
				+ "then the acceleration of that object will be 0 m/s/s."
				+ "Objects at equilibrium (the condition in which all forces balance) will not accelerate."
				+ "According to Newton, an object will only accelerate if there is a net or unbalanced force acting upon it."
				+ "The presence of an unbalanced force will accelerate an object - changing its speed, its direction,"
				+ "or both its speed and direction.";
		String[] seperate = s.split(" ");
//using split(" "); --> to get every word splitted after space;
//Return type --. String of array(String[])
//String[]-->String has one or more words under same refName;
		Map<String,Integer> m = new LinkedHashMap<>();            //here,m is Empty;
//Declaring Map; <key,value>=1 Entry;
//LinkedHashMap --> To print in insertion order;
	//ForEach loop --> Value based and to check and print each and every value;
	   //if block --> to check the condition;
		for(String each : seperate)
		{
		      if(m.containsKey(each))   //containsKey --> checks whether that value is present in map or not;
		      {
		              Integer value = m.get(each);     //get(key) --> getting value by giving key;
		              m.put(each,value+1);             //value getting iterated;
		      }
		      else {
		        m.put(each,1);           
		       } 
        }
//entryset()-->to iterate the map;
		//ForEach loop --> Value based and to check and print each and every value;
		   //if block --> to check the condition;
		Set<Entry<String,Integer>> entrySet = m.entrySet();
		for(Entry<String,Integer> every_entry : entrySet)
		{
			if(every_entry.getValue()>1)              //if value > 1 --> prints key and value set;
			{
				System.out.println(every_entry);
			}
		}
	}
}//I am vidhya and I am from chennai;
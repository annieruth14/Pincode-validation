package com.bridgelabz.pattern.pincode;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pincode {

   public boolean checkPattern(String name) {
	   boolean result = false;
	   String pattern = "^([\s]?[0-9]){6}$";
	   
	   // Create a Pattern object
	   Pattern r = Pattern.compile(pattern);

	   // Now create matcher object.
	   Matcher m = r.matcher(name);
	   if (m.find())
		   	result = true;
	   else 
		   result = false;
	   
	   return result;
   }
	
	
	public static void main( String args[] ) {
	   Scanner sc = new Scanner(System.in);
       Pincode obj = new Pincode();
       System.out.println("Enter pin");
       String value = sc.nextLine();
       Boolean ans = obj.checkPattern(value);
       System.out.println(ans);
   }
}
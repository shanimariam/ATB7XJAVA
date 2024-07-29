package ex_20072024;

import java.util.Scanner;
 
public class Lab050 {
public static void main(String[] args) 
{
	
	//leap year
	
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter an year to check if its leap year or not");
	        int year = sc.nextInt();
	 
	        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) 
	        {
	 	            System.out.println(year + " : Leap Year");
	        }
	 
	        else 
	        {
	            System.out.println(year + " : Non - Leap Year");
	        }
	    }
}
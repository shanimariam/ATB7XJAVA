package ex_20072024;

import java.util.Scanner;

public class Lab049 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the limit");
	int limit=sc.nextInt();	
	
	for(int i=1;i<=limit;i++)
	{
		if(i%3==0) //multiple of three
		{	
			System.out.println("Number " + i+ " Fizz");
		}
		else if(i%5==0) //multiple of 5
		{
			System.out.println("Number " +i+ " Buzz");
		}
		else if(i%3==0 && i%5==0)
		{
			System.out.println("Number " +i+" FizzBuzz");
		}
		else
		{
			System.out.println("Number " +i+" Not mutltiples");
		}
		
	}
}
}

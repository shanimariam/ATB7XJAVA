package ex_20072024;

import java.util.Scanner;

public class Lab048 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the alphabet to check");
	char alpha=sc.next().charAt(0)	;
	
	if(alpha=='a'||alpha=='e'||alpha=='i'|| alpha=='o'||alpha=='u')
	{
		System.out.println("Vowel");
	}
	else
	{
		System.out.println("Consenant");
	}
	sc.close();
}
}

package ex_20072024;

import java.util.Scanner;

public class Lab043 {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number integer");
	int num1=sc.nextInt();
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	
	if(num1>=num2)
	{
		System.out.printf("%d is greater",num1);
		
	}
	else
	{
		System.out.printf("%d is greater",num2);
	}
	}
}

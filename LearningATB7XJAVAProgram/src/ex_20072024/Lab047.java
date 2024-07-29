package ex_20072024;

import java.util.Scanner;

public class Lab047 {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number 1");
	int num1=sc.nextInt();
	System.out.println("Enter the number 2");
	int num2=sc.nextInt();
	System.out.println("Enter the number 3");
	int num3=sc.nextInt();
	
	//num1>=num2 and num1>=num3 ---num1
	//num2>=num1 and num2>=num3--num2
	//num3

	if(num1>=num2 && num1>=num3)
	{
		System.out.printf("%d is greater",num1);
	}
	else if(num2>=num1 && num2>=num3)
	{
		System.out.printf("%d is greater",num2);
	}
	else
	{
		System.out.printf("%dis greater",num3);
	}
	
	
}
}

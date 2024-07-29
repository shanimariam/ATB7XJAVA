package ex_20072024;
import java.util.Scanner;
public class Lab042 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number and verify of its even or odd");
	int num=sc.nextInt();
	if(num%2==0)
	{
		System.out.println("Even number");
	}
	else
	{
		System.out.println("Odd number");
	}
	
}
}

package ex_20072024;

import java.util.Scanner;

public class Lab045 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String name=sc.nextLine();
		
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		System.out.println("Enter the salary");
		double salry=sc.nextDouble();	
		
		
		System.out.println("NAME"+name);
		System.out.println("AGE"+age);
		System.out.println("Salary"+salry);
		
		sc.close();
	}

}

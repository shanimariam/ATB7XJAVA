package ex_20072024;
import java.util.Scanner;

public class Lab041 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num1=sc.nextInt();
		if(num1>=18)
		{
			System.out.println("Eligible for voting");

		}
		else
		{
			System.out.println("Not eligibel for voting");
		}
		System.out.println("Loop ends");

	}

}

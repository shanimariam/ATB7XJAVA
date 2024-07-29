package ex_20072024;
import java.util.Scanner;

public class Lab044 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char alphabet=sc.next().charAt(0);
		
		switch(alphabet)
		{
		case 'a':
			System.out.println("Vowe");
			break;
		case 'e':
			System.out.println("Vowe");
			break;
		case 'i':
			System.out.println("Vowe");
			break;
		case 'o':
			System.out.println("Vowe");
			break;
		case 'u':
			System.out.println("Vowe");
			break;
		default : System.out.println("Not vowel");
				  break;
		}
		
		sc.close();

	}

}

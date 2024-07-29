package ex_13072024;

public class Lab029 
{
	public static void main(String[] args) {
		
		int a=12;
		boolean b=!(a>10 || a<5);
		System.out.println(b);
		
		//replace the value and check it
		/*
		 *  b=!(12>10 || 12<5)
		 *  b=!(true || false)
		 *  b=!(true)
		 *  b=false
		 */
	}

}

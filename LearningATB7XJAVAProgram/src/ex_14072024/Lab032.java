package ex_14072024;

public class Lab032 
{
	public static void main(String[] args) {
		
		String s1=new String("shani");
		//String s2=new String("shani"); 
		String s3="shani";
		String s4="shani";
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(s1==s3);//location different so false
		System.out.println(s1.equals(s4)); //content same true
		
		//3
	}

}

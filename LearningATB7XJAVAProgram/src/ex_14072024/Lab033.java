package ex_14072024;

public class Lab033 {
public static void main(String[] args) {
	
	String s1=new String("shani");
	String s2=new String("shani");//new always create a new memory
	
	String s3="shani";
	String s4="shani";
	
	System.out.println(s1==s2);//false
	System.out.println(s3==s4);//true
}
}

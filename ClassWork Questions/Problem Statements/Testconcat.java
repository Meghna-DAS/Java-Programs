import java.util.Scanner;

public class Testconcat{  
    public static void main(String args[]){  
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first word:");
	String s1=sc.next();
	
	System.out.println("Enter second word:");
	String s2=sc.next();
	
	
	System.out.println("First Word is :"+s1);

	System.out.println("Second Word is:"+s2);
	
   String s3=s1.concat(s2);  
   System.out.println("Concatenated String is:" + s3);
  }  
}  
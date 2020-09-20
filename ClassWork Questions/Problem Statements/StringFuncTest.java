import java.util.Scanner;
public class StringFuncTest
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter function to be performed(replace/concate/trim) :");
	String str=sc.nextLine();
	
	if(str.contains("concate"))
	{
		System.out.println("Enter first word:");
		String s1=sc.next();
	
		System.out.println("Enter second word:");
		String s2=sc.next();
	
	
		System.out.println("First Word is :"+s1);

		System.out.println("Second Word is:"+s2);
	
		String s3=s1.concat(s2);  
		System.out.println("Concatenated String is:" + s3);
		
	}
	
	
	else if(str.contains("trim"))
	{
		System.out.println("Enter word :");
		String a=sc.next();
		System.out.println(a.trim()); //With Trim
		
	}
	
	
	else if(str.contains("replace"))
	{
		System.out.println("Enter original string :");
		String r1=sc.nextLine();
	
		System.out.println("enter word to be found:");
		String key=sc.next();
					
		System.out.println("Enter replacing word:");
		String correction=sc.next();
				 
		r1=r1.replace(key,correction);
	
		System.out.println(r1);
		
		
	}
	
	else
	{
		System.out.println("Wrong string function entered");
	}
	}
}
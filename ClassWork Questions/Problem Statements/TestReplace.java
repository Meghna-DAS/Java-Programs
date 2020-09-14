import java.util.Scanner;
public class TestReplace
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter original string :");
	String str1=sc.nextLine();
	
	System.out.println("enter word to be found:");
	String key=sc.next();
					
	System.out.println("Enter replacing word:");
	String correction=sc.next();
				 
	str1=str1.replace(key,correction);
	
	System.out.println(str1);
	
	sc.close();
	}
}
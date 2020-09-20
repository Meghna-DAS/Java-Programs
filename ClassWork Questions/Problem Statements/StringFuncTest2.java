import java.util.Scanner;
public class StringFuncTest2
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter function to be performed(substring/indexof/lastindexof) :");
	String str=sc.nextLine();
	
	if(str.contains("substring"))
	{
		System.out.println("Enter first word:");
		String s1=sc.next();
		System.out.println("Enter starting character number to find substring :");
		int j=sc.nextInt();
		System.out.println("Enter ending character number to find substring :");
		int k=sc.nextInt();
		
		System.out.println("Output is : "+ s1.substring(j,k));
		System.out.println("Output is : "+ s1.substring(j));
		
	}
	
	
	else if(str.contains("indexof"))
	{
		System.out.println("Enter word :");
		String a=sc.next();
		System.out.println("Enter character to find index of :");
		String ch=sc.next();
		System.out.println("Enter index number to start searching from : ");
		int i=sc.nextInt();
		
		System.out.println("Output is : "+ a.indexOf(ch,i));
		
	}
	
	
	else if(str.contains("lastindexof"))
	{
		System.out.println("Enter original string :");
		String r1=sc.next();
		System.out.println("Enter character to search the last occurrence of :");
		String ch2=sc.next();
		
		System.out.println("Output is :" + r1.lastIndexOf(ch2)); 
		
	}
	
	else
	{
		System.out.println("Wrong string function entered");
	}
	}
}
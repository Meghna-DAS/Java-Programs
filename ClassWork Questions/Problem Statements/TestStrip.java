import java.util.Scanner;
public class TestStrip
{
    public static void main(String[] args) 
    {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter word :");
	String str=sc.nextLine();
	
		
	
    System.out.println(str.trim()); //With Trim
    }
}


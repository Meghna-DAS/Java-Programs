import java.util.*;
class stringfunc
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner (System.in);
		System.out.print("Enter the text:");
		String text=sc.nextLine();
		
		System.out.print("\nEnter word to be counted:");
		String word=sc.nextLine();
		int count=0;
		
		String a[]=text.split(" ");
		int count_sensitive=0, count_insensitive=0;
		for(int i=0; i<a.length;i++)
		{
			if(word.equals(a[i]))
			{
				count_sensitive++;
			}
			if (word.equalsIgnoreCase(a[i]))
			{
				count_insensitive++;
			}
		}
		System.out.print("Case sensitive word count: "+count_sensitive);
		System.out.print("\nCase insensitive word count: "+count_insensitive);
	}
}
		


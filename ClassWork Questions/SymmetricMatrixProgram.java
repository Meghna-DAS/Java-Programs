import java.util.Scanner;

public class SymmetricMatrixProgram
{	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no. of rows : ");
		
		int rows = sc.nextInt();
		
		System.out.println("Enter the no. of columns : ");
		
		int cols = sc.nextInt();
	
		
		//Checking the input matrix for symmetric
		
		if(rows != cols)
		{
			System.out.println("The given matrix is not a square matrix");
		}
		else
		{
			
			System.out.println("The given matrix is a square matrix");
		}
	}
}	
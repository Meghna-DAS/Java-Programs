import java.util.Scanner;
import java.lang.Math;
public class MathJavaClass {
 
    public static void main(String[] args) 
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value:");
		double a=sc.nextDouble();
		System.out.println("Square root of value is:" + Math.sqrt(a)); 
  
		System.out.println("Enter base value:");
		double base=sc.nextDouble();
        System.out.println("Enter exponent value:");
		double exponent=sc.nextDouble();
		
        System.out.println(base + " to the power of " + exponent + " that is " + Math.pow(base, exponent)); 
	
		System.out.println("Enter decimal value:");
		double d1=sc.nextDouble();
		System.out.println("Ceiling of " + d1 + "' = " + Math.ceil(d1));
		System.out.println("Floor of " + d1 + " = " + Math.floor(d1));
		System.out.println("Round off " + d1 + " = " + Math.round(d1));
		
	}
}
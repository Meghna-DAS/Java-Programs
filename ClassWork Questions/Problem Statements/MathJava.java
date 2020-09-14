import java.lang.Math;
public class MathJava {
 
    public static void main(String[] args) 
    {
        double a = 14641; 
		System.out.println("Given value is: "+ a);
		System.out.println("Square root of 14641 is:" + Math.sqrt(a)); 
  
		double base = 7; 
        double exponent = 4; 
		System.out.println("Given value is: "+ base);
		System.out.println("Given value is :"+ exponent);
        System.out.println(base + " to the power of " + exponent + " that is " + Math.pow(base, exponent)); 
	
	    double d1 = 1965234.5;
		System.out.println("Given value is :"+ d1);
		System.out.println("Ceiling of " + d1 + " = " + Math.ceil(d1));
		System.out.println("Floor of " + d1 + " = " + Math.floor(d1));
		System.out.println("Round off " + d1 + " = " + Math.round(d1));
	}
}